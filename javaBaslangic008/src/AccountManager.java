public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInaufficentException {
        if(balance>=amount) {
            balance -= amount;
            //System.out.println("Hesaptan Para Çekilemedi. Bakiye Yetersiz..: ");
        }else {
            throw new BalanceInaufficentException ("Bakiye Yetersiz..: ");
        }


        }


    public double getBalance() {
        return balance;
    }
}
