public class productManager {
    public void add(product product){
        //productValidator validator = new productValidator();
        if(productValidator.isValid(product)) {
            System.out.println("Eklendi..:");
        }else{
            System.out.println("Ürün bilgileri gerçersizdir..:");
        }
    }
}
