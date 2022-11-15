//John Aston Adams
//10/24/22

package HomeworkUnit2;

import java.util.Arrays;

public class StatisticsV2 {
    private int range;
    private int total = 0;
    private int[] ar;

    public StatisticsV2(int r) {
        range = r;
        int[] array = new int[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
            System.out.println(array[i]);
            total += array[i];
            ar = array;
        }
    }

    public double average() {
        return (double) total / ar.length;
    }

    public int largest() {
        Arrays.sort(ar);
        return (ar[999]);
    }

    public int[] distribution() {
        int[] distribution = new int[20];
        for (int i = 0; i < ar.length; i++) {
            int ind = distribution[ar[i] / 50];
            if (ind == 1000){
                distribution[20]++;
            }
            else{
                distribution[ar[i] / 50]++;
            }
        }
        return distribution;
    }

    public static void main(String[] args) {
        StatisticsV2 a = new StatisticsV2(1000);
        System.out.println("Average = " + a.average());
        System.out.println("Largest = " + a.largest());
        System.out.println("Distribution = " + Arrays.toString(a.distribution()));

    }
}
