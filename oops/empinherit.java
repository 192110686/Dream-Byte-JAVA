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
    e1.name="Lokanatham";
    e1.salary=100000;
    e1.work();
    //create a developer
    Developer d1 = new Developer();
    d1.name="Vishnu";
    d1.salary=80000;
    d1.work();
    d1.writecode();
    //create a tester
    Tester t1 = new Tester();
    t1.name="Naveen";
    t1.salary=90000;
    t1.work();
    t1.testSoftware();
    }
}
