//John Aston Adams
//2/15/23

package HomeworkUnit2.Choir;

public abstract class Singer {
    private String name;

    public Singer(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public abstract String sing();
}



