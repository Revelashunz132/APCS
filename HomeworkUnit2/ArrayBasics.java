//John Aston Adams
//10/30/22

package HomeworkUnit2;


public class ArrayBasics {
    public static void main(String[] args){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = array.length - 1; i > 0; i--){
            sum += array[i];
        }
        System.out.println(sum);

        System.out.format("Average = %.2f\n" , (double) sum/array.length);

        String[] sa = {"dow", "ab", "sdfs", "weiuhrf", "wiuehd", "sdowe8ru"};
        for (int i = sa.length - 1; i>=1; i--){
            if (sa[i].compareTo(sa[i-1]) < 0){
                String temp = sa[i];
                sa[i] = sa[i-1];
                sa[i-1] = temp;
            }
        }
        for (String s: sa){
            System.out.println(s);
        }
    }
}


