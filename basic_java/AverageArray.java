package basic_java;
public class AverageArray {
    public static void main(String[] args){
        /*
        1. create array/ user defined array
        2. find teh total sum
        3. total sum/ number of elements  */

        int[] arr = {10,12,70,40,50}; // creation of Array
        //finding the total sum 
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
         }
         //finding the Avg
         double avg = (double) sum/arr.length;
         System.out.println("Aerage = " + avg);
    }
}
