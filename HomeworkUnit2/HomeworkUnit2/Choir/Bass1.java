package HomeworkUnit2.Choir;

public class Bass1 extends Bass {
    public Bass1(String n) {
        super(n);
    }

    @Override
    public String sing() {
        return "do" + super.sing();
    }
}