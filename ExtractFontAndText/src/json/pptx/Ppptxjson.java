package json.pptx;
import java.util.ArrayList;

public class Ppptxjson {
  private float height;
  private float width;
  private int slidenum;
  ArrayList<PptData> data = new ArrayList<PptData>();


 // Getter Methods 

  public float getHeight() {
    return height;
  }

  public float getWidth() {
    return width;
  }

  public int getSlidenum() {
		return slidenum;
	}

  public ArrayList<PptData> getData() {
	  return data;
  }
 // Setter Methods 

  public void setHeight( float height ) {
    this.height = height;
  }

  public void setWidth( float width ) {
    this.width = width;
  }


public void setSlidenum(int slidenum) {
	this.slidenum = slidenum;
}

public void setData(ArrayList<PptData> data) {
	this.data = data;
}
}