package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;
	
	public Cuboid(int iwidth, int ilenth, int idepth) {
		super(iwidth, ilenth);
		this.iDepth = idepth;
	}
	
	public int getDepth() {
		return iDepth;
	}
	public void setDepth(int new_Depth) {
		iDepth = new_Depth;
	}
	
	public double volume() {
		return  (iDepth * super.getWidth()*super.getLength());
		
	}
	@Override
	public double area() {
		return (2 * (super.getLength() * super.getWidth() + iDepth * super.getLength() + iDepth * super.getWidth()));
		
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	@Override
	public int compareTo(Object myObj) {
		Cuboid myCuboid_1 = (Cuboid) myObj;
		return Double.compare(myCuboid_1.area(),this.area());
	}
	class SortByArea implements Comparator<Cuboid>{
		SortByArea(){
			
		}
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return c1.compareTo(c2);
		}
	}
	class SortByVolume implements Comparator<Cuboid>{
		SortByVolume(){
			
		}
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume() - c2.volume());
		}
		
	}
}