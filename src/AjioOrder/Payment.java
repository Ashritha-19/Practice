package AjioOrder;

public class Payment {
    int orderItems;
    int bookPrice = 540;
    int totalPrice;
    public int items(Products products){
        if (orderItems < products.book){
            orderItems = products.book;
            totalPrice = products.book * bookPrice;
            System.out.println("totalPrice:"+" "+totalPrice);
        }else {
            System.out.println("add item");
        }
        return orderItems;
    }
}