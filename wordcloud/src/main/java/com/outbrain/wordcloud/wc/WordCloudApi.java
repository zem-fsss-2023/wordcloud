package com.outbrain.wordcloud.wc;

import feign.Param;
import feign.RequestLine;
import feign.Response;

public interface WordCloudApi {
    @RequestLine("GET /wordcloud?text={text}")
    Response getWordCloud(@Param("text") String text);
}
