package questao1;

public class Retangulo {
    private double width;
    private double height;
    
    public Retangulo(double width, double height) {
    	super();
    	this.width = width;
    	this.height = height;
    }
    
    public double area(double height) {
    	return width * height;
    }
    public double perimeter(double height) {
    	return (width + height)*2;
    }
    public double diagonal(double width, double height) {
    	return Math.sqrt(this.width * width + this.height * height);
    }
}
