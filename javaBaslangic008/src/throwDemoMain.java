
public class throwDemoMain {
    public static void main(String[] args) throws BalanceInaufficentException {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap..: " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap..: " + manager.getBalance());
        manager.withdraw(90);
        System.out.println("Hesap..: " + manager.getBalance());
        manager.withdraw(20);
        System.out.println("Hesap..: " + manager.getBalance());


    }
}