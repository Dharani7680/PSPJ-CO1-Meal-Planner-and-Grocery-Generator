import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double checkBalance() {
        return balance;
    }
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance );
        System.out.print("Enter Deposit Amount: ");

        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Enter Withdrawal Amount: ");

        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("\nFinal Account Details:");

       account.displayAccount();
        sc.close();
    }
}