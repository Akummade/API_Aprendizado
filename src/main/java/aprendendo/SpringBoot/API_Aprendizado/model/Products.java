package aprendendo.SpringBoot.API_Aprendizado.model;//toda classe deve ter como package original esse pacote raiz
import jakarta.persistence.*;

//POJO -> plain old java object
@Entity
@Table(name = "Products")
public class Products {
    @Id
    @Column
    private String ID;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private String description;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String category) {
        this.description = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + description + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
