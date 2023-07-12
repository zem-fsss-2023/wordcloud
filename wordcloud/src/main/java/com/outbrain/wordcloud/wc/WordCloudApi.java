package com.outbrain.wordcloud.wc;

import com.outbrain.wordcloud.wc.dto.WordCloudRequest;
import com.outbrain.wordcloud.wc.dto.WordCloudResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface WordCloudApi {
    @RequestLine("GET /wordcloud?text={text}")
    String getWordCloud(@Param("text") String text);

    @RequestLine("POST /wordcloud")
    @Headers({"Content-Type: application/json"})
    WordCloudResponse generateTask(WordCloudRequest wordcloudrequest);
}
