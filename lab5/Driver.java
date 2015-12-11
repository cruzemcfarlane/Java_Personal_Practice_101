import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        double[] grades = new double[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < grades.length; i++)
        {
            System.out.print("Enter grade: ");
            grades[i] = scan.nextDouble();            
        }
        
        System.out.println();
        
        for(double count: grades)
        {
             System.out.println(count);
        }
        
        System.out.println();
        
        int start = 0;
        int stop = grades.length;
        
        while(start < stop)
        {
            System.out.println(grades[--stop]);
        }
        
        System.out.println();
        
        for(int i = 0; i < grades.length; i++)
        {
            if((grades[i] >= 47) && (grades[i] <= 49))
            {
                grades[i] = 50;
            }
            
            if((grades[i] >= 67) && (grades[i] <= 69))
            {
                grades[i] = 70;
            }
            
            System.out.println(grades[i]);
        }
        
        System.out.println();
        
        System.out.println("Average: " + ArrayStat.average(grades));
    }
}