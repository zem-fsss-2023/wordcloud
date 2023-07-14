package com.outbrain.wordcloud.wc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("case")
    @JsonProperty("case")
    String _case = "upper";   // upper, lower or none
    String removeStopwords = "true";
    String cleanWords = "true";
    String language = "en";
    String useWordList = "false";
    String text = "Tuki je neki tekst, string blablablabla in tako naprej. Pogledava samo če dela.";
    String colors = "[\"0096D2\",\"#4C2882\",\"#00ECB7\",\"#E72199\",\"#8769D6\"]";

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

    public WordCloudRequest(String format, String loadGoogleFonts, Integer width, Integer height, String backgroundColor, String fontFamily, String fontWeight, Integer fontScale, String scale, Integer padding, Integer rotation, Integer maxNumWords, Integer minWordLength, String _case, String removeStopwords, String cleanWords, String language, String useWordList, String text, String colors) {
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
        this._case = _case;
        this.removeStopwords = removeStopwords;
        this.cleanWords = cleanWords;
        this.language = language;
        this.useWordList = useWordList;
        this.text = text;
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
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

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public Integer getMaxNumWords() {
        return maxNumWords;
    }

    public void setMaxNumWords(Integer maxNumWords) {
        this.maxNumWords = maxNumWords;
    }

    public Integer getMinWordLength() {
        return minWordLength;
    }

    public void setMinWordLength(Integer minWordLength) {
        this.minWordLength = minWordLength;
    }

    public String get_case() {
        return _case;
    }

    public void set_case(String _case) {
        this._case = _case;
    }

    public String getRemoveStopwords() {
        return removeStopwords;
    }

    public void setRemoveStopwords(String removeStopwords) {
        this.removeStopwords = removeStopwords;
    }

    public String getCleanWords() {
        return cleanWords;
    }

    public void setCleanWords(String cleanWords) {
        this.cleanWords = cleanWords;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUseWordList() {
        return useWordList;
    }

    public void setUseWordList(String useWordList) {
        this.useWordList = useWordList;
    }
}
