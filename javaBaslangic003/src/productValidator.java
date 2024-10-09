public class productValidator {
    // Bir ürünü kaydederken , kullanırken kurallara uyumlu olup olmadıgına bakariz.

    public static boolean isValid(product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;

        }

    }
}
