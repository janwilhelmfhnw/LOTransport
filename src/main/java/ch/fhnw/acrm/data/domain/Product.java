package ch.fhnw.acrm.data.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Author: Philippe Gagneux

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private double palletSize;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPalletSize(double palletSize) {
        this.palletSize = palletSize;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPalletSize() {
        return palletSize;
    }

    public Product() {
    }

    public Product(Long id, String name, double price, double palletSize) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }
}
