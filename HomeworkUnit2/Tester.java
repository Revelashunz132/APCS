//John Aston Adams
//1/24/23

package HomeworkUnit2;
//package unit3;

public class Tester {
    public static void main(String[] args) {
       int cirCount = 0;
       int sqrCount = 0;    
       MonteCarlo mcObj = new MonteCarlo(5,3,2);
       for (int i = 0; i < 1000; i++){
          boolean bool = mcObj.insideCircle(mcObj.nextRainDrop_x(), mcObj.nextRainDrop_y());
            if (bool){
               cirCount++;
            }
            sqrCount++;
       }
       System.out.println(4 * (double) cirCount / sqrCount);
    }
}

/*
100 = 3.12
1000 = 3.088
10000 = 3.156 
100000 = 3.224
*/
