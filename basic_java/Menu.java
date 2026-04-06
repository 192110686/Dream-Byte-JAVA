package basic_java;
import java.util.Scanner;

public class Menu {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //get choice from user -> (1-3)
       System.out.println("Enter choice(1-3): ");
       int choice = sc.nextInt();
       switch(choice){
        case 1:
             System.out.println("Tea");
             break;
       case 2:
            System.out.println("Coffee");
            break;
       case 3:
           System.out.println("Juice");
           break;
       default:
          System.out.println("Invalid choice");
   }
} 
}
