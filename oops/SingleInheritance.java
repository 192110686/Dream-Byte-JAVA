class House{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Room extends House{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Room d1 = new Room();
        d1.sound();
        House h1 = new House();
        h1.sound();
    }
}