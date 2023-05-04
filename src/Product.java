public class Product {
   private double price;
   private String name;
    private Category category;

    public Product(double price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name+ " - цена: "+price+", категория ["+category+"]";
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
