class User{
    private int accNo;
    private String name;
    private String password;

    public User(int accNo, String name, String password) {
        this.accNo = accNo;
        this.name = name;
        this.password = password;
    }

    public int getAccNo() {
        return accNo;
    }
    public String getName() {
        return name;
    }
}

class BankAccount{
    private User u;
    private double balance;

    public BankAccount(User u, double balance) {
        this.u = u;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class SD_EST_BankingApplication {
    public static void main(String[] args){
        User user1 = new User(12345, "Chandan", "password123");
        BankAccount account1 = new BankAccount(user1, 1000.0);
        account1.deposit(500.0);
        System.out.println("Balance: " + account1.getBalance());
    }
}
