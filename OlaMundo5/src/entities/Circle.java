package entities;

public class Circle extends AbstractShape{
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		radius = 3.14 * radius * radius;
		return radius;
	}

	@Override
	public String toString() {
		return "" + super.toString() + "Circle [radius=" + area() + "]";
	}
}
