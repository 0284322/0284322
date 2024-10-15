import java.util.ArrayList;
import java.util.Scanner;

public class Banking{
private ArrayList<BankingSystem> accounts=new ArrayList<>();
private ArrayList<Transaction> transactions=new ArrayList<>();

//Now create a new account
 public void createAccount(String accountHolderName,String accountBalance,double accountNumber)
{
    BankingSystem account = new BankingSystem(accountHolderName,accountBalance,accountNumber);
    accounts.add(account);
    System.out.println("Account created succsesfully");
}
//deposit money for multiple account
public void Deposit(String accountNumber,double amount){
Banking account = findAccount(accountNumber);
if(account!=null){
    account.Deposit(accountNumber, amount);
transactions.add(new Transaction("deposit of amount"+amount+ "in bank account number"+accountNumber));
}
else{
    System.out.println("Account not found");
}
}
//Now to check balance in your account
public void checkBalance(String accountNumber)
Banking account = findAccount(accountNumber);
if(account!=null){
    System.out.println(accountNumber+":"+account.getaccountBalance);
}
}










    
