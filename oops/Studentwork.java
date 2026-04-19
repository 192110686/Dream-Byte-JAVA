class Student{
    private String name;
    private int rollNo;
    private int mark;
    
    //step 2 : Setters(to assign values)
    public void setName(String name){
        this.name=name;
    }
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public void setMark(int mark){
        this.mark=mark;
    }

    //step 3: Getters(to retrieve data)
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    } 
    public int getMark(){
        return mark;
    }
    // public void displayStudentDetails(){
    //     System.out.println("Student Details");
    //         System.out.println("Name: " + name);
    //         System.out.println("Roll No: " + rollNo);
    //         System.out.println("Mark: " + mark);    
    // }
}
public class Studentwork {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Anu");
        s1.setRollNo(101);
        s1.setMark(85);
        System.out.println("Using getters we are retrieving the data ");
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Mark: " + s1.getMark());

        // System.out.println();
        // s1.displayStudentDetails();
    }
}
