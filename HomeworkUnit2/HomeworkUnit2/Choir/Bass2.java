package HomeworkUnit2.Choir;

public class Bass2 extends Bass {
    public Bass2(String n) {
        super(n);
    }

    @Override
    public String sing() {
        return super.sing() + "do";
    }
}