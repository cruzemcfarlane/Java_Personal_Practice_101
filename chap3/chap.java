import java.util.Random;

public class chap
{    
    public static void main(String[] arg)
    {
        int num = 0;
        String name = new String("Cruze McFarlane");
        
        String fname1 = "Cruze";
        String fname2 = "Cruze";
        String lname = "McFarlane";
        
        Random gen = new Random();
        int num1;
        float num2;
        String vex = "Time101";
                
        System.out.println(num+"\r\t"+name +"\n"+name.length());
        
        if (fname1.compareTo(fname2) == 0)
        {
            System.out.println(fname1.concat(" "+lname));
            System.out.println(lname.charAt(0));
            System.out.println(fname2.indexOf("z"));
        }
        
        num1 = gen.nextInt();
        System.out.println("\nA random integer: " +num1);
        
        num1 = gen.nextInt(10);
        System.out.println("\nA random integer (0-9): " +num1);
        
        num1 = gen.nextInt(10) + 1;
        System.out.println("\nA random integer (1-10): " +num1);
        
        
        num1 = Integer.parseInt(vex.substring(4));
        System.out.println("\nVex: " +num1); 
        
        System.out.println(fname1.compareTo(lname)); 
    }
}