package ch.fhnw.acrm.data.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private double palletSize;

    public Products(Long id, String name, double price, double palletSize) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }

    public Products() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPalletSize() {
        return palletSize;
    }

    public void setPalletSize(double palletSize) {
        this.palletSize = palletSize;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                '}';
    }

    //Product calc

    public static void calcPrice(int id, double palletSize, double price){
        //Double Prod  = Product.;

        return ;
    }
}
