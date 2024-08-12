import Classes.pizzaOrder;
import Classes.burgerOrder;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> pizzaExtras = new ArrayList<>();
        pizzaExtras.add("Olives");
        pizzaExtras.add("Mushrooms");
        pizzaExtras.add("Cheese");
        pizzaOrder pizza = new pizzaOrder(8.49, 1, 8.49);
        pizza.printDetails();
        System.out.println("Extras: " + pizzaExtras);

        System.out.println("##############");

        ArrayList<String> burgerExtras = new ArrayList<>();
        burgerExtras.add("Cheese");
        burgerExtras.add("Bacon");

        burgerOrder burger = new burgerOrder(5.99, 2, 13.77);
        burger.printDetails();
        System.out.println("Extras: " + burgerExtras);







    }
}