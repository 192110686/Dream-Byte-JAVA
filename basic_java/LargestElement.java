package basic_java;
public class LargestElement {
    public static void main(String[] args){
        /* 1.Take first elements of the array as Largest Num 
        2. Compare with others  
        3. Update the Max */
        int[] arr = {12,45,7,89,34};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest = " + max);
    }
}
