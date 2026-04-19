

//  class Student {
//     String name;
//     int age;
//     String course;

//     Student(){
       
//     }
//     //parameterised constructor with 2 arguments
//     Student(String name, int age){
//         this.name=name;//variable reference 
//         this.age=age;
//         course="Not Assigned";
//     }
//     Student(String name, int age, String course){
//        this.name= name;
//        this.age=age;
//        this.course=course;
//     }
// }

//     //this() -> another constructor call
//     //this.variable -> curent object variable


// public class Cons{
//     public static void main(String[] args) {
//         Student s1 = new Student("Vinay",23,"cse");
//         System.out.println(s1.age);
//     }

// }
    
class Student3{
    String name;
    int age;
    int marks;

    Student3() {
        this("Unknown",0);
       // this("prajith",12,99);
    }

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student3(String name, int age,int marks){
       this(name, age);
        this.marks=marks;       
    }
    void display(){
        System.out.println(name + "  " + age + " " + marks);
    }
}
    public class Cons{
        public static void main(String[] args) {
            Student3 s1 = new Student3();
             s1.display();
            Student3 s2 = new Student3("Vikas", 19, 99);
            s2.display();
        }
    }
