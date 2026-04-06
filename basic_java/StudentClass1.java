package basic_java;
class Student1{
    static String name;
    int age;
    char grade;
    boolean pass;
}
public class StudentClass1{
    public static void main(String[] args) {
        //classname objname = new classname();
        Student1 s1 = new Student1();
        s1.name="Java";
        s1.age=21;
        s1.grade='A';
        s1.pass=true;
        Student1 s2 = new Student1();
        s2.name="Ramesh";
        s2.age=40;
        s2.grade='F';
        s2.pass=false;
        Student1 s3 = new Student1();
        s3.name="Rahul";
        s3.age=21;
        s3.grade='A';
        s3.pass=true;
        System.out.println("-----------Studnet 1 data -------------");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.grade);
        System.out.println(s1.pass);
        System.out.println("---------------Student 2 Data--------------");
        System.out.println("Name : " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Grade: " + s2.grade);
        System.out.println("Pass: " + s2.pass);
         System.out.println("---------------Student 3 Data--------------");
        System.out.println("Name : " + s3.name);
        System.out.println("Age: " + s3.age);
        System.out.println("Grade: " + s3.grade);
        System.out.println("Pass: " + s3.pass);
    }
}