package json.pptx;

public class PptData {
	  private String original_text;
	  private float translated_text;
	  private Double font_size;
	  private String font_family;
	  private int font_color;
	  private String font_color_hex;
	  private String font_style;
	  private Double left;
	  private Double top;
	  private Double end_left;
	  private Double end_top;
	  
	  
	// Getter Methods 

	  public String getOriginalText() {
	    return original_text;
	  }

	  public float getTranslatedText() {
	    return translated_text;
	  }
	  
	  public Double getFontSize() {
			return font_size;
		}

		public String getFontFamily() {
			return font_family;
		}
		
		public int getFontColor() {
			return font_color;
		}
		
		public String getFontColorHex() {
			return font_color_hex;
		}
		
		public String getFontStyle() {
			return font_style;
		}
		
		public Double getLeft() {
			return left;
		}
	  
		public Double getTop() {
			return top;
		}
		
		public Double getEndLeft() {
			return end_left;
		}
		
		public Double getEndTop() {
			return end_top;
		}	  

	 // Setter Methods 

	  public void setOriginalText( String original_text ) {
	    this.original_text = original_text;
	  }

	  public void setTranslatedText( float translated_text ) {
	    this.translated_text = translated_text;
	  }
	  
	  public void setFontSize(Double font_size) {
			this.font_size = font_size;
		}

	  public void setFontFamily(String font_family) {
		this.font_family = font_family;
	  }

	public void setFontColor(int font_color) {
		this.font_color = font_color;
	}

	public void setFontColorHex(String font_color_hex) {
		this.font_color_hex = font_color_hex;
	}

	

	public void setFontStyle(String font_style) {
		this.font_style = font_style;
	}

	

	public void setLeft(Double left) {
		this.left = left;
	}

	

	public void setEndLeft(Double end_left) {
		this.end_left = end_left;
	}

	
	public void setTop(Double top) {
		this.top = top;
	}

	

	public void setEndTop(Double end_top) {
		this.end_top = end_top;
	}

	
	  

}
