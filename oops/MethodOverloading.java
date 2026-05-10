class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
/*Method Overriding:
-----------------------
1. same parameters
2. different class name
3. same method name
4. mainly inheritance is needed  

Method Overloading
-------------------------
1. same class name
2. different parameters
3. same method names
4. different class names possible  */
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(int x){
        System.out.println("Dog sound " + x);
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        int result=c1.add(10,20);
        System.out.println(result);
        System.out.println(c1.add(10,20,30));
    }
}
