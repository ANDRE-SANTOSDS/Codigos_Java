package entities;

public class Rectangle extends AbstractShape{
	private double width;
	private double height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		
		return width * height;
	}

	
	@Override
	public String toString() {
		return ""+super.toString()+"Rectangle [width=" + width + ", height=" + height +"area="+area()+"]";
	}
}
