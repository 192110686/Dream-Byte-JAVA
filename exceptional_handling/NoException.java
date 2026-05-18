public class NoException {
    public static void main(String[] args) {
        try {
           int result = 10/2;
        System.out.println(result); 
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
