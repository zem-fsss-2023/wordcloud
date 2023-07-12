package com.outbrain.wordcloud.wiki;

import com.outbrain.wordcloud.wc.WordCloudClient;
import com.outbrain.wordcloud.wc.WordCloudClientImpl;
import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import com.outbrain.wordcloud.wiki.dto.WikipediaData;
import com.outbrain.wordcloud.wiki.dto.WikipediaRelations;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

    @RestController
    @RequestMapping("api")
    public class WikipediaController {

        private WikipediaRepository wikipediaRepository;
        private WordCloudClient wordCloudClient;

        public WikipediaController(WikipediaRepository wikipediaRepository, WordCloudClient wordCloudClient) {
            this.wikipediaRepository = wikipediaRepository;
            this.wordCloudClient = wordCloudClient;

        }

        @GetMapping("wc") //http://localhost:8080/api/wc?text=blabla insert text here blabla
        public byte[] wordCloudTextEndpoint(@RequestParam String text) throws IOException {

            return wordCloudClient.getWordCloud(text).body().asInputStream().readAllBytes();
        }

        @PostMapping ("wc") //http://localhost:8080/api/wiki
        public byte[] wikiDataEndpoint(@RequestBody WordCloudRequest request) throws IOException {

            return wordCloudClient.getWordCloud(request).body().asInputStream().readAllBytes();
        }

        @GetMapping("wiki") //http://localhost:8080/api/wiki?title=blabla
        public WikipediaData wikiDataEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0);
        }

        @GetMapping("relations") //http://localhost:8080/api/wiki?title=blabla
        public WikipediaRelations wikiRelationsEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0).relations();
        }

        @GetMapping("wikitext") //http://localhost:8080/api/wiki?title=blabla
        public List<String> wikiTextEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0).parsedParagraphs();
        }
}
