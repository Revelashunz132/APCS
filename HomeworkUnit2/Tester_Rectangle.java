//John Aston Adams
//10/3/22

package HomeworkUnit2;

public class Tester_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(8,2);
        r2.setLength(5);
        r2.setWidth(3);
        System.out.println(r1.perimeter());
        System.out.println(r1.area());
        System.out.println(r2.perimeter());
        System.out.println(r2.area());
        System.out.println(r3.perimeter());
        System.out.println(r3.area());
    }

}
