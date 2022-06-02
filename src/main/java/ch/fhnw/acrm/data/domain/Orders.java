package ch.fhnw.acrm.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private Long orderId;

    private int amount;

    public Orders(String name, double price, double palletSize, int amount) {
        this.amount = amount;
    }

    public Orders() {
    }


    public Long getId() {
        return orderId;
    }

    public void setId(Long id) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + orderId +
                ", amount=" + amount +
                '}';
    }
}
