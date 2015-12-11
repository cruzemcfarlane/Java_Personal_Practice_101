import java.util.Scanner;

public class Driver
{
    enum Season {Summer, Winter, Autumn, Spring}
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int  time;
        
        
        System.out.print("Enter season number: ");
        time = scan.nextInt();
        
        System.out.println();
        
        if(time == 0)
             System.out.print(Season.Summer);
             
        else if(time == 1)
             System.out.print(Season.Winter);
             
        else if(time == 2)
             System.out.print(Season.Autumn);
             
        else if(time == 3)
             System.out.print(Season.Spring);
             
        else
             System.out.print("Invalid");
    }
}