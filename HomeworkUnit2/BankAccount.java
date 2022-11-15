//John Aston Adams
//11/12/22

package HomeworkUnit2;

public class BankAccount {
    private int AccountNumber;
    private String OwnerName;
    private double AccountBalance;

    public BankAccount(int number, String name, double balance) { //Constructor to instantiate an account objects
        AccountNumber = number;
        OwnerName = name;
        AccountBalance = balance;
    }

    public double getBalance(){ //return the account balance
        return AccountBalance;
    }

    public double deposit(double amnt){ //to deposite amnt to the account, new balance is returned
        AccountBalance += amnt;
        return AccountBalance;
    }

    public double withdraw(double amnt){ //to withdrw amnt from the account, new balance is returned (-1 if not enough money, and balanve is not changed)
        if (AccountBalance >= amnt){
            AccountBalance -= amnt;
            return AccountBalance;
        }
        return -1;
    }
    public static void main(String[] args){
        BankAccount member1 = new BankAccount(0000001, "Steve", 6728);
        System.out.println(member1.getBalance());
        System.out.println(member1.deposit(3366));
        System.out.println(member1.withdraw(9829822));
        System.out.println(member1.withdraw(2411));
    }
}
