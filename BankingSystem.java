public class BankingSystem {
        //This class will represent an individual bank account. 
    // It may contain attributes like account number, balance, account holder name, etc.
    public class BankAccountClass {
        private String accountNumber;
        private String accountHolderName;
        private double accountBalance;
    
        public BankAccountClass(String accountNumber,String accountHolderName,double accountBalance){
    this.accountNumber=accountNumber;
    this.accountHolderName=accountHolderName;
    this.accountBalance=accountBalance;
        }
    //getter and setter method
    public String getAccountNumber(){return accountNumber;}
    public String getAccountHolderName(){return accountHolderName;}
    public double getAccountBalance(){return accountBalance;}
    
    //deposit method
    public void deposit(double amount ){
   accountBalance=accountBalance+amount;
   //it can also be write like accountBalance+=amount
   System.out.println("Deposited amount-"+amount+ "New Balance in your account is-"+ accountBalance);     
    }

//withdraw method
public boolean withdraw(double amount){
    if (amount<=accountBalance){
    accountBalance-=amount;
    System.out.println("Withraw amount"+ amount+"Balance after withdraw"+accountBalance);
    return true;}
else{
System.out.println("Insufficient amount");
return false;
}}}}














    

