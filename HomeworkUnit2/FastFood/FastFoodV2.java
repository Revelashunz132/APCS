//John Aston Adams
//10/27/22

package HomeworkUnit2.FastFood;

import HomeworkUnit2.FastFood.Burger;
import HomeworkUnit2.FastFood.Side;
import HomeworkUnit2.FastFood.Drink;
import HomeworkUnit2.FastFood.Meal;

public class FastFoodV2 {
    public static void main(String[] args){
        Burger[] ba = new Burger[10];
        Side[] sa = new Side[10];
        Drink[] da = new Drink[10];
        double subtotal = 0;
        int total = 0;
        String[] burgerNames = {"Hamburger", "Cheezeburger", "Double-Double"};
        String[] sideNames = {"Fries", "Chips", "Onion Rings"};
        String[] drinkNames = {"Water", "Coke", "Sprite"};
        double[] burgerprices = {1.99, 2.49, 5.09};
        double[] sideprices = {1.49, 0.99, 1.79};
        double[] drinkprices = {0.00, 1.49, 1.49};
        int[] burgercalories = {190, 300, 450};
        int[] sidecalories = {140, 90, 190};
        int[] drinkcalories = {0, 190, 160};
        
        for (int i = 0; i < ba.length; i++ ) { 

            int rb = (int) (Math.random() * 3);
            int rs = (int) (Math.random() * 3);
            int rd = (int) (Math.random() * 3);

            ba[i] = new Burger (burgerNames[rb], burgerprices[rb], burgercalories[rb]);
            sa[i] = new Side (sideNames[rs], sideprices[rs], sidecalories[rs]);
            da[i] = new Drink (drinkNames[rd], drinkprices[rd], drinkcalories[rd]);

            subtotal += ba[i].getPrice() + sa[i].getPrice() + da[i].getPrice();
            total += ba[i].getCalories() + sa[i].getCalories() + da[i].getCalories();

            System.out.println (ba[i].getName() + ", " + sa[i].getName() + ", " + da[i].getName());

        }

        System.out.format("Subtotal: $%.2f", subtotal);
        System.out.println("");
        System.out.format("Total calories: %d " , total);

    }

}
