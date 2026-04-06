package basic_java;

import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*print sum of n numbers 1 to n -> sum
        1.start -> predefine
        2.stop-> n value
        3.single step -> ++*/
        //how to initialize the start value 
        int i=1;
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        int sum =0;
        while(i<=n){
            sum=sum+i;//previous sum +present / cureent  i value 
            i++;
        }
        System.out.println("Sum = " + sum);
        
    }
}
