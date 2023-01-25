//John Aston Adams
//1/24/23

package HomeworkUnit2;
//package unit3;();

public class MonteCarlo {
    public double h;
    public double k;
    public double r;

    public MonteCarlo(double h, double k, double r) {
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public double nextRainDrop_x(){
        return Math.random() * (r*2) + (h-r);
    }

    public double nextRainDrop_y(){
        return Math.random() * (r*2) + (k-r);
    }

    public boolean insideCircle(double x, double y) {
        return (Math.pow((x - h), 2) + Math.pow((y - k), 2)) <= Math.pow(r, 2);
        }
}
