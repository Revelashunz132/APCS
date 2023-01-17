//John Aston Adams
//1/16/22

//package unit3;

import java.util.Arrays;


public class Nim {
    int[] piles, sums;

    public Nim(int[] p){
        piles = p;
        sums = new int[4];
        for(int i = 0; i < piles.length; i++){
            for(int j = 0; j < 4; j++){
                sums[j] += (piles[i] >> j) & 1; //the binary number of each index of the piles will be added to the corresponding index of the sums array
            }
        }
        
    }

    public int[] getSums(){
        return sums;
    }

    public static void main (String args[]){
        Nim game1 = new Nim(new int[]{7,8,9});
        System.out.println(Arrays.toString(game1.getSums()));
    }
}
