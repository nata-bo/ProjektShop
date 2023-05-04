import java.util.HashMap;
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


        Product bread = new Product(1.4,"Хлеб",Category.PRODUCTS);
        Product jeans = new Product(25.5,"Джинсы",Category.CLOTHING);
        Product iron = new Product(48,"Утюг",Category.ELECTRONICS);
        Product milk = new Product(1.4,"Молоко",Category.PRODUCTS);
        Product dress = new Product(25.5,"Платье",Category.CLOTHING);
        Product toaster = new Product(48,"Тостер",Category.ELECTRONICS);

        Product[] products = {bread,jeans,iron,milk,dress,toaster};

        getMapOfProducts(products);

        jeans.setPrice(9.9);
        System.out.println(jeans);
        jeans.setPrice(0);

    }

    public static void getMapOfProducts(Product[]products){
        Map<String,Double> mapOfProducts = new HashMap<>();
        for (Product product1:products) {
        mapOfProducts.put(product1.getName(),product1.getPrice());
        }
        System.out.println(mapOfProducts);
    }
}