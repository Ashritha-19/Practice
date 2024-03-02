package swiggy.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<OrderItem> orderItemList = new ArrayList<>();

    private double price;
    private int serviceCharges;
    private int tipAmt;

    public Order(double price, int serviceCharges, int tipAmt) {
        this.price = price;
        this.serviceCharges = serviceCharges;
        this.tipAmt = tipAmt;
    }

    public void addItem(OrderItem item){
        orderItemList.add(item);
        price = price + item.getPrice();
    }
    public void removeItem(OrderItem item){
        orderItemList.remove(item);
        price = price - item.getPrice();
    }

//    public int getPrice() {
//    }
}
