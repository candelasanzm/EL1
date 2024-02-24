package SOO3.Clases;

public class ClaseAccount {
    private String id ;
    private String name;
    private int balance = 0;

    public ClaseAccount (String id, String name){
        this.id = id;
        this.name = name;
    }

    public ClaseAccount (String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit (int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit (int amount){
        if (amount <= balance){

        }
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public int transferTo (ClaseAccount another, int amount){
        if (amount <= balance){

        }
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    public String toString(){
        return "Account[id = " + id + " name = " + name + "balance = " + balance + "]";
    }
}
