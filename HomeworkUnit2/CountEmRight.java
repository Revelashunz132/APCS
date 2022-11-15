//John Aston Adams
//10/25/22

package HomeworkUnit2;

import java.util.*;

public class CountEmRight {
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Type in a sentence and press ENTER. ");
        String a = kbReader.nextLine().toUpperCase().replaceAll("\\s", "");
        if (a.equals("EXIT")){
            System.out.println("\n");
        }
        else{
            a = (a + "X");
            String sp[] = a.split("SA");
            int occurences = sp.length - 1;
            if (occurences == 1){
                System.out.println("There is " + occurences + " occurence.");
            }
            else{
                System.out.println("There are " + occurences + " occurences.");
            }
            
        }
        kbReader.close();
    }
}
