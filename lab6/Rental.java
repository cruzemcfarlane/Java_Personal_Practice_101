import java.util.*;

public class Rental
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
        
        vehicle.add(new Vehicle("Benz", 2015, 3, "S-Class4_You", 2000, 6, 800, 280000));
        vehicle.add(new Vehicle("Range", 2014, 3, "DFTAWNV14666", 3500, 6, 2800, 345000));
        vehicle.add(new Vehicle("BMW", 2013, 3, "NVWIOFG29881", 1500, 4, 810, 123400));
        vehicle.add(new Vehicle("Lexus", 2012, 3, "VXZWQO3459II", 1200, 5, 987, 176892));
        vehicle.add(new Vehicle("Prado", 2011, 3, "ASDFGHJ98543", 2235, 3, 1000, 52552));
        System.out.println(vehicle.toString());
        
        (vehicle.get(1)).calculateValue(21, 2600);
        (vehicle.get(3)).calculateValue(33);
        
        System.out.println();
        
        System.out.print(vehicle.toString());
    }
}