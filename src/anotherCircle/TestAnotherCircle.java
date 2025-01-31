package anotherCircle;

public class TestAnotherCircle {
	   public static void main(String[] args) {
		   AnotherCircle ac1 = new AnotherCircle(1.1);
		   System.out.println(ac1);
		   AnotherCircle ac2 = new AnotherCircle();
		   System.out.println(ac2);
		   
		   ac1.setRadius(2.2);
		   System.out.println(ac1);
		   System.out.println("radius is: " + ac1.getRadius());
		   System.out.println("area is: " + ac1.getArea());
		   System.out.println("circumference is: " + ac1.getCircumference());
	   }
}
