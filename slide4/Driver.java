import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Driver 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan1 = new Scanner(new File("slide4.txt"));
        Scanner scan2 = new Scanner(System.in);
        ArrayList<String> word = new ArrayList<String>();
        
        while(scan1.hasNext())
        {
            System.out.println(scan1.next());
        }
        
        System.out.println();
                
        for(int num1 = 0; num1 < 5; num1++)
        {
            System.out.print("\nEnter a word: ");
            word.add(scan2.nextLine());
        }
        
        System.out.print("\nEnter a word: ");
        word.add(0, scan2.nextLine());
        
        word.remove(word.size()-1);
        
        System.out.println();
        
        for(int num2 = 0; num2 < word.size(); num2++)
        {
            System.out.println(word.get(num2));
        }
    }
}