    //John Aston Adams
    //10/11/22

    package HomeworkUnit2;

    public class ModifiedRectangle {
        private double length, width;

        public ModifiedRectangle() {
            length = 0;
            width = 0;
        }

        public ModifiedRectangle(double l, double w) {
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

        @Override
        public String toString() {
            return length + " " + width;
        } 

        public boolean equals(Object obj1, Object obj2){
            ModifiedRectangle object1 = (ModifiedRectangle) obj1;
            ModifiedRectangle object2 = (ModifiedRectangle) obj2;
            return (object1.length == object2.length && object1.width == object2.width);
        }
        public static void main(String[] args) {
            ModifiedRectangle r1 = new ModifiedRectangle();
            ModifiedRectangle r2 = new ModifiedRectangle();
            ModifiedRectangle r3 = new ModifiedRectangle(8, 2);
            ModifiedRectangle r4 = new ModifiedRectangle();
            r2.setLength(5);
            r2.setWidth(3);
            r4.setLength(8);
            r4.setWidth(2);
            System.out.println(r3);
            System.out.println(r4.equals(r3,r4));
        }

    }
