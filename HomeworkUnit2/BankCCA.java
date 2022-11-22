package unit2;

public class BankCCA {
    public static void main(String args[]) {
        String names[] = {"Mr. Shen", "Bob", "Jeremy", "Christine", "James", "Emily", "Aston", "Aiden",
                "Kyle", "Jacob", "Bryan", "Rapunzel", "Ellen", "Ethan", "Jennayce", "Kirat", "Leo" };
        BankAccount ba[] = new BankAccount[names.length];
        int id = 1000;
        double money = 9999.99;
        ba[0] = new BankAccount(id, names[0], money);
        System.out.println (ba[0]);
        // Part 1: instantiate the rest of the accounts in the array ba with increasing id, name from names, random money between 100 and 10000

        // Part 2: CCA gives a schoolaship of $1000 to all 'poor' students who has less than $500

        // Part 3: print a list of the account info

        // Part 4: CCA charges $2000 tuition to all students who can afford it 

        // Part 5: display the accounts that cannot afford the next tuition



    }

}
