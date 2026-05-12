package extractor.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.JsonParser;

import json.pptx.*;

public class ExtractorUtility {
	
	public static void objectToJsonPptx(Object obj) throws Exception {
		ObjectMapper om = new ObjectMapper();
		
		//om.setSerializationInclusion(Include.NON_NULL);
		
		om.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        try {

            // convert Java object to JSON strings and save it to file `person.json`
            om.writeValue(new File("PPTXJSON.json"), obj);
            ExtractorUtility.removeJSONElement();
           } catch (IOException e) {
            throw new RuntimeException(e);
        }


	}
	
	
	public static void removeJSONElement() throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
	    try( FileReader reader = new FileReader("PPTXJSON.json"))
	    {
	    	JsonNode rootNode = objectMapper.readTree(reader);
	    	((ObjectNode) rootNode).remove("slidenum");
	    	objectMapper.writeValue(new File("PPTXJSON.json"), rootNode);
	    }
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } 
	    
	    
	}

	
}
