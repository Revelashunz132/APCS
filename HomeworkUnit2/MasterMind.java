//John Adams
//11/1/22

package HomeworkUnit2;
    
import java.util.Scanner;

public class MasterMind {
    private char[] cha;
    private static int numGuess; //the objects do not need to know how many guesses you are on
    private String keyword;
    final static String[] wordPool = {"JESUS", "WORLD", "BOBBY", "ADAMS", "EMILY"};
    
    public MasterMind(){
        int i = (int) (Math.random() * wordPool.length);
        String word = wordPool[i];
        keyword = word;
        cha = new char[word.length()];
        for (int j = 0; j < word.length(); j++){
            cha[j] = word.charAt(j);
        }
        numGuess = 1;
    }
    
    private String getKeyword() {
        return keyword;
    }
    public int exactMatch(String guess){
        int numExactMatch = 0;
        for (int i = 0; i < cha.length; i++){
            if (cha[i] == guess.charAt(i)){
                numExactMatch++;
            }
        }
        if (numExactMatch > 5){
            numExactMatch = 5;
        }
        return numExactMatch;
    }

    public int anyMatch(String guess){
        int numAnyMatch = 0;
        for (int i = 0; i < cha.length; i++){
            for (int j = 0; j < guess.length(); j++){
                if (guess.charAt(j) == cha[i]){
                    numAnyMatch++;
                }
            }
        }
        return numAnyMatch;
    }
    public static void main(String[] args){
        MasterMind Day1 = new MasterMind();
        System.out.println("Try to guess the 5 letter word of the day: ");
        Scanner kbReader = new Scanner(System.in);
        String guess;
        do {
            System.out.print("Guess #" + numGuess + ": " );
            guess = kbReader.nextLine();
            guess = guess.toUpperCase();
            System.out.println("Exact Matches: " + Day1.anyMatch(guess) + "\nAny Matches: " + Day1.anyMatch(guess) + "\n");
            numGuess++;
            if(guess.equals(Day1.getKeyword())){
                System.out.println("You guessed the word!");
                break;
            }
        } while (guess.equals(Day1.getKeyword()) == false);
        kbReader.close();
    }
    
}