import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String bank =new Bank (System.in);
        int choice;
    }
    while (true){
        System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
        System.out.print("Enter your choice: ");
    }
      int  choice = Scanner.nextInt();{

    switch (choice){
        case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolderName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    bank.createAccount(accountNumber, accountHolderName, balance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.next();
                    bank.checkBalance(accountNumber);
                    break;
                    case 5:
                    System.out.println("Exiting...");
                    return;

            default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}