package basic_java;
class Student{
     String name;
    int age;
    static String collegename = "Chaitanya";
}
public class StudentSturday {
    public static void main(String[] args) {
        Student s1 = new Student();
         Student s2 = new Student();
        s1.name="Megha";
        s1.age=20;
         System.out.println(s1.name + " " + " " + Student.collegename);
        System.out.println(s2.name + " "  + " " + Student.collegename);
        s2.name="Vishnu";
        s2.age=21;
         s2.collegename="redcherries";
        System.out.println(s1.name + " " + s1.age + " " + Student.collegename);
        System.out.println(s2.name + " " + s2.age + " " + Student.collegename);
    }
}
