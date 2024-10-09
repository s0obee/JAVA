import java.util.ArrayList;

public class arrayListDemoMain {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer Yunus = new Customer(1, "Yunus Emre ", "Çakıcı");
        customers.add(Yunus);
        customers.add(new Customer(2, "Bedirhan ", "Çelik"));
        customers.add(new Customer(3, "Arda ", "Çolak"));

        customers.remove(Yunus);

        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}
