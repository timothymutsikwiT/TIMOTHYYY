// Define the Bank class
class Bank {
    // Fields for the Bank class
    private String accountType;
    private double accountBalance;

    // Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to deposit an amount to the account
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Method to withdraw an amount from the account
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return accountBalance;
        } else {
            System.out.println("Insufficient balance.");
            return accountBalance;
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}

// Define the Insurance class that inherits from Bank
class Insurance extends Bank {

    // Constructor for the Insurance class
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method specific to Insurance class
    public void cover() {
        System.out.println("You are covered.");
    }
}

// Main class to test the Bank and Insurance classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank bankAccount = new Bank("Timothy", 230298);

        // Invoke the display method
        bankAccount.display();
    }
}
