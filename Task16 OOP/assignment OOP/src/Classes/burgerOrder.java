package Classes;

import java.util.ArrayList;

public class burgerOrder extends Orders {

    private String orderName;
    private ArrayList<String> extras;


    public burgerOrder(double orderPrice, int orderQuantity, double totalPrice) {
        super(orderPrice, orderQuantity, totalPrice);
        this.orderName = "Burger";
    }

    @Override
    public void printDetails() {
        System.out.println("Order Name: " + orderName);
        super.printDetails();
    }
}