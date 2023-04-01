package constructeroverloading;

public class BankAccount {
    int act_no;
    String depstr_name;
    double balance;

    public BankAccount(int act_no, String depstr_name, double balance) {
        this.act_no = act_no;
        this.depstr_name = depstr_name;
        this.balance = balance;
    }

    // method to deposit amount
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("deposit of " + amount + " is successful and total balance is" + balance);
    }

    // withdraw amount
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance,witdrwl failed");
        } else {
            balance = balance - amount;
            System.out.println("withdrawl amount " + amount + " is sucessful and balance is " + balance);
        }
    }

    public void displayAcctDetails() {
        System.out.println("Account Number: " + act_no);
        System.out.println("Depositer Name " + depstr_name);
        System.out.println("Intitialbalance: " + balance);

    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(1773, "Sony", 1000.00);
        b.displayAcctDetails();
        b.deposit(500.0);
        b.withdraw(300.0);

    }

}
