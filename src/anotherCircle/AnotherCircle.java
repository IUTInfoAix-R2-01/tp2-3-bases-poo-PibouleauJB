package anotherCircle;

public class AnotherCircle {
	private double radius;
	public AnotherCircle() {
		radius = 1.0;
	}
	public AnotherCircle(double r) {
		radius = r;
	}
	public double getRadius() {
		radius = 1.0;
		return radius;
		
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
	    return radius*radius*Math.PI;
		
	}
	public double getCircumference() {
	    return 2*radius*Math.PI;
		
	}
	public String toString() {
	    return ("radius = " + radius);
		
	}

}