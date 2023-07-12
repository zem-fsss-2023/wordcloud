package com.outbrain.wordcloud.wc.dto;

public class WordCloudRequest {
    String format = "png";
    Integer width = 1000;
    Integer height = 1000;
    String fontFamily = "sans-serif";
    Integer fontScale = 15;
    String scale = "linear";
    String text = "Tuki je neki tekst, string blablablabla in tako naprej. Pogledava samo če dela.";

    public WordCloudRequest() {
    }

    public WordCloudRequest(String text) {
        this.text = text;
    }

    public WordCloudRequest(String format, Integer width, Integer height, String fontFamily, Integer fontScale,
            String scale, String text) {
        this.format = format;
        this.width = width;
        this.height = height;
        this.fontFamily = fontFamily;
        this.fontScale = fontScale;
        this.scale = scale;
        this.text = text;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Integer getFontScale() {
        return fontScale;
    }

    public void setFontScale(Integer fontScale) {
        this.fontScale = fontScale;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
