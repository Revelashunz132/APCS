package HomeworkUnit2.Choir;

public class Soprano extends Singer {
    public Soprano(String n) {
        super(n);
    }

    @Override
    public String sing() {
        return "lalala";
    }
}