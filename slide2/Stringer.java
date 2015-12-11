public class Stringer
{
    public static void main(String[] args)
    {
        String name = new String("Cruze McFarlane");
        String upper = name.toUpperCase();
        int numChar = name.length();
        name.replace(" ", "");
        String fname = name.substring(0, 5);
        String lname = name.substring(6);
        
        String full = fname.concat(lname);
        name += lname;
                       
        System.out.println(name);
        System.out.println(upper);
        System.out.println(numChar);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(full);
    }
}