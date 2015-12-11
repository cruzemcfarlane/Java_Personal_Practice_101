import java.util.Scanner;

public class MyAtm
{
    public static void main(String[] args)
    {
        Account savingUsainBolt = new Account("CUST1001", 1000);
        Account chequingUsainBolt = new Account("CUST1002", 1100);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String op = "";
       
        System.out.println("\t\tWELCOME TO MY ATM");
        System.out.println();
        
        System.out.println("\tDS - Deposit to Savings Account");
        System.out.println("\tDC - Deposit to Chequing Account");        
        System.out.println();
        
        System.out.println("\tWS - Withdraw from Savings Account");
        System.out.println("\tWC - Withdraw from Chequing Account");
        System.out.println();
        
        System.out.println("\tTS - Transfer to Savings Account");
        System.out.println("\tTC - Transfer to Chequing Account");
        System.out.println();
        
        System.out.println("\tIS - Interest on Savings Account");
        System.out.println("\tIC - Interest on Chequing Account");
        System.out.println();
        
        System.out.println("\tBL - Display Account Balances");
        System.out.println();
        
        System.out.println("\tQ - Quit the program");
        
        while(!op.equalsIgnoreCase("q")){
        System.out.print("\nSelect an option -> ");
        op = scan1.nextLine();
        
        if(op.equalsIgnoreCase("bl"))
        {
            System.out.println("\nSavings Account: " + (savingUsainBolt.toString()));
            System.out.println("\nChequing Account: " + (chequingUsainBolt.toString()));
        }
        
        else if(op.equalsIgnoreCase("q"));        
        
        
        else
        {
            System.out.print("Enter amount: ");
            double amt = scan2.nextDouble();
            
            if(op.equalsIgnoreCase("ds"))
            {
                savingUsainBolt.deposit(amt);                
                System.out.println("\nSavings Account: " + (savingUsainBolt.toString())); 
            }
            
            else if(op.equalsIgnoreCase("dc"))
            {
                chequingUsainBolt.deposit(amt);
                System.out.println("\nChequing Account: " + (chequingUsainBolt.toString()));
            }
            
            else if(op.equalsIgnoreCase("ws"))
            {
                savingUsainBolt.withdraw(amt);
                System.out.println("\nSavings Account: " + (savingUsainBolt.toString())); 
            }
            
            else if(op.equalsIgnoreCase("wc"))
            {
                chequingUsainBolt.withdraw(amt);
                System.out.println("\nChequing Account: " + (chequingUsainBolt.toString()));
            }
            
            else if(op.equalsIgnoreCase("ts"))
            {
                savingUsainBolt.deposit(amt);
                chequingUsainBolt.withdraw(amt);
                System.out.println("\nSavings Account: " + (savingUsainBolt.toString()));
                System.out.println("\nChequing Account: " + (chequingUsainBolt.toString()));
            }
            
            else if(op.equalsIgnoreCase("tc"))
            {
                chequingUsainBolt.deposit(amt);
                savingUsainBolt.withdraw(amt);
                System.out.println("\nChequing Account: " + (chequingUsainBolt.toString()));
                System.out.println("\nSavings Account: " + (savingUsainBolt.toString()));
            }
            
            else if(op.equalsIgnoreCase("is"))        
            {
                savingUsainBolt.accumulateInterest(amt);
                System.out.print( "\nSavings Account: " + savingUsainBolt.toString() + "\n");
            }
            
            else if(op.equalsIgnoreCase("ic"))
            {
                chequingUsainBolt.accumulateInterest(amt);
                System.out.print("\nChequing Account: " + chequingUsainBolt.toString() + "\n");
            }
            
            else
            {
                System.out.println("\nError!!!!\n");
            }
        }
        }
    }
}