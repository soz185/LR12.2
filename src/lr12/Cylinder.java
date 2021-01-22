package lr12;

public class Cylinder extends Vector {
    private double height;
    public static int countOfCylinder;
    public Cylinder() { super(0, 0, 0); height = 0; countOfCylinder++; }
    public Cylinder(double X, double Y, double Z, double h) { super(X, Y, Z); height = h; countOfCylinder++; }


    public double Volume()
    {
        double volume = height * length() * length() * 3.14;
        return volume;
    }
    static int getCountOfSphere()
    {
        return countOfCylinder;
    }

        public String ToString()
        {
            String str = X + " " + Y + " " + Z + " " + height;
            return str;
        }

}
