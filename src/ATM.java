import java.util.Scanner;

public class ATM {
    private double balance = 5000.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("\nCurrent Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n*ATM_Machine*");
            System.out.println("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount:");
                    atm.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount:");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
