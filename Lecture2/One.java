public class One
{
    public static void main (String[] arg)
    {
        String title = new String ("Java Software Solutions");
        int numChars = title.length();
        char c1;
        char c2;
        int pos1;
        int post2;
        System.out.println(title.toUpperCase());
        System.out.println(title.replace('a','o'));
        System.out.println(title.substring(5,13));
        System.out.println(title.concat(" Yea"));
        System.out.print(numChars);       
    }
}