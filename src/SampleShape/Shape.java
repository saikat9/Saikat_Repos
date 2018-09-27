package SampleShape;

public class Shape {
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = (length>0)?length:1;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = (width>0)?width:1;
	}

	public int CalculateArea() {
		int Area= length*width;
		return Area;
	}

}
