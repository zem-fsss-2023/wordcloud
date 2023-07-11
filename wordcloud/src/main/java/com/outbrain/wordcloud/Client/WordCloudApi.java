package com.outbrain.wordcloud.Client;

import feign.Param;
import feign.RequestLine;

public interface WordCloudApi {
    @RequestLine("GET /wordcloud?text={text}")
    String getWordCloud(@Param("text") String text);
}
