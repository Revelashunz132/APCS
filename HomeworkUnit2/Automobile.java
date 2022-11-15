//John Aston Adams
//10/17/22

package HomeworkUnit2;

public class Automobile {
    private double mpg, gallons;

    public Automobile(double m){
        mpg = m;
        gallons = 0;
    }

    public void fillUp(double gal){
        gallons += gal;
    }

    public void takeTrip(double miles){
        gallons -= (miles/mpg);
    }

    public double reportFuel(){
        return gallons;
    }
    public static void main(String[] args){
        Automobile myBmw = new Automobile(24);
        Automobile myFerrari = new Automobile(10);
        myFerrari.fillUp(15.398537);
        myBmw.fillUp(20);
        myBmw.takeTrip(100);
        double fuel_left = myBmw.reportFuel();
        double fuel_left2 = myFerrari.reportFuel();
        System.out.format("My BMW has %4.2f gallons of fuel left\n" , fuel_left);
        System.out.format("My Ferrari has %4.2f gallons of fuel left", fuel_left2);
    }
}
