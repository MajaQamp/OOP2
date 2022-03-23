package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {
    private ArrayList<String> coffeeBrands;
    Scanner reader = new Scanner(System.in);

    public CoffeeMachine(ArrayList<String> coffeeBrands) {
        this.coffeeBrands = coffeeBrands;
    }


    public void selectCoffeeBrand() {
        System.out.println("Please select the coffee brand:" +
                "\n1 for Lavazza " +
                "\n2 for Illy" +
                "\n3 for Segafredo" +
                "\n4 for Manuel");
        Integer userInput = Integer.valueOf(reader.next());
        if (userInput == 1) {
            System.out.println("You have selected Lavazza");
        } else if (userInput == 2) {
            System.out.println("You have selected Illy");
        } else if (userInput == 3) {
            System.out.println("You have selected Segafredo");
        } else if (userInput == 4) {
            System.out.println("You have selected Manuel");
        }

    }

}
