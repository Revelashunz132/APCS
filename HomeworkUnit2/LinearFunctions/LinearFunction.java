//John Aston Adams
//2/26/23

public class LinearFunction implements LinearFunctionMethods {

    private double slope;
    private double yIntercept;

    public LinearFunction(double slope, double yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public double getSlope() {
        return slope;
    }

    public double getYintercept() {
        return yIntercept;
    }

    public double getRoot() {
        return -yIntercept / slope;
    }

    public double getYvalue(double x) {
        return slope * x + yIntercept;
    }

    public double getXvalue(double y) {
        return (y - yIntercept) / slope;
    }
}