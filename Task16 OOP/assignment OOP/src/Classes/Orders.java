package Classes;

import java.util.ArrayList;

public class Orders {

    private double orderPrice;
    private int orderQuantity;
    private double totalPrice;
    private double taxRate;

    public Orders(double orderPrice, int orderQuantity, double totalPrice){
        this.orderPrice = orderPrice;
        this.orderQuantity = orderQuantity;
        this.totalPrice = totalPrice;
    }

    // Method to calculate total price including tax
    public double calculateTotalPrice(){
        return orderPrice * orderQuantity;
    }

    public double calculateTax(){
        return calculateTotalPrice() - totalPrice;
    }

    public double calculateTotalWithTax(){
        return calculateTax() - calculateTotalPrice();
    }

    public void setTax(double taxRate){
        this.taxRate = taxRate;

    }
    public double getTax(){
        return taxRate;
    }

    public void printcalculateTotalWithTax(){
        System.out.println("Total price with Tax :" + calculateTotalWithTax());

    }


    public void printDetails(){
        System.out.println("Price: " +orderPrice+"$");
        System.out.println("Quantity: " + orderQuantity);
        System.out.println("Total with Tax: " + calculateTotalWithTax()+"$");
        System.out.println(getTax());




    }



}
