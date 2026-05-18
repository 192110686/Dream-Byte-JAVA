import java.util.Scanner;
public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0){
            throw new RuntimeException("Age cannot be less than 0");
        }
        System.out.println("Valid age");
    }
}
