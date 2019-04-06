
public class TestCircle {

	public static void main(String[] args) {
		//First Iteration Checks
		System.out.println("FIRST ITERATION CHECKS:");
		Circle cir = new Circle(5);
		System.out.println(cir.getRadius());
		System.out.println(cir.getDiameter());
		System.out.println(cir.getCircumference());
		System.out.println(cir.getArea());
		
		Circle cir1 = new Circle(-55);
		System.out.println(cir1.getRadius());
		
		Circle cir2 = new Circle("-5");
		System.out.println(cir2.getRadius());
		
		//Second Iteration Checks
		System.out.println("SECOND ITERATION CHECKS:");
		Circle cir3 = new Circle(cir);
		System.out.println("copy constuctor: " + cir3.getRadius());
		
		Circle copy = cir.copy();
		System.out.println("copy: " + copy.getRadius());
		
		System.out.println("equal check: " + cir.equals(cir2));
		System.out.println("equal check: " + cir.equals(cir));
				
		System.out.println(cir.toString());
		System.out.println(cir2.toString());
		
		//Third Iteration Checks
		System.out.println("THIRD ITERATION CHECKS:");
	}

}
