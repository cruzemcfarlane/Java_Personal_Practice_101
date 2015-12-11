import java.text.NumberFormat;

public class Vehicle
{
    private String make;
    private int year;
    private Engine info;
    private double mileage;
    private double value;
    
    public Vehicle(String make, int year, Engine info, double mileage, double value)
    {
        this.make = make;
        this.year = year;
        this.info = info;
        this.mileage = mileage;
        this.value = value;        
    }
    
    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.year = year;
    }
    
    public String toString()
    {
         NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
         return "\nVehicle Information:" + "\nMake: " + make + "\nYear: " + year + info.toString() 
               + "\nMileage: " + mileage + "\nValue: " + fmt.format(value) + "\n";
    }
    
     public void calculateValue(int rate, int newMileage)
    {
        value = value - ((rate/100.0) * (newMileage - mileage));
        mileage = newMileage;
    }
    
    public void calculateValue(int rate)
    {
        value = value - ((rate/100.0) * value);
    }
}