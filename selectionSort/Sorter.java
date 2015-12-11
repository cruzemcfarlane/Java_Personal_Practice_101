import java.util.ArrayList;

public class Sorter
{
    public static void main(String[] args)
    {
       int i, k, temp1, temp2, temp3;
        
       ArrayList<Integer> num = new ArrayList<Integer> (4);
       
       num.add(3);
       num.add(9);
       num.add(6);
       num.add(1);
       num.add(2);
        
       for(i = 0; i <= num.size(); i++)
       {
           for(k = 0; k <= num.size(); k++)
           {
               if(num.get(i) > num.get(k))
               {
                  temp1 = num.get(k);
                  temp2 = k;
               }
              
              
           }
           
           temp3 = num.get(i);
           num.add(i, temp1); 
           num.add(temp2, temp3);
       }
    }
}