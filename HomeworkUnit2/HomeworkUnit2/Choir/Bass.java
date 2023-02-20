package HomeworkUnit2.Choir;

public class Bass extends Singer {
    public Bass(String n) {
        super(n);
    }

    @Override
    public String sing() {
        return "dadada";
    }
}