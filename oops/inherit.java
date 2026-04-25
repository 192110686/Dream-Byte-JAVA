class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }
}



public class inherit {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.bark();
        d1.sleep();
        d1.eat();
    }
}
