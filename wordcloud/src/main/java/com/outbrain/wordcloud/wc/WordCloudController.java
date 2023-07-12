package com.outbrain.wordcloud.wc;

import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import com.outbrain.wordcloud.wiki.WikipediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api")
public class WordCloudController {

    private WikipediaRepository wikipediaRepository;
    private WordCloudClient wordCloudClient;
    private final Logger logger = LoggerFactory.getLogger(WordCloudClient.class.getName());

    public WordCloudController(WikipediaRepository wikipediaRepository, WordCloudClient wordCloudClient) {
        this.wikipediaRepository = wikipediaRepository;
        this.wordCloudClient = wordCloudClient;

    }

    @GetMapping("wc") //http://localhost:8080/api/wc?text=blabla insert text here blabla
    public byte[] wordCloudTextEndpoint(@RequestParam String text) throws IOException {
        logger.info("Called wordCloudTextEndpoint with text=" + text.substring(0, (Math.min(text.length(), 50))));
        return wordCloudClient.getWordCloud(text).body().asInputStream().readAllBytes();
    }

    @PostMapping("wc") //http://localhost:8080/api/wiki
    public byte[] wordCloudParamEndpoint(@RequestBody WordCloudRequest request) throws IOException {

        return wordCloudClient.getWordCloud(request).body().asInputStream().readAllBytes();
    }
}