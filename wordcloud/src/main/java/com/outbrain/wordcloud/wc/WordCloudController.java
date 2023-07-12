package com.outbrain.wordcloud.wc;

import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import com.outbrain.wordcloud.wiki.WikipediaRepository;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("api")
public class WordCloudController {

    private WikipediaRepository wikipediaRepository;
    private WordCloudClient wordCloudClient;
    private final Logger logger = LoggerFactory.getLogger(WordCloudClient.class.getName());
    private final Counter wordCloudCounter;
    private final Timer wordCloudTimer;

    public WordCloudController(WikipediaRepository wikipediaRepository, WordCloudClient wordCloudClient, final MeterRegistry meterRegistry) {
        this.wikipediaRepository = wikipediaRepository;
        this.wordCloudClient = wordCloudClient;
        this.wordCloudTimer = meterRegistry.timer("WordCloudController timer");
        this.wordCloudCounter = meterRegistry.counter("WordCloudController counter");

    }

    @GetMapping("wc") //http://localhost:8080/api/wc?text=blabla insert text here blabla
    public byte[] wordCloudTextEndpoint(@RequestParam String text) throws IOException {
        long startTime = System.currentTimeMillis();
        logger.info("Called wordCloudTextEndpoint with text=" + text.substring(0, (Math.min(text.length(), 50))));
        wordCloudCounter.increment();
        byte[] response = wordCloudClient.getWordCloud(text).body().asInputStream().readAllBytes();
        wordCloudTimer.record(System.currentTimeMillis()-startTime, TimeUnit.MILLISECONDS);
        return response;
    }

    @PostMapping("wc") //http://localhost:8080/api/wiki
    public byte[] wordCloudParamEndpoint(@RequestBody WordCloudRequest request) throws IOException {

        return wordCloudClient.getWordCloud(request).body().asInputStream().readAllBytes();
    }
}