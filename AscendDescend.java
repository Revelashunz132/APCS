//John Aston Adams
//11/20/22

package HomeworkUnit2;

import java.util.Arrays;

public class AscendDescend {
    public static void main(String[] args) {
        String[] sa = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(sa);
        String[] as = new String[sa.length];
        for (int i = 0; i < as.length; i++){
            as[i] = sa[9-i];
        }
        System.out.println("Ascend\tDescend\n");
        for (int j = 0; j < as.length; j++) {
            System.out.println(sa[j] + "\t" + as[j]);
        }
        }
}

