package basic_java;
class CallStudent{
  String name;
void study(){
    System.out.println(name  + " is studying");
 }
}
public class WednesdayStudent {
    public static void main(String[] args) {
        CallStudent c1 = new CallStudent();
        CallStudent c2 = new CallStudent();
        CallStudent c3 = new CallStudent();
        c1.name="Riyaz";
        c1.study();
       c2.study();
       c3.study();
         c2.name="Ahammed";
         c3.study();
         c2.study();
         c1.study();
     
    }
}
