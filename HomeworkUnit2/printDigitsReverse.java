//John Aston Adams
//10/16/22

package HomeworkUnit2;



public class printDigitsReverse {

    private double num;

    public printDigitsReverse(double n) {
        num = n;
    }
        
    public void printDigits(){
        double digit = num % 10;
        if (num == 0){
            return;
        }
        else{
            num /= 10;
            System.out.println((int)digit);
            printDigits();
            
        }
        

    }


    public static void main (String args[]) {
        printDigitsReverse d = new printDigitsReverse (1234);
        d.printDigits();

    }

}
