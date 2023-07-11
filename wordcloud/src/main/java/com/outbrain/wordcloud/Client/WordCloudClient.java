package com.outbrain.wordcloud.Client;

import org.springframework.stereotype.Service;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

@Service 
public class WordCloudClient {
    WordCloudApi api;

    public WordCloudClient() {
        this.api = Feign.builder().decoder(new GsonDecoder()).encoder(new GsonEncoder()).target(WordCloudApi.class, "https://quickchart.io");
    }

    public String getWordCloudImpl(String text){
        return this.api.getWordCloud(text);
    }
    
}
