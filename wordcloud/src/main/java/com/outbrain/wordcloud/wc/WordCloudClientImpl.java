package com.outbrain.wordcloud.wc;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordCloudClientImpl implements WordCloudClient {

    public WordCloudApi api;

    @Autowired
    public WordCloudClientImpl() {
        this.api = Feign.builder().decoder(new GsonDecoder()).encoder(new GsonEncoder()).target(WordCloudApi.class, "https://quickchart.io");
    }

    @Override
    public String getWordCloud(String text) {
        return this.api.getWordCloud(text);
    }
}
