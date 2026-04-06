package basic_java;
public class EvenOddArray {
    public static void main(String[] args){
        int[] arr = {10,15,20,25,30};
        /*
        1. initialize empty counts for even and odd 
        2. traverse the array through loop
        3. check number % 2
        4. count even
        5. count odd   */
        int even =0;
        int odd =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % 2 == 0)
               even++;
            else
              odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

    }
}
