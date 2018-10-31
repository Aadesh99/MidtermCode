package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import pkgShape.Cuboid.SortByArea;

public class ShapeTest {

	@Test
	public void CuboidconstructorTest() {
		Cuboid c1 = new Cuboid(2,3,4);
		Assert.assertEquals(true, c1 instanceof Cuboid);
	}
	
		
	
	@Test
	public void gettersTest() {
		Cuboid c = new Cuboid(2,5,6);
		Assert.assertTrue((c.getDepth()==6)&&(c.getLength()==5)&&(c.getWidth()==2));
	}
	@Test
	public void settersTest() {
		Cuboid c = new Cuboid(2,3,4);
		c.setWidth(5);
		c.setLength(6);
		c.setDepth(7);
		Assert.assertTrue((c.getDepth()==7)&&(c.getLength()==6)&&(c.getWidth()==5));
	}
	@Test
	public void volTest() {
		Cuboid myCube = new Cuboid(2,4,5);
		assertEquals(myCube.volume(),40);
	}
	
	@Test
	public void areaTest() {
		Cuboid myCube = new Cuboid(2,2,2);
		assertEquals(myCube.area(), 24);
	}
	@Test
	public void perimeterThrowsUnsupportedOperationExceptionTest() {
		try{
			Cuboid c1 = new Cuboid(2,4,5);
			c1.perimeter();
		}
		catch(UnsupportedOperationException e) {
			
		}
	}
	@Test 
	public void sortByAreaTest() {
		Cuboid c1 = new Cuboid(2,4,5);
		Cuboid c2 = new Cuboid(7,8,9);
		
		SortByArea mySort = c1.new SortByArea();
		
		Assert.assertTrue(mySort.compare(c2, c1) < 0);
		Assert.assertTrue(mySort.compare(c1, c2) >=0);
		Assert.assertTrue(mySort.compare(c1, c1) == 0);
	}
	@Test
	public void sortByVolumeTest() {
		Cuboid c = new Cuboid(1,2,3);
		Cuboid c2 = new Cuboid(4,6,7);
		Cuboid c3 = new Cuboid(5,7,8);
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(c);
		cubes.add(c2);
		cubes.add(c3);
		Collections.sort(cubes, c.new SortByVolume());
		Cuboid[] cube = {c, c2, c3};
		assertArrayEquals(cube,cubes.toArray());
	}

@Test
public void constructorTest() {
	Rectangle R1 = new Rectangle(4,5);
	Assert.assertEquals(true, R1 instanceof Rectangle);
}


@Test
public void getLenTest() {
	Rectangle R1 = new Rectangle(4,5);
	Assert.assertEquals(5,R1.getLength());
}
@Test
public void setLenTest() {
	Rectangle R1 = new Rectangle(7,8);
	R1.setLength(4);
	assertTrue(4 == R1.getLength());
}
@Test
public void getWidTest() {
	Rectangle R1 = new Rectangle(4,5);
	Assert.assertEquals(4,R1.getWidth());
}


@Test
public void setWidTest() {
	Rectangle R1 = new Rectangle(7,8);
	R1.setWidth(6);
	Assert.assertTrue(6 == R1.getWidth());
}
@Test
public void areaTest1() {
	Rectangle R1 = new Rectangle(4,5);
	Assert.assertTrue(20== R1.area());
}
@Test
public void perimeterTest() {
	Rectangle R1= new Rectangle(4,5);
	Assert.assertTrue(18== R1.perimeter());
}
@Test
public void compareTest() {
	Rectangle r1 = new Rectangle(2,2);
	Rectangle r2 = new Rectangle(3,3);
	Rectangle r3 = new Rectangle(2,2);
	Rectangle r4 = new Rectangle(1,1);
	assertEquals(0,r1.compareTo(r3));
	assertEquals(-1,r1.compareTo(r2));
	assertEquals(1,r1.compareTo(r4));
	
}
}
