package HomeworkUnit2.Choir;

import java.util.ArrayList;

public class Choir {
    public static void main (String[] args) {
        ArrayList<Singer> cca_choir = new ArrayList<>();
        cca_choir.add(new Soprano("Chloe"));
        cca_choir.add(new Tenor("Daniel"));
        cca_choir.add(new Bass("Bryan"));
        cca_choir.add(new Bass1("James"));
        cca_choir.add(new Bass2("Ethan"));
        cca_choir.add(new Soprano("Ellie"));
        allSing(cca_choir);
    }

    public static void allSing(ArrayList<Singer> choir) {
        for (Singer s : choir) {
            System.out.println(s.sing());
        }
    }
}
