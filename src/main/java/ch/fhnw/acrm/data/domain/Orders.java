package ch.fhnw.acrm.data.domain;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private double itemAmount1;
    private double itemAmount2;
    private double itemAmount3;
    private double itemAmount4;
    private double ProductCosts;
    private double palletSpace;
    private double transportCosts;
    private double Total;


    public Orders() {
    }

    public Orders(double itemAmount1, double itemAmount2, double itemAmount3, double itemAmount4, double productCosts, double palletSpace, double transportCosts, double total) {
        this.itemAmount1 = itemAmount1;
        this.itemAmount2 = itemAmount2;
        this.itemAmount3 = itemAmount3;
        this.itemAmount4 = itemAmount4;
        ProductCosts = productCosts;
        this.palletSpace = palletSpace;
        this.transportCosts = transportCosts;
        Total = total;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getItemAmount1() {
        return itemAmount1;
    }

    public void setItemAmount1(double itemAmount1) {
        this.itemAmount1 = itemAmount1;
    }

    public double getItemAmount2() {
        return itemAmount2;
    }

    public void setItemAmount2(double itemAmount2) {
        this.itemAmount2 = itemAmount2;
    }

    public double getItemAmount3() {
        return itemAmount3;
    }

    public void setItemAmount3(double itemAmount3) {
        this.itemAmount3 = itemAmount3;
    }

    public double getItemAmount4() {
        return itemAmount4;
    }

    public void setItemAmount4(double itemAmount4) {
        this.itemAmount4 = itemAmount4;
    }

    public double getProductCosts() {
        return ProductCosts;
    }

    public void setProductCosts(double productCosts) {
        ProductCosts = productCosts;
    }

    public double getPalletSpace() {
        return palletSpace;
    }

    public void setPalletSpace(double palletSpace) {
        this.palletSpace = palletSpace;
    }

    public double getTransportCosts() {
        return transportCosts;
    }

    public void setTransportCosts(double transportCosts) {
        this.transportCosts = transportCosts;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "Id=" + Id +
                ", itemAmount1=" + itemAmount1 +
                ", itemAmount2=" + itemAmount2 +
                ", itemAmount3=" + itemAmount3 +
                ", itemAmount4=" + itemAmount4 +
                ", ProductCosts=" + ProductCosts +
                ", palletSpace=" + palletSpace +
                ", transportCosts=" + transportCosts +
                ", Total=" + Total +
                '}';
    }
}
