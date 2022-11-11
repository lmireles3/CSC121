//Luis Mieles Lmireles3@toromail.csudh.edu

public class Rectangle {
	
	
	private int Width;
	private int Height;

	
	
	public Rectangle(int WH, int HT) {
		Width = WH;
	    Height = HT;	
		
	}
				
	
	public Rectangle () {}


	public int getWidth() {
		return Width;
	}


	public void setWidth(int width) {
		Width = width;
	}


	public int getHeight() {
		return Height;
	}


	public void setHeight(int height) {
		Height = height;
	}
	
	
	public int computeArea() {
	
	return Width * Height ;
	
	}
	
	public String toString() {
		
		return    " Area : " + computeArea() ;
	}
		
	public boolean equals(Object o) {
		Rectangle c = (Rectangle)o ;
		
		

		return c.Height == Height && 
			   c.Width == Width ;
		
		
	
	
	

}
}
