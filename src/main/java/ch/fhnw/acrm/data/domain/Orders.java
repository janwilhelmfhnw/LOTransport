package ch.fhnw.acrm.data.domain;

import javax.persistence.*;
@Entity
public class Orders extends Product {
    private int orderNumber;
    private int orderAmount;




    public Orders() {
    }

    public Orders(Long id, String name, double price, double palletSize) {
        super(id, name, price, palletSize);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNumber=" + orderNumber +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
