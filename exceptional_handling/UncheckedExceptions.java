public class UncheckedExceptions {
    public static void main(String[] args) {
        try{
        int x = 10/0;
        System.out.println(x);
        }
        catch(ArithmeticException e){
           // System.out.println(e);
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("program execution successfully completed");
        }











        // System.out.println(x);
        //divide by zero -> ArithmeticException.

    //     int[] arr = {10,20,30,40,50};
    //     System.out.println(arr[5]);
    //     //accessing the elements out of the array gives -> ArrayIndexOutOfBoundsException
    
    // String name=null;
    // System.out.println(name.length());  
    // //calling methods on null causes-> NullPointerException
}
}
