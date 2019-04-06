public class Test 
{
    public static void main(String[] args)
    {
        Cylinder cy = new Cylinder("5","6");
        System.out.println(cy.toString());
        
        Cylinder cy1 = new Cylinder(cy);
        System.out.println(cy1.toString());
        System.out.println(cy1.getVolume());
        System.out.println(cy1.getSurfaceArea());
        System.out.println(cy1.equals(cy));
        
        Cylinder cy2 = new Cylinder(cy1);
        System.out.println(cy2.toString());

    }
}