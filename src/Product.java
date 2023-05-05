import java.util.ArrayList;

public class Product {
    private double price;
    private String title;
    private Category category;
    private ArrayList<Double> history= new ArrayList<>(); // сразу присвоили значение
                                                         // то в конструктор это поле добавлять не нужно

    public Product(double price, String name, Category category) {
        this.price = price;
        this.title = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return title + " - цена: " + price + ", категория [" + category + "]";
    }

    public void setPrice(double price) {
        if (price > 0) {
            history.add(this.price); // сохранили старую цену в отдельный лист
            this.price = price;
        }
    }
    public void printPriceHistory(){
        System.out.println("История изменения цены "+title+": "+history);
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
