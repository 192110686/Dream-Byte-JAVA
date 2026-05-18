public class Exception {
    public static void main(String[] args) {
        try {
            System.out.println("Hi");
           int result = 10/0;
        System.out.println(result); 
        } catch (ArithmeticException e) {
            System.out.println("Handled");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
