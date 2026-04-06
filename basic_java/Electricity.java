package basic_java;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units: ");
        double units = sc.nextDouble();
        //u<100 -> very low usage
        if(units<100){
            System.out.println("very low usage " + units + " units");
        }
        //u>=100 &&n u<200 low uage 
        else if (units>=100 && units<200){
            System.out.println("low usage " + units + " units");
        }
        //u>=200 && n<300 medium uage
        else if(units>=200 && units <300){
            System.out.println("medium usage " + units + " units");
        } 
        //>=500 hign usage 
        else{
            System.out.println("hign usage " + units + " units");
        }
    }
    //output -> low usage - 103.678 units
}
