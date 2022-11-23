//John Aston Adams
//11/22/22

package unit2;

public class BankCCA {
    public static void main(String args[]) {
        String names[] = {"Mr. Shen", "Bob", "Jeremy", "Christine", "James", "Emily", "Aston", "Aiden",
                "Kyle", "Jacob", "Bryan", "Rapunzel", "Ellen", "Ethan", "Jennayce", "Kirat", "Leo" };
        BankAccount ba[] = new BankAccount[names.length];
        int id = 1000;
        double money = 9999.99;
        ba[0] = new BankAccount(id, names[0], money);
        for (int i = 1; i < ba.length; i++) {
            ba[i] = new BankAccount(id + i, names[i], Math.random() * (9901) + 100);
        }
        for (int j = 0; j < ba.length; j++) {
            if (ba[j].balance < 500){
                ba[j].deposit(1000);
            }
        System.out.println (ba[0]);
        for (int i = 1; i < ba.length; i++) {
            System.out.println (ba[i]);
        }
        for (int l = 1; l < ba.length; l++) {
            if (ba[l].balance < 2000){
                System.out.println(ba[l].nameOwner + " cannot afford tuiton");
            }
        for (int k = 1; k < ba.length; k++) {
            if (ba[k].balance >= 2000){
                ba[k].withdraw(2000);
            }
        }
// Everything looks like it should work, I don't know why some things don't run and why it prints so many of times

        // Part 1: instantiate the rest of the accounts in the array ba with increasing id, name from names, random money between 100 and 10000

        // Part 2: CCA gives a schoolaship of $1000 to all 'poor' students who has less than $500

        // Part 3: print a list of the account info

        // Part 4: CCA charges $2000 tuition to all students who can afford it 

        // Part 5: display the accounts that cannot afford the next tuition



    }
        }
    }
}

