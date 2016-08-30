
public class Rectangle implements Shape{
	
	private double length, width;
	
	public Rectangle(double length, double width){
		
		this.length = length;
		this.width = width;
		
	}
	
	public double getArea(){
		
		return length*width;
		
	}
	
	public double getPerimeter(){
		
		return (2*length)+(2*width);
		
	}

}

