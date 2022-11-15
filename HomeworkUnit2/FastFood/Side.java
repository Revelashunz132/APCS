//John Aston Adams
//10/23

package HomeworkUnit2.FastFood;

public class Side {
    public String type;
    public double price, calories;
   
    
    public Side (String t, double p, double c){
        type = t;
        price = p;
        calories = c;

    }

    public String getName(){
        return type;
    }
    
    public double getPrice(){
        return price;
    }

    public double getCalories(){
        return calories;
    }

}
