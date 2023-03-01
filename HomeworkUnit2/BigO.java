import java.util.*;

public class BigO{
    public static void main (String args[]){
        int[] ai = new int[20];
        for(int i = 0; i < ai.length; i++){
            ai[i] = (int) (Math.random() * 100 + 1);
            System.out.print (ai[i] + " ");
        }
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 1-100");
        int n = kb.nextInt();
        for (int i = 0; i < ai.length; i++){
            if (i == n) {
                System.out.println("Yes");
                break;
            }
            if (i == ai.length - 1){
                System.out.println("No");
            }
        }
        for (int i = 0; i < ai.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < ai.length; j++){
                if (ai[j] < ai[min]){
                    min = j;
                }
            }
            int temp = ai[i];
            ai[i] = ai[min];
            ai[min] = temp;
        }
        for (int nn: ai){
            System.out.print(nn + " ");
        }
        
        kb.close();
    }
}
