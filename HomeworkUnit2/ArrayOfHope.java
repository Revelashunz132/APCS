//John Aston Adams
//11/7/22

package HomeworkUnit2;

public class ArrayOfHope {
    public static void main(String[] args) {
        char[] ch = new char[26];
        String str = ("HOPE");
        for (int i = 65; i <= 90; i++) {
            ch[i - 65] = (char) (i);
        }
        int[] code = new int[str.length()];
        for (int j = 0; j < code.length; j++) {
            code[j] = str.charAt(j) - 'A';
        }
        for (int k = 0; k < code.length; k++) {
            System.out.print(ch[code[k]]);
        }
        System.out.println();
        int shift = 3;
        for (int l = 0; l < code.length; l++) {
            code[l] = (code[l] + shift) % 26;
        }
        for (int m = 0; m < code.length; m++) {
            System.out.print(ch[code[m]]);
        }
    }
}
