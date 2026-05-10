class Payment{
    void pay(){
        System.out.println("Payment is processing");
    }
    void withdraw(){
        System.out.println("Withdraw is done");
    }
    Payment abc(){
        return new Payment();
    }
    int bgd(){
        return 8;
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Payment through UPI");
    }
    void withdraw(int x){
         System.out.println("Withdraw of 500 done.");
    }
    @Override
 Card abc(){
        return new Card();
     }
}
class Card extends UPI{

    void withdraw(int x,int y){
        System.out.println("WIthdraw of 1000 and 500 done");
    }
    @Override
     int bgd(){
        return 123;
     }
}
public class methodoverriding {
    public static void main(String[] args){
        UPI u1= new UPI();
        MainAbstract c1 = new MainAbstract();
        u1.pay();
        c1.pay();
        Payment p1 = new Payment();
        p1.pay();
    }
}
