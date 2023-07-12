package com.outbrain.wordcloud.wiki;

import com.outbrain.wordcloud.wc.WordCloudClient;
import com.outbrain.wordcloud.wiki.dto.WikipediaData;
import com.outbrain.wordcloud.wiki.dto.WikipediaRelations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("api")
    public class WikipediaController {

        private WikipediaRepository wikipediaRepository;
        private WordCloudClient wordCloudClient;
        private final Logger logger = LoggerFactory.getLogger(WordCloudClient.class.getName());

        public WikipediaController(WikipediaRepository wikipediaRepository, WordCloudClient wordCloudClient) {
            this.wikipediaRepository = wikipediaRepository;
            this.wordCloudClient = wordCloudClient;

        }

        @GetMapping("wikidata") //http://localhost:8080/api/wiki?title=blabla
        public WikipediaData wikiDataEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0);
        }

        @GetMapping("relations") //http://localhost:8080/api/wiki?title=blabla
        public WikipediaRelations wikiRelationsEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0).relations();
        }

        @GetMapping("wiki") //http://localhost:8080/api/wiki?title=blabla
        public List<String> wikiTextEndpoint(@RequestParam String title) {

            return wikipediaRepository.findByTitle(title).get(0).parsedParagraphs();
        }
}
