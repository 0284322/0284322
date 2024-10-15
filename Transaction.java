public class Transaction {
    private String transactionType;
    private String accountNumber;
    private double amount;

    public Transaction(String transactionType,String accountNumber,double amount){
        this.transactionType=transactionType;
        this.accountNumber=accountNumber;
        this.amount=amount;
    }
    @Override
    public String toString(){
        return transactionType+"of"+amount+"from the account number"+accountNumber;
    }
    







}
