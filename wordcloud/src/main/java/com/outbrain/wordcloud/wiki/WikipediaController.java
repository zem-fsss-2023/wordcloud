package com.outbrain.wordcloud.wiki;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("api")
    public class WikipediaController {

        private WikipediaRepository wikipediaRepository;

        public WikipediaController(WikipediaRepository wikipediaRepository) {
            this.wikipediaRepository = wikipediaRepository;
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
