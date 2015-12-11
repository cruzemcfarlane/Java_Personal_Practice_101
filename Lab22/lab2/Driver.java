package lab2;

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        
        System.out.print("Enter first name: ");
        String fname = scan1.nextLine();
        
        System.out.print("\nEnter last name: ");
        String lname = scan1.nextLine();
        
        System.out.println("\nFull name: " + fname + " " + lname);
        
        lname = "Jones";
        
        System.out.println("\nFull name: " + fname + " " + lname);
        
        String email = fname + "." + lname + "@uwimona.edu.jm";
        email = email.toLowerCase();
        email =  email.replace(" ", "");
        
        if(email.contains("@uwimona.edu.jm") && email.substring(0, email.indexOf("@")).contains("."))
        {
            System.out.print("Valid email "); 
            
            System.out.println(email.substring(0, email.indexOf(".")) + " " 
            + email.substring(email.indexOf(".")+1, email.indexOf("@")) + "\n" + email.toString()); 
        }
        
        else
        {
             System.out.println("Invalid email!!"); 
        }
        
        int a = 12;
        int b = 9;
        int c = 10;
        double d = -14.678;
        
        System.out.println();
        System.out.println(Math.max(c, b));
        System.out.println(Math.pow(a, c));
        System.out.println(Math.abs(d));
    }
}