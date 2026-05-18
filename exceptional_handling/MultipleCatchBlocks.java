public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
             int result=10/0;
            int[] arr={10,20,30};
            System.out.println(arr[5]);
          
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is invalid");
        }
        catch(ArithmeticException y){
            System.out.println("Cannot divide by zero");
        }
    }
}
