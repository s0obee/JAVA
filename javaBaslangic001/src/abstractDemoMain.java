public class abstractDemoMain {
    public static void main(String[] args) {
        customerManager customerManager = new customerManager();
        customerManager.databaseManager = new mySqlDatabaseManager();
        customerManager.getCustomers();


    }
}