/**
 * This class creates a circle object via a number or string,
 * And provides the ability to use methods to find the radius,
 * circumference, diameter, and area.
 * @author jmoore44
 *
 */

public class Circle 
{
	//Creates the radius variable
	private double radius;
	
	/**
	 * This is a no-arg constructor and sets the radius to 0
	 */
	public Circle()
	{
		radius = 0;
	}
	
	/**
	 * This method sets the radius to the given number
	 * @param r is the number given
	 */
	public Circle(double r)
	{
		if (r < 0)
		{
			r = 0;
		}
		radius = r;
	}
	
	/**
	 * This method sets the radius to the given string 
	 * and converts it to a number
	 * @param str is the string given
	 */
	public Circle(String str)
	{
		double numStr = Double.parseDouble(str);
		if (numStr < 0)
		{
			numStr = 0;
		}
		radius = numStr;
	}
	
	/**
	 * This method creates as new circle object
	 * that's a copy of another circle object
	 * @param obj the circle object to be copied
	 */
	public Circle(Circle obj)
	{
		radius = obj.radius;
	}
	
	/**
	 * This method returns the radius
	 * @return the radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * This method returns the diameter of the circle
	 * @return the diameter
	 */
	public double getDiameter()
	{
		return (radius * 2);
	}
	
	/**
	 * This method returns the circumference of the circle
	 * @return the circumference
	 */
	public double getCircumference()
	{
		double circum = 2 * radius * Math.PI;
		return circum;
	}
	
	/**
	 * This method returns the area of the circle
	 * @return the area
	 */
	public double getArea()
	{
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	/**
	 * This method creates a new Circle object
	 * that is a copy of the one given
	 * @param obj The object that's copied
	 * @return returns the new copy object
	 */
	public Circle copy()
	{
		Circle cir = new Circle(radius);
		return cir;
	}
	
	/**
	 * This method compares two Circle objects
	 * and returns a boolean for whether
	 * or not they have the same fields
	 * @param object2 The object it's compared against
	 * @return Returns the boolean value
	 */
	public boolean equals(Circle object2)
	{
		boolean equal = false;
		
		if (radius == object2.radius)
			equal = true;
		else
			equal = false;
		
		return equal;
	}
	
	/**
	 * This method changes the toString method
	 * to display the radius of the object
	 * @return Returns the string
	 */
	public String toString()
	{
		String str = "Circle radius: " + radius;
		return str;
	}
}
