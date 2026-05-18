public class CheckedExceptions{
    public static void main(String[] args) {
        try{
        Class.forName("Student");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}