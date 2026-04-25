class Employee{
    String name;
    double salary;

    void work(){
        System.out.println("Employee is working");
    }
}
class Developer extends Employee{
       void writecode(){
        System.out.println("Developer writes the code.");
       } 
    }
class Tester extends Employee{
    void testSoftware(){
        System.out.println("Tester tests software");
    }
}

public class empinherit {
    public static void main(String[] args){
        //create an employee
Employee e1 = new Employee();

    }
}
