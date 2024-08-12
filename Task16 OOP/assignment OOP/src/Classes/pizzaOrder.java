package Classes;

import java.util.ArrayList;

public class pizzaOrder extends Orders {

    private String orderName;
    private ArrayList<String> extras;

    public pizzaOrder(double orderPrice, int orderQuantity, double totalPrice) {
        super(orderPrice, orderQuantity, totalPrice);
        this.orderName = "Pizza";
    }

    @Override
    public void printDetails() {
        System.out.println("Order Name: " + orderName);
        super.printDetails();


    }
}