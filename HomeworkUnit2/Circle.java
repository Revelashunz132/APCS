//John Aston Adams
//10/3/22

package HomeworkUnit2;

public class Circle {
    private double radius;
    public void setRadius(double r) {
        radius = r;
    }

    public double circumference(){
        return 2*radius * Math.PI;
    }

    public double area (){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setRadius(10.5);
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        Circle c2 = new Circle();
        c2.setRadius(5.5);
        System.out.println(c2.circumference());
        System.out.println(c2.area());
    }
}
