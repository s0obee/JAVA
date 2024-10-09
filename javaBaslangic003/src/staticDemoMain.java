public class staticDemoMain {
    public static void main(String[] args) {
        productManager manager = new productManager();
        product product = new product();
        product.price = 10;
        product.name ="Mouse";

        manager.add(product);
    }
}