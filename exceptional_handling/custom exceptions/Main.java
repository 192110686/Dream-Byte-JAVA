//Accessing the parent's variable
// class Animal{
//     String color="White";
// }
// class Dog extends Animal{
//     String color = "Black";
//      void display(){
//         System.out.println("Child Class Color is : " + color);
//         System.out.println("Parent Class Color is : " + super.color );
//     }
// }
//    public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.display();
//     }
//    }

/*Accessing the Parent's Method */
// class Animal{
//     void sound(){
//         System.out.println("Animal makes sound");
//     }
// }
// class Dog extends Animal{
//     @Override
// void sound(){
//     System.out.println("Dog barks");
// }
// void show(){
//     sound();
//     super.sound();
// }
// }
// public class Main{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.show();
//     }
// }

/*Accessing parent's constructor */
class Animal{
    String message;
    Animal(){
        System.out.println("Hi");
    }
    Animal(String message){
        this.message=message;
    }
}
class Dog extends Animal{
   Dog(){
super();
System.out.println("Dog");
   }

}
public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal("hI");
    }
}