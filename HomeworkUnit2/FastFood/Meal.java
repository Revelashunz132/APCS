//John Aston Adams
//10/23

package HomeworkUnit2.FastFood;

public class Meal {
    Burger burger;
    Side side;
    Drink drink;
    String m;
    public Meal(Burger b, Side s, Drink d){
        burger = b;
        side = s;
        drink = d;
        String m = ("- " + burger.type + "\n" + "- " + side.type + "\n" + "- " + drink.type);
        this.m = m;
    }

    public double totaldollars(){
        return burger.getPrice() + side.getPrice() + drink.getPrice(); 
    }

    public double totalcalories(){
        return burger.getCalories() + side.getCalories() + drink.getCalories();
    }

    @Override
    public String toString(){
        return m;
    }
}
