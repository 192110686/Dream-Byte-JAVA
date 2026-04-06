
package basic_java;
import java.util.Scanner;

public class DiscountIf {
    /* 1. bill amount 
    2. amount>=1000 
    3. if >=1000 print discount applied.
    4. or else do nothing*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        int bill = sc.nextInt();
        if(bill>=1000){
            System.out.println("Discount Applied");
        } 
    }  
}
