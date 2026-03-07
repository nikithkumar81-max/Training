package module3;

public class bank {
    String accountNumber;
    double balance;
    bank(String accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bank acc1 = new bank("1234XYZ", 100000);
        acc1.display();
        acc1.deposit(7000);
        acc1.withdraw(4000);
        acc1.withdraw(20000);
        acc1.display();
    }
}
