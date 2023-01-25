//John Aston Adams
//1/16/22

//package unit3;

import java.util.Arrays;


public class Nim {
    int[] piles, sums;

    public Nim(int[] p){
        piles = p;
        sums = new int[4];
    }
    
    public void analyze(){
        for(int i = 0; i < piles.length; i++){
            for(int j = 0; j < 4; j++){
                sums[j] += (piles[i] >> j) & 1; //the binary number of each index of the piles will be added to the corresponding index of the sums array
            }
        }
        
    }

    public int whichPile(){
        int bit = sums.length -1;
        while (bit >= 0 && sums[bit] % 2 == 0){
            bit --;
        }
        if (bit < 0){
            return -1;
        }
        for (int i = 0; i < piles.length; i++){
            if (((piles[i] >> bit) & 1) == 1){
                return i;
            }
        }
        return 0;
    }

    public int[] getSums(){
        return sums;
    }

    public static void main (String args[]){
        Nim game1 = new Nim(new int[]{8,1,9});
        game1.analyze();
        System.out.println(Arrays.toString(game1.getSums()));
        System.out.println(game1.whichPile());
    }
}
