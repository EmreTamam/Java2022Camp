package attribute;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Notebook";
        product.id = 1;
        product.description = "macbook air";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
