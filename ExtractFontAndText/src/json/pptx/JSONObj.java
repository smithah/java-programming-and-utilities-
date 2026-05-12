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


public class JSONObj {

@JsonProperty("slidenum")
private int slidenum;
@JsonProperty("DataPptx")
private DataPptx dpt;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("slidenum")
public int getSlidenum() {
return slidenum;
}

@JsonProperty("slidenum")
public void setSlidenum(int slidenum) {
this.slidenum = slidenum;
}

@JsonProperty("DataPptx")
public DataPptx getDataPptx() {
return dpt;
}

@JsonProperty("DataPptx")
public void setDataPptx(DataPptx dpt) {
this.dpt = dpt;
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
