abstract  class Building {
    void paymentMessage(){
        System.out.println("Payment process started");
    }
    abstract void pay();
}
 class UPI extends Building {
    void pay(){
        System.err.println("Payment done through UPI");
    }
}
class Card extends Building {
    void pay(){
        System.err.println("Payment done through Card");
    }
}
public class MainAbstract{
    public static void main(String[] args) {
        Building b1 = new UPI();
        b1.pay();
        Building c1 = new Card();
        c1.pay();
    }
}
