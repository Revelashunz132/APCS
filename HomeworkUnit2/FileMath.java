//John Aston Adams
//12/8/22

package HomeworkUnit2;

import java.io.*; // necessary for File and IOException
import java.util.*; // necessary for Scanner

public class FileMath{
    public static void main(String args[]) throws IOException{
        Scanner kb = new Scanner(new File("./HomeworkUnit2/data1.in"));
        int maxIndx = -1;
        String text[] = new String[1000]; 
        while(kb.hasNext( )){
        maxIndx++;
        text[maxIndx] = kb.nextLine();
}
    kb.close( ); 
    for(int j = 0; j <= maxIndx; j++){
        Scanner ls = new Scanner(text[j]);
        int a = ls.nextInt();
        char op = ls.next().charAt(0);
        int b = ls.nextInt();
        if (op == '+'){
            System.out.println(text[j] + " = " + (a + b));
        }
        else if (op == '-'){
            System.out.println(text[j] + " = " + (a - b));
        }
        else if (op == '*'){
            System.out.println(text[j] + " = " + (a * b));
        }
        else if (op == '/'){
            System.out.println(text[j] + " = " + (a / b));
        }
        else if (op == '%'){
            System.out.println(text[j] + " = " + (a % b));
        }
        else{
            System.out.println(text[j]);
        }
        ls.close();

    }
}
}