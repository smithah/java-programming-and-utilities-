package json.pptx;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"original_text",
"translated_text",
"font_size",
"font_family",
"font_color",
"font_color_hex",
"font_style",
"left",
"top",
"end_left",
"end_top"
})

public class Datum {

@JsonProperty("original_text")
private String originalText;
@JsonProperty("translated_text")
private String translatedText;
@JsonProperty("font_size")
private Double fontSize;
@JsonProperty("font_family")
private String fontFamily;
@JsonProperty("font_color")
private Integer fontColor;
@JsonProperty("font_color_hex")
private String fontColorHex;
@JsonProperty("font_style")
private String fontStyle;
@JsonProperty("left")
private Double left;
@JsonProperty("top")
private Double top;
@JsonProperty("end_left")
private Double endLeft;
@JsonProperty("end_top")
private Double endTop;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("original_text")
public String getOriginalText() {
return originalText;
}

@JsonProperty("original_text")
public void setOriginalText(String originalText) {
this.originalText = originalText;
}

@JsonProperty("translated_text")
public String getTranslatedText() {
return translatedText;
}

@JsonProperty("translated_text")
public void setTranslatedText(String translatedText) {
this.translatedText = translatedText;
}

@JsonProperty("font_size")
public Double getFontSize() {
return fontSize;
}

@JsonProperty("font_size")
public void setFontSize(Double fontSize) {
this.fontSize = fontSize;
}

@JsonProperty("font_family")
public String getFontFamily() {
return fontFamily;
}

@JsonProperty("font_family")
public void setFontFamily(String fontFamily) {
this.fontFamily = fontFamily;
}

@JsonProperty("font_color")
public Integer getFontColor() {
return fontColor;
}

@JsonProperty("font_color")
public void setFontColor(Integer fontColor) {
this.fontColor = fontColor;
}

@JsonProperty("font_color_hex")
public String getFontColorHex() {
return fontColorHex;
}

@JsonProperty("font_color_hex")
public void setFontColorHex(String fontColorHex) {
this.fontColorHex = fontColorHex;
}

@JsonProperty("font_style")
public String getFontStyle() {
return fontStyle;
}

@JsonProperty("font_style")
public void setFontStyle(String fontStyle) {
this.fontStyle = fontStyle;
}

@JsonProperty("left")
public Double getLeft() {
return left;
}

@JsonProperty("left")
public void setLeft(Double left) {
this.left = left;
}

@JsonProperty("top")
public Double getTop() {
return top;
}

@JsonProperty("top")
public void setTop(Double top) {
this.top = top;
}

@JsonProperty("end_left")
public Double getEndLeft() {
return endLeft;
}

@JsonProperty("end_left")
public void setEndLeft(Double endLeft) {
this.endLeft = endLeft;
}

@JsonProperty("end_top")
public Double getEndTop() {
return endTop;
}

@JsonProperty("end_top")
public void setEndTop(Double endTop) {
this.endTop = endTop;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}