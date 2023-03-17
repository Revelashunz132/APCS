//John Aston Adams
//3/16/22

import java.util.*;

public class Knapsack {
    public static void main (String[] args) {
        int[] bricks = {12, 4, 5, 2};
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println ("Total: " + knapsack(15, bricks, 0));
        System.out.println(list);
    }
    private static int knapsack(int weight, int[] bricks, int startingNum) {
        // basic cases:
        if (weight == 0) return 0; // nothing
        if  (startingNum == bricks.length-1) { // last brick
            if (bricks[startingNum] <= weight) return bricks[startingNum]; // take it
            return 0; // don't take it
        }
        // recursion
        int wo = knapsack(weight, bricks, startingNum+1); // i not included
        if (bricks[startingNum] > weight){
        return wo; // cannot include i
        }
        int w = bricks[startingNum] + knapsack(weight-bricks[startingNum], bricks, startingNum+1); // include i
        return list; // take the larger
    }


}

