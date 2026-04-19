class BankAccount{
    //step 1 : data hiding
    private String accountHolder;
    private double balance;

    //step 2 : setter methods 
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    //step 3 : getter methods
    public String getAccountHolder(){
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }

    //deposit method
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println(amount + " deposited successfully. Balance is : "+balance);
        }else{
            System.out.println("Deposit amount must be greater than 0");
        } 
    }

    //withdraw method
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdrawal amount must be greater than 0");
        }else if(amount>balance){
            System.out.println("Insufficient balance");
        } else{
            balance = balance-amount;
            System.out.println(amount + " Withdrawn successfully. Balance is : " + balance);
        }
        
    }
    
}
public class BankAccountMain {
  public static void main(String[] args){
    BankAccount b1 = new BankAccount();
    b1.setAccountHolder("Naveen");
    b1.deposit(5000);
    b1.withdraw(2000);
    b1.withdraw(4000);
    b1.deposit(-1000);

    System.out.println("Account Holder: " + b1.getAccountHolder());
    System.out.println("Final Balance: " + b1.getBalance());


  }  
}
