package com.outbrain.wordcloud.wc;

import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import feign.Response;

public interface WordCloudClient {
    //WordCloudApi api;

    Response getWordCloud(String text);

    Response getWordCloud(WordCloudRequest request);

}
