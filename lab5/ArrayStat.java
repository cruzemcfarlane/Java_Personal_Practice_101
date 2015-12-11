
/**
 * This class has static methods that accept an array as parameter(s).
 * 
 * @Alfred Nonymous 
 * @1.00
 */
public class ArrayStat
{
    /**
     * Static method to compute the average of the values in an array
     * @param a an array of values
     * @return the average of the values in the array
     */
    public static double average(double a[]) {
        double result = 0;
        
        for(double count: a)
        {
            result += count;
        }
        
        return result/a.length;
    }


}