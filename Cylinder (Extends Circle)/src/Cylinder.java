/**
 * This class is a Cylinder object that extends a Circle object
 * and allows you to perfom various functions with it
 * @author Josiah Moore
 *
 */
public class Cylinder extends Circle {

	private double height;
	
	/**
	 * This is a constructor that uses doubles for the fields
	 * @param h The Cylinder height
	 * @param r The Circle radius
	 */
	public Cylinder(double h, double r)
	{
		super(r);
		if (h < 0)
		{
			h = 0;
		}
		height = h;
	}
	
	/**
	 * This is a constructor that uses Strings for the fields
	 * @param strH The Cylinder height
	 * @param r The Circle radius
	 */
	public Cylinder(String strH, String r)
	{
		super(r);
		
		double h = Double.parseDouble(strH);
		
		if (h < 0)
		{
			h = 0;
		}
		height = h;
	}
	
	/**
	 * This is a copy constructor that uses another Cylinder object
	 * @param obj The Cylinder object to copy from
	 */
	public Cylinder(Cylinder obj)
	{
		super(obj.getRadius());
		height = obj.height;
	}
	
	/**
	 * This method accesses the height
	 * @return Returns the height
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * This calculates the volume of the cylinder
	 * @return Returns the volume
	 */
	public double getVolume()
	{
		double volume = height*(getRadius()*getRadius())*Math.PI; 
		return volume;
	}
	
	/**
	 * This calculates the surface area of the cylinder
	 * @return Returns the surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = (2*Math.PI*height*getRadius()) 
				           + (2*Math.PI*height*getRadius()); 
		return surfaceArea;
	}
	
	/**
	 * This compares two Cylinder objects and returns a boolean
	 * if they have the equal fields
	 * @param obj The Cylindetr object to compare to
	 * @return Returns the boolean
	 */
	public boolean equals(Cylinder obj)
	{
		boolean equal;
		if (getRadius() == obj.getRadius() && height == obj.height)
			equal = true;
		else
			equal = false;
		return equal;
	}
	
	/**
	 * This method takes the Cylinder object and creates a new copy
	 * @return Returns the new Cylinder copy
	 */
	public Cylinder copy()
	{
		Cylinder cy = new Cylinder(height,getRadius());
		return cy;
	}
	
	/**
	 * This method changes the toString method
	 * to display the height and radius of the object
	 * @return Returns the string
	 */
	public String toString()
	{
		String str = "Cylinder: \nheight: " + height + 
				     "\nCircle radius: " + getRadius();
		return str;
	}

}
