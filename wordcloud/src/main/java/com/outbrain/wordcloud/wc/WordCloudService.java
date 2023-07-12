package com.outbrain.wordcloud.wc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import com.outbrain.wordcloud.wiki.WikipediaRepository;

@Service
public class WordCloudService {
    private final WordCloudClient wordCloudClient;
    private final WikipediaRepository wikipediaRepository;

    @Autowired
    public WordCloudService(final WikipediaRepository wikipediaRepository, final WordCloudClient wordCloudClient) {
        this.wordCloudClient = wordCloudClient;
        this.wikipediaRepository = wikipediaRepository;
    }

    public WordCloudRequest generateRandomNote() {
        WordCloudRequest wordCloudToCreate = new WordCloudRequest();
        return wordCloudToCreate;
    }
}
