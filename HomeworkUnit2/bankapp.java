import java.util.ArrayList;
import java.util.Scanner;
import HomeworkUnit2.BankAccount;


public class BANKAPP{
    public static void main (String[] args0){
        ArrayList<BankAccount> aryLst = new ArrayList<BankAccount>();
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Enter the name of the account holder: ");
            String name = kb.next();
            if (name.equals("EXIT")) break;
            System.out.print("Enter the balance of the account ");
            double money = kb.nextDouble();
        }
        while(true);
        kb.close();
        //BankAccount ba = ;
        double max = ba.getBalance();
        String maxName = ba.getName();
        for (int j = 1; j < aryLst.size(); j++){
            
        }
    }
}