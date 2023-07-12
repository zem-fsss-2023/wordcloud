package com.outbrain.wordcloud.wc;

import feign.Param;
import feign.RequestLine;

public interface WordCloudApi {
    @RequestLine("GET /wordcloud?text={text}")
    String getWordCloud(@Param("text") String text);
}
