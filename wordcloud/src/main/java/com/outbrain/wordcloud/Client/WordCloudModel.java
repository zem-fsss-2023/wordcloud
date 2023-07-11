package com.outbrain.wordcloud.Client;


public record WordCloudModel(
        String id,
        String object,
        Long created,
        String owned_by
) {}