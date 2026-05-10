class Employee{

    //declaring our data as private members
   private String name;
   private int marks;

   //declaring getter method
   public String getName(){
    return name;
   }
   public int getMarks(){
    return marks;
   }
   //declaring setter method
    public void setName(String name){
    this.name=name;
   }
   
  public void setMarks(int marks){
    if(marks>=0 && marks<=100){
        this.marks=marks;
    } else{
        System.out.println("Invalid marks");
    } 
  }

}
public class Encapsulation {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setName("Sri");
        e1.setMarks(1000);
        System.out.println("Name: " + e1.getName());
         System.out.println("Marks: " + e1.getMarks()); 
    }
}
