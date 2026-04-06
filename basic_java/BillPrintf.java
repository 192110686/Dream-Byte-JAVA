package basic_java;
import java.util.Scanner;

public class BillPrintf {
   public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
     /* product name = mango
    quantity = 4
    price = 2.5 */
    System.out.print("Enter product name: ");
    String product = sc.nextLine();
    System.out.print("Enter quantity: ");
    int qty = sc.nextInt();
    /* nextInt(), nextDouble(); next(); nextLine(); next().charAt(i); */
    System.out.print("Enter price: ");
    double  price = sc.nextDouble();

    double total = qty*price;

    System.out.println("\n---- BILL ----");
    System.out.println("Product: " + product);
    System.out.println("Quantity: " + qty);
    System.out.printf("Price: %.2f\n"+ price);
    System.out.printf("Total: %.2f\n",total);
   } 
}
/* print-> same line
println-> separate lines 
printf-> formatting 
printf notes -> 1.when using println method do not use +, 
it may not show redline and it will print incluidng the formaters 
2. when using the printf we cant use the the + coz missingFormatArgumentException will arise 
 */