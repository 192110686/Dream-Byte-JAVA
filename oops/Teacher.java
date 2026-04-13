class Teach{
    Teach(){
        this(10);
       // this(10,20);
        System.out.println("Default");
         //this();// because of this recursive copnstructor call happens
    }
    Teach(int x){
        this(10,20);
        System.out.println("One Param");
    }
    Teach(int x, int y){
        System.out.println("Two params");
    }
}
public class Teacher {
    public static void main(String[] args){
        Teach t1 = new Teach();
    }
    //this();
}
