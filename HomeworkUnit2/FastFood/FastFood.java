//John Aston Adams
//10/22/22

package HomeworkUnit2.FastFood;

import HomeworkUnit2.FastFood.Burger;
import HomeworkUnit2.FastFood.Side;
import HomeworkUnit2.FastFood.Drink;
import HomeworkUnit2.FastFood.Meal;

public class FastFood {
    public static void main(String[] args){
        Burger b = new Burger("Cheeseburger", 2.49, 300);
        Side s = new Side("Fries", 1.99, 190);
        Drink d = new Drink("Coke", 1.69, 95);
        Meal m = new Meal(b,s,d);
        System.out.println("Your order is: \n" + m.toString() + "\nYour total is $" + m.totaldollars() +"\nCalories: " + m.totalcalories());
        Burger[] ba = new Burger[10];
        double subtotal = 0;
        for (int i = 0; i < ba.length; i++){
            ba[i] = new Burger ("Cheeseburger", 2.49, 300);
            subtotal += ba[i].getPrice();
        }
        System.out.println("Subtotal: " + subtotal);
    }

}

