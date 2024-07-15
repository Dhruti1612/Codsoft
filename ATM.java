import java.util.Scanner;

public class ATM
 {
    private double balance;
    private String accountNumber;
    private String pin;

    public ATM(String accountNumber, String pin, double balance) 
    {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public void displayMenu() 
    {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void checkBalance() 
    {
        System.out.println("Your current balance is: " + balance);
    }

    public void withdrawCash() 
    {
        System.out.print("Enter the amount to withdraw: ");
        double amount = getDoubleInput();
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
    }

    public void depositCash() 
    {
        System.out.print("Enter the amount to deposit: ");
        double amount = getDoubleInput();
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    public void changePIN() 
    {
        System.out.print("Enter your current PIN: ");
        String currentPIN = getStringInput();
        if (currentPIN.equals(pin)) {
            System.out.print("Enter your new PIN: ");
            pin = getStringInput();
            System.out.println("PIN changed successfully!");
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    private double getDoubleInput() 
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private String getStringInput() 
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) 
    {
        ATM atm = new ATM("987654321", "4321", 200000);
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            atm.displayMenu();
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.withdrawCash();
                    break;
                case 3:
                    atm.depositCash();
                    break;
                case 4:
                    atm.changePIN();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}