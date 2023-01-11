//John Aston Adams
//1/20/22

//package unit1;

public class FormatExamples {
    public static void main (String[] args) {
        double foo = (double)8000/3;
        System.out.format ("This is %,10.2f %,d %-10s\n", foo, 400000000, "good");
        //This is   2,666.67 400,000,000 good 
        String s = String.format ("This is %10.2f%% %02d %-10s\n", foo, 4, "good");
        System.out.println(s);
        //This is    2666.67% 04 good
        //////////////////////////////////////////////////////////////
        // MODIFIED 26-15. a table with four columns looks like: 
        // 07012     $1,000,123.34     65.4%       08:14

        int num[] = {7012, 26, 729, 23453, 98};
        double money[] = {1000123.34, 187.91, 571267.03, 890, 38759.5};
        int time[] = {814, 1106, 1452, 35, 1406};

        // print the table header
        System.out.format("%5s %13s %23s %20s\n", "Number", "Money", "Percentage", "Time");
        
        double total = 0;
        for (int i=0; i< num.length; i++) {
            total += money[i];
            double percentage = (money[i] / total) * 100;
            String timeStr = String.format("%02d:%02d", time[i]/60, time[i]%60);
            System.out.format("$%1d %,15.2f %20.1f%% %22s\n", num[i], money[i], percentage, timeStr);
        }
    }
}