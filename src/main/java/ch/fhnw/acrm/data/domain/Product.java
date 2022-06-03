package ch.fhnw.acrm.data.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name="product", schema = "LOTransport")
public class Product {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double price;
    private double palletSize;


@ManyToMany(mappedBy = "product")
    private Set<Orders> orders;




    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", palletSize=" + palletSize +
                ", orders=" + orders +
                '}';
    }

    public Product(Set<Orders> orders) {
        this.orders = orders;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
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

    public Product(String name, double price, double palletSize) {
        this.name = name;
        this.price = price;
        this.palletSize = palletSize;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id != null ? id.equals(product.id) : product.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
