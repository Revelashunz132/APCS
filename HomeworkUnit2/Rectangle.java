package HomeworkUnit2;

public class Rectangle {
    private double length, width;
    
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double perimeter() {
        return length + length + width + width;
    }

    public double area() {
        return length * width;
    }

}
