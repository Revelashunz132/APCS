//John Aston Adams
//11/6/22

package HomeworkUnit2;

import java.util.Scanner;

public class Triplets {
    private int upperlimit;
    private int[] ar;

    public Triplets(int u) {
        upperlimit = u;
        int array[] = new int[3 * upperlimit];
        for (int i = 1; i < upperlimit + 1; i++) {   
            array[i*3-3] = i;
            array[i*3-2] = i * i;
            array[i*3-1] = i * i * i;
        }
        ar = array;
    }

    public void getArray() {
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + ", ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an upper limit: ");
        Scanner kbReader = new Scanner(System.in);
        int limit = kbReader.nextInt();
        Triplets a = new Triplets(limit);
        a.getArray();
        kbReader.close();
    }
}
