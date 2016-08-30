import static org.junit.Assert.*;
import java.util.Random;

import org.junit.Test;

public class ShapeTester {

	@Test
	//test perimeter and area of 10 randomly generated circles
	public void testCircle() {
		
		int[] testRad = new int[10];
		Random random = new Random();
		for(int i=0; i<10; i++){
			testRad[i] = random.nextInt(100);
		}
		
		for(int testValue : testRad){
			Circle circle = new Circle(testValue);
			double area = Math.PI*(testValue*testValue);
			assertEquals(area, circle.getArea(), 0.001);
			
			double perimeter = 2*Math.PI*testValue;
			assertEquals(perimeter, circle.getPerimeter(), 0.001);
		}
	}
	
	@Test
	//test perimeter and area of 10 randomly generated triangles
	public void testTriangle() {
		
		double[] test1 = new double[10];
		double[] test2 = new double[10];
		double[] test3 = new double[10];
		Random random = new Random();
		
		for(int i=0; i<10; i++){
			test1[i] = random.nextInt(100);
			test2[i] = random.nextInt(100);
			test3[i] = random.nextInt(100);
		}
		
		for(int i=0; i<10; i++){
			Triangle triangle = new Triangle(test1[i], test2[i], test3[i]);
			double p = (test1[i]+test2[i]+test3[i])/2;
			double area = Math.sqrt(p*(p-test1[i])*(p-test2[i])*(p-test3[i]));
			assertEquals(area, triangle.getArea(), 0.001);
			
			double perimeter = test1[i]+test2[i]+test3[i];
			assertEquals(perimeter, triangle.getPerimeter(), 0.001);
		}
		
	}
	
	@Test
	//test perimeter and area of 10 randomly generated rectangles
	public void testRectangle() {
		
		int[] testLengths = new int[10];
		int[] testWidths = new int[10];
		Random random = new Random();
		for(int i=0; i<10; i++){
			testLengths[i] = random.nextInt(100);
			testWidths[i] = random.nextInt(100);
		}
		
		for(int i=0; i<10; i++){
			Rectangle rectangle = new Rectangle(testLengths[i], testWidths[i]);
			double area = testLengths[i]*testWidths[i];
			assertEquals(area, rectangle.getArea(), 0.001);
			
			double perimeter = testLengths[i]+testLengths[i]+testWidths[i]+testWidths[i];
			assertEquals(perimeter, rectangle.getPerimeter(), 0.001);
		}
	}
	
	
	
	
	

}

