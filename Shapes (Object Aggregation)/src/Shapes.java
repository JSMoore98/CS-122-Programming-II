/**
 * This class creates an object that holds
 * both a circle and rectangle object and
 * allow you to perform various functions
 * with them
 * @author Josiah Moore
 */
public class Shapes {

	//The fields for the circle and rectangle objects
	private Circle cir;
	private Rectangle rec;
	
	/**
	 * Constructor that takes two arguments
	 * @param c the Circle object
	 * @param r the Rectangle object
	 */
	public Shapes(Circle c, Rectangle r)
	{
		cir = new Circle(c.getRadius());
		rec = new Rectangle(r.getLength(),r.getWidth());
	}
	
	/**
	 * Copy constructor
	 * @param s The Shapes object to copy from
	 */
	public Shapes(Shapes s)
	{
		Circle c = s.getCircle();
		Rectangle r = s.getRectangle();
		cir = new Circle(c.getRadius());
		rec = new Rectangle(r.getLength(),r.getWidth()); 
	}
	
	/**
	 * Returns a copy of the Circle object
	 * @return the new Circle object
	 */
	public Circle getCircle()
	{
		return new Circle(cir.getRadius());
	}
	
	/**
	 * Returns a copy of the Rectangle object
	 * @return the new Rectangle object
	 */
	public Rectangle getRectangle()
	{
		return new Rectangle(rec.getLength(),rec.getWidth());
	}
	
	/**
	 * Compares two Shapes objects to see if the Circle and
	 * Rectangle are the same in terms of fields
	 * @param s The Shapes object to compare to
	 * @return Returns whether they are the same
	 */
	public boolean equals(Shapes s)
	{
		Circle c = s.getCircle();
		Rectangle r = s.getRectangle();
		if (cir.getRadius() == c.getRadius() && 
			rec.getWidth() == r.getWidth() && 
			rec.getLength() == r.getLength())
			return true;
		else
			return false;
	}
	
	/**
	 * Creates a copy of the Shapes object
	 * @return returns the new Shapes object
	 */
	public Shapes copy()
	{
		return new Shapes(new Circle(cir.getRadius()),
						  new Rectangle(rec.getLength(),
								        rec.getWidth()));
	}
	
	/**
	 * Returns the current status of the Shapes object
	 */
	public String toString()
	{
		 return cir.toString() + "\n" + rec.toString();
	}
	
	/**
	 * A static method that calculates the area of
	 * a circle from the given radius
	 * @param radius The radius given
	 * @return The calculated area
	 */
	public static double calcCircleArea(double radius)
	{
		return Math.PI * (radius * radius);
	}
	
	/**
	 * A static method that calculates the area of a
	 * recangle from a given length and width
	 * @param length The length given
	 * @param width The width given
	 * @return The calculated area
	 */
	public static double calcRecArea(double length, double width)
	{
		return length * width;
	}


}
