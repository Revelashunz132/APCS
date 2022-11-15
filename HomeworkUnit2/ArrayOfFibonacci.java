//John Aston Adams
//11/8/22

package HomeworkUnit2;

import java.util.Scanner;

public class ArrayOfFibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the # of Fibonacci numbers: ");
        Scanner kbReader = new Scanner(System.in);
        int limit = kbReader.nextInt();
        int[] Fibonacci = new int[limit];
        Fibonacci[0] = 1;
        Fibonacci[1] = 1;
        for (int i = 2; i < limit; i++){
            Fibonacci[i] = Fibonacci[i - 2] + Fibonacci[i -1];
        }
        for (int i = 0; i < limit; i++){
            System.out.print(Fibonacci[i] + ",");
        }
        kbReader.close();
    }
}
