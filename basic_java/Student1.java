package basic_java;
 class StudentClass {
    String name;
    void study(){
        System.out.println(name + " is studying");
    }
}
public class Student1{
    public static void main(String[] args) {
        //classname objname = new classname();
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass();
        //how to assign value 
        //objname.field_name
        s1.name="Rama";
        s1.study();
        s2.name="Vishnu";
        s2.study();
    }
}