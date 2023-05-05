import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1
        //Допустим, у нас есть магазин.
        // В нашем магазине есть товары трех категорий: продукты, электроника, одежда.
        // У каждого товара есть цена, наименование категория к которой он относится.
        // Важно, что после создания товара ни одно из его свойств не должно быть, доступно для изменения,
        // т.е. все поля должны быть private. Создать список товаров

        //2
        //Реализуйте в main метод, который формирует
        // Map<String,Double> где ключ – наименование товара, значение – цена.
        // Подсказка: видимо вам понадобятся гетеры.

        //3
        //Реализовать в классе Товар возможность изменения цены.
        // При этом система не должна давать возможность поставить отрицательную цену или 0
        //Видимо, понадобится сеттер. **НЕОБЯЗАТЕЛЬНОЕ.Добавить возможность вести истории изменения цены у товара.


        Product bread = new Product(1.4, "Хлеб", Category.FOODS);
        Product jeans = new Product(25.5, "Джинсы", Category.CLOTHING);
        Product iron = new Product(48, "Утюг", Category.ELECTRONICS);
        Product milk = new Product(1.4, "Молоко", Category.FOODS);
        Product dress = new Product(25.5, "Платье", Category.CLOTHING);
        Product toaster = new Product(48, "Тостер", Category.ELECTRONICS);


        Product[] products = {bread, jeans, iron, milk, dress, toaster};
        getMapOfProducts(products);
        jeans.setPrice(9.9);
        System.out.println(jeans);
        jeans.setPrice(0);

        System.out.println("*****2*****");
        // второй вариант
        List<Product> products1 = List.of(new Product(130,"Nike Airmax",Category.CLOTHING),
                new Product(7,"Wine",Category.FOODS),
                new Product(200,"Samsung",Category.ELECTRONICS));
        //System.out.println(products1);
        System.out.println(getMapPricesOfProducts(products1));

        products1.get(1).setPrice(10);  // если нет переменной то нужно пользоватся методом через индекс
        products1.get(1).printPriceHistory();
        jeans.setPrice(30);
        jeans.printPriceHistory();


    }

    public static void getMapOfProducts(Product[] products) {
        Map<String, Double> mapOfProducts = new HashMap<>();
        for (Product product : products) {
            mapOfProducts.put(product.getTitle(), product.getPrice());
        }
        System.out.println(mapOfProducts);
    }
    public static Map<String,Double> getMapPricesOfProducts(List<Product>products){
        Map<String,Double>map = new HashMap<>();
        for (Product product:products){
            map.put(product.getTitle(), product.getPrice());
        }
        return map;
    }
}