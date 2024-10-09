
public class tryCatchDemoMain {
    public static void main(String[] args) {
        try {
            int [] sayialar = new int[]{1,2,3};
            System.out.println(sayialar[5]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Ben her türlü çalışırım..: ");
        }
    }
}