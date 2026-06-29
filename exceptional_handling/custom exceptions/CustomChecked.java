//created an custom checked exception
class InvalidAgeException extends Exception{
    InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomChecked {
    static void checkAge(int age)throws InvalidAgeException{
        if(age<18){
        throw new InvalidAgeException("Age must be 18 or above to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
  public static void main(String[] args) {
      try {
          checkAge(15);
      } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
      }
  }  
}
