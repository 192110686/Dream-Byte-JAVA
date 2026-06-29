class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message) {
        super(message);
    }
    
}
public class CustomBank {
private double balance = 5000;
public void withdraw(double amount) throws InsufficientBalanceException{
    if(amount>balance){
        throw new InsufficientBalanceException("Insufficint balance in account");
    }
    else{
        balance=balance-amount;
        System.out.println("Withdrawal successful, Current Balance is: " + balance);
    }
}
public double getBalance(){
    return balance;
}
    public static void main(String[] args) {
        CustomBank b = new CustomBank();
        try {
            b.withdraw(887600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
