import java.io.*;
import java.util.Scanner;

public class TestGlossary
{
    public static void main(String[] args) throws Exception
    {
        Glossary myGlossary = new Glossary("glossary.txt"); //create a Glossary object        
        System.out.println(myGlossary); //Display the object
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter the word to see occurences: ");
        String occur = scan.nextLine();
        
        System.out.println("Occurences: " + myGlossary.occurences(occur));
        
        System.out.print("\nEnter word to delete: ");
        String del = scan.nextLine();
        
        System.out.println("Times deleted: " + myGlossary.prune(del));
        System.out.println();
        
        System.out.println(myGlossary.toString());
    }
}