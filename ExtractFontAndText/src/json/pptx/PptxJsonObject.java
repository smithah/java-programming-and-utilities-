package json.pptx;

import java.util.ArrayList;

public class PptxJsonObject {
	private ArrayList<Ppptxjson> ppt = new ArrayList<Ppptxjson>();
	
	
	public ArrayList<Ppptxjson> getPptxJSON() {
	    return ppt;
	  }

	
	public ArrayList<Ppptxjson> setPptxJSON(ArrayList<Ppptxjson> ppt) {
	    return this.ppt = ppt;
	  }


}
