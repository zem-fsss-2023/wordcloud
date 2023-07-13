package com.outbrain.wordcloud.wc.dto;

public class WordCloudRequest {
    String format = "svg";
    String loadGoogleFonts = "";
    Integer width = 1000;
    Integer height = 1000;
    String backgroundColor = "transparent";
    String fontFamily = "sans-serif";
    String fontWeight = "normal";
    Integer fontScale = 25;
    String scale = "linear";
    Integer padding = 1;
    Integer rotation = 20;
    Integer maxNumWords = 200;
    Integer minWordLength = 3;
    String case_UL = "upper";   // upper, lower or none
    String removeStopwords = "true";
    String cleanWords = "true";
    String language = "en";
    String useWordList = "false";
    String text = "Tuki je neki tekst, string blablablabla in tako naprej. Pogledava samo če dela.";

    public WordCloudRequest() {
    }

    public WordCloudRequest(String text) {
        this.text = text;
    }

    public WordCloudRequest(String format, Integer width, Integer height, String fontFamily, String loadGoogleFonts, Integer fontScale,
            String scale, String text) {
        this.format = format;
        this.width = width;
        this.height = height;
        this.fontFamily = fontFamily;
        this.loadGoogleFonts = loadGoogleFonts;
        this.fontScale = fontScale;
        this.scale = scale;
        this.text = text;
    }

    public WordCloudRequest(String format, String loadGoogleFonts, Integer width, Integer height, String backgroundColor, String fontFamily, String fontWeight, Integer fontScale, String scale, Integer padding, Integer rotation, Integer maxNumWords, Integer minWordLength, String case_UL, String removeStopwords, String cleanWords, String language, String useWordList, String text) {
        this.format = format;
        this.loadGoogleFonts = loadGoogleFonts;
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontScale = fontScale;
        this.scale = scale;
        this.padding = padding;
        this.rotation = rotation;
        this.maxNumWords = maxNumWords;
        this.minWordLength = minWordLength;
        this.case_UL = case_UL;
        this.removeStopwords = removeStopwords;
        this.cleanWords = cleanWords;
        this.language = language;
        this.useWordList = useWordList;
        this.text = text;
    }

    public String getLoadGoogleFonts() {
        return loadGoogleFonts;
    }

    public void setLoadGoogleFonts(String loadGoogleFonts) {
        this.loadGoogleFonts = loadGoogleFonts;
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
