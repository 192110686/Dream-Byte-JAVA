package basic_java;

import java.util.Scanner;

public class GradeCity {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       /* i/p -> garde , city... o/p-> display  */
       System.out.println("Enter your grade (single letter): ");
       char grade = sc.next().charAt(0);
       System.out.println("Enter your city: ");
       sc.nextLine();
       String city = sc.nextLine();
        
       System.out.println("Grade: "+grade);
       System.out.println("City: " + city);
   } 
}

