package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLenth) {
		this.iWidth = iWidth;
		this.iLength =  iLenth;
	}
	
	public int getLength() {
		return iLength;
	
	}
	public int getWidth() {
		return iWidth;
	}
	
	public void setLength(int Length) {
		this.iLength = Length;
	}
	
	public void setWidth(int Width) {
		this.iWidth = Width;
	}
	
	
	@Override
	public double area() {
		return   (iWidth * iLength);
		
	}
	@Override
	public double perimeter() {
		return (2*iWidth + 2*iLength);
	}
	public int compareTo(Object myObject) {
		Rectangle myRec_1 = (Rectangle) myObject;
		return(Double.compare(this.area(),myRec_1.area()));
	}

}