package SOO4;
import SOO4.Clases.Customer2;
import SOO4.Clases.Account;

public class MainCustomerAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer2 c1 = new Customer2(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account inv1 = new Account(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setBalance(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer2()); // Customer's toString()
        System.out.println("balance is: " + inv1.getBalance());
        System.out.println("customer's id is: " + inv1.getId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's balance after deposit is: " + inv1.deposit(28).getBalance());
        System.out.printf("balance without amount", inv1.withdraw(50).getBalance());
    }
}