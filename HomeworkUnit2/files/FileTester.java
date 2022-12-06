package HomeworkUnit2.files;

import java.io.*;
import java.util.*;

public class FileTester {
    public static void main (String[] args) throws IOException{
    Scanner sf = new Scanner (new File(".\\data\\.in"));
    int index = -1;
    String text[] = new String[10];
    while (sf.hasNextLine()) {
        index ++;
        text[i] = sf.nextLine();
    }
    for (String s: text){
        System.out.println(s);
    }
    sf.close();
    int dada[] = new int[10];
    Scanner st = new Scanner(text[3]);
    index =-1;
    while (st.hasNext()){
        index++;
        data[index] = st.nextInt();
    }
    for (int i:data){
        System.out.println(i);
    }
    st.close();
    }
}