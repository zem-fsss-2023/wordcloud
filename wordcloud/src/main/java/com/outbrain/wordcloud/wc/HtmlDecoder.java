package com.outbrain.wordcloud.wc;

import org.springframework.context.annotation.Bean;

public class HtmlDecoder {

    /*@Bean
    public Decoder feignDecoder() {
        return (response, type) -> {
            String bodyStr = Util.toString(response.body().asReader(Util.UTF_8));
            JavaType javaType = TypeFactory.defaultInstance().constructType(type);
            return new ObjectMapper().readValue(bodyStr, javaType);
        };
    }*/
}
