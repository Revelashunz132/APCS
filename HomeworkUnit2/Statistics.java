//John Aston Adams
//10/24/22

package HomeworkUnit2;

import java.util.Arrays;

public class Statistics {
    private int range;
    private int total = 0;
    private int[] ar;

    public Statistics(int r){
        range = r;
        int[] array = new int[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
            System.out.println(array[i]);
            total += array[i];
            ar = array;
        }
    }

    public double average(){
        return (double) total / ar.length;
    }

    public int largest(){
        Arrays.sort(ar);
        return (ar[999]);
    }

    public int[] distribution(){
        int[] distribution = new int[21];
        for (int i = 0; i < ar.length; i++){
            if (ar[i] <= 50){
                distribution[0] = distribution[0] + 1;
            }
            else if (ar[i] <=100 && ar[i] > 50){
                distribution[1] = distribution[1] + 1;
            }
            else if (ar[i] <=150 && ar[i] > 100){
                distribution[2] = distribution[2] + 1;
            }
            else if (ar[i] <=200 && ar[i] > 150){
                distribution[3] = distribution[3] + 1;
            }
            else if (ar[i] <=250 && ar[i] > 200){
                distribution[4] = distribution[4] + 1;
            }
            else if (ar[i] <=300 && ar[i] > 250){
                distribution[5] = distribution[5] + 1;
            }
            else if (ar[i] <=350 && ar[i] > 300){
                distribution[6] = distribution[6] + 1;
            }
            else if (ar[i] <=400 && ar[i] > 350){
                distribution[7] = distribution[7] + 1;
            }
            else if (ar[i] <=450 && ar[i] > 500){
                distribution[8] = distribution[8] + 1;
            }
            else if (ar[i] <=500 && ar[i] > 450){
                distribution[9] = distribution[9] + 1;
            }
            else if (ar[i] <=550 && ar[i] > 500){
                distribution[10] = distribution[10] + 1;
            }
            else if (ar[i] <=550 && ar[i] > 600){
                distribution[11] = distribution[11] + 1;
            }
            else if (ar[i] <=600 && ar[i] > 550){
                distribution[12] = distribution[12] + 1;
            }
            else if (ar[i] <=650 && ar[i] > 600){
                distribution[13] = distribution[13] + 1;
            }
            else if (ar[i] <=700 && ar[i] > 650){
                distribution[14] = distribution[14] + 1;
            }
            else if (ar[i] <=750 && ar[i] > 700){
                distribution[15] = distribution[15] + 1;
            }
            else if (ar[i] <=800 && ar[i] > 750){
                distribution[16] = distribution[16] + 1;
            }
            else if (ar[i] <=850 && ar[i] > 800){
                distribution[17] = distribution[17] + 1;
            }
            else if (ar[i] <=900 && ar[i] > 850){
                distribution[18] = distribution[18] + 1;
            }
            else if (ar[i] <=950 && ar[i] > 900){
                distribution[19] = distribution[19] + 1;
            }
            else if (ar[i] <=1000 && ar[i] > 950){
                distribution[20] = distribution[20] + 1;
            }
        }
        return distribution;
    }

    public static void main(String[] args){
        Statistics a = new Statistics(1000);
        System.out.println("Average = " + a.average());
        System.out.println("Largest = " + a.largest());
        System.out.println("Distribution = " + Arrays.toString(a.distribution()));

        
    }
}

