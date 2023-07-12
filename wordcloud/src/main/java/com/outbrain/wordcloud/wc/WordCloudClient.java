package com.outbrain.wordcloud.wc;

import feign.Response;

public interface WordCloudClient {
    //WordCloudApi api;

    Response getWordCloud(String text);

}
