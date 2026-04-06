package basic_java;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*string -> reversed string -> if equal -> palindrome */
        String str = sc.nextLine(); //->immutable
      StringBuilder rev = new StringBuilder(str);//->mutable
        //to reverse the string what method to use ???
        rev.reverse();
        String result = rev.toString();
        //check whether user entered input == reversed string?? //->mutable string
        if(str.equals(result)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
