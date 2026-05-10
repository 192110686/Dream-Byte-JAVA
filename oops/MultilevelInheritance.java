class Cow{
    void eat(){
        System.out.println("Cow is eating");
    }
}
class Milk extends Cow{
    void boil(){
        System.out.println("Milk is coming from Cow");
    }
}
class ButterMilk extends Milk  {
   void churn(){
    System.out.println("We get Butter from ButterMilk");
   }
}
class Butter extends ButterMilk{
    void move(){
        System.out.println("We get Butter from ButterMilk");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        ButterMilk b1 = new ButterMilk();
        b1.boil();
        b1.eat();
        b1.churn();
        Butter but1 = new Butter();
        but1.boil();
        but1.churn();
        but1.eat();
        but1.move();
    }
}
