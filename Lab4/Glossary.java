import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Glossary
{
    private ArrayList<String> words;
    
    public Glossary()
    {
        words = new ArrayList<String>();
        words.add("I");
        words.add("Really");
        words.add("Love");
        words.add("This");
        words.add("Shit");
        
        words.add(0, "alpha");
    }
    
    public Glossary(String file) throws IOException
    {
        words = new ArrayList<String>();
        Scanner scan = new Scanner(new File(file));
        
        while(scan.hasNext())
        {
            words.add(scan.next());
        }
    }
    
    public String toString()
    {
        int start = 0;
        int stop = words.size();
        String result = "";
        
        while(start < stop)
        {
            result += words.get(start) + "\n";
            start++;
        }
        
        return result;
    }
    
    public int occurences(String word)
    {
        int start = 0;
        int stop = words.size();
        int times = 0;
        
        while(start < stop)
        {
            if((this.words.get(start)).equalsIgnoreCase(word))
            {
                times++;
            }
            start++;
        }
        
        return times;
    }
    
    public int prune(String word)
    {
        int start = 0;
        int stop = words.size();
        int times = 0;
        
        while(start < stop)
        {
            if((this.words.get(start)).equalsIgnoreCase(word))
            {
                words.remove(start);
                times++;
                stop--;
            }
            start++;            
        }
        
        return times;
    }
}