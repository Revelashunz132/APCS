//John Aston Adams
//12/5/22

package HomeworkUnit2;
//package unit3;

import java.util.Scanner;

public class Ship {
    private String name;
    private int size;
    private int[] location = new int[2];

    public Ship(String initialization){
        char boat_type = initialization.charAt(0);
        if (boat_type == 'P'){
            size = 2;
            name = "Patrol";
        }
        else if (boat_type == 'S'){
            size = 3;
            name = "Submarine";
        }
        else if (boat_type == 'B'){
            size = 4;
            name = "Battleship";
        }
        else{
            size = 5;
            name = "Carrier";
        }
        location[0] = Integer.parseInt(initialization.substring(1,3)); 
        if (initialization.charAt(3) == 'V'){
            location[1] = Integer.parseInt(initialization.substring(1,3)) + (size * 10);
        }
        else{
            location[1] = Integer.parseInt(initialization.substring(1,3)) + size;
    }
    }

    @Override
        public String toString() {
            return (name + " is at " + "(" + (location[0] / 10) + "," + (location[0] % 10) + ")(" + (location[1] / 10) + "," + (location[1] % 10) + ")");
        }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a ship: ");
            Scanner kbReader = new Scanner(System.in);
            String kb = kbReader.nextLine();
            Ship b = new Ship(kb);
            System.out.println(b.toString());
            }
    }
}
