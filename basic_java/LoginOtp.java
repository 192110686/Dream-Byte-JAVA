package basic_java;
import java.util.Scanner;

public class LoginOtp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Username: ");
    String username = sc.nextLine(); 

    if (username.equals("carrot")) {
      System.out.print("Enter OTP: ");
      int otp = sc.nextInt();

      if (otp == 123) {System.out.println("Login success");}
      else{ System.out.println("Login Failed.");}
    } 
    else {
      System.out.println("Invalid username");
    }
    //output -> sharing -> 
  }
}
