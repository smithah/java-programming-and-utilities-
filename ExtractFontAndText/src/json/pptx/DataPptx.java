package json.pptx;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"height",
"width",
"data"
})

public class DataPptx {

@JsonProperty("height")
private Double height;
@JsonProperty("width")
private Double width;
@JsonProperty("data")
private List<Datum> data;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("height")
public Double getHeight() {
return height;
}

@JsonProperty("height")
public void setHeight(double height) {
this.height = height;
}

@JsonProperty("width")
public Double getWidth() {
return width;
}

@JsonProperty("width")
public void setWidth(double width) {
this.width = width;
}

@JsonProperty("data")
public List<Datum> getData() {
return data;
}

@JsonProperty("data")
public void setData(List<Datum> data) {
this.data = data;
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