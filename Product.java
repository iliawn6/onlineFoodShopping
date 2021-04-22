package onlineFoodShopping;
import java.time.LocalDate;

public class Product {
    private String name;
    private String category;
    private double weight;
    private double price;
    private LocalDate manufactureDate;
    private LocalDate expirationDate;



    public Product (String name,String category,double weight, double price){
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.price = price;
    }

    public void setDate(String manDate,String expDate){
        LocalDate dateMan = LocalDate.parse(manDate);
        LocalDate dateExp = LocalDate.parse(expDate);
        if (dateMan.compareTo(dateExp) > 0){
            System.out.println("manufacture date is later than expiration date!!\n");
        }
        else {
            manufactureDate = dateMan;
            expirationDate = dateExp;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String toString() {
        return "{" + "\"Product\"{" +
                "\"name\": \"" + name + '\"' +
                ", \"category\": \"'" + category + '\"' +
                ", \"weight\": \"" + weight + "\"" +
                ", \"price\": \"" + price + "\"" +
                ", \"manufactureDate\": \"" + manufactureDate + "\"" +
                ", \"expirationDate\": \"" + expirationDate + "\"" +
                "}" + "}\n";
    }
}
