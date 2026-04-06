class Student{
   int marks;
    int rollnum;
    Student(int rollnum,int marks){
        this.rollnum=rollnum;
        this.marks=marks;
    }
void display(){
    System.out.println( rollnum + " " + marks);
}
    }
public class Main1 {
   public static void main(String[] args) {
       Student s1 = new Student(31, 80);
       s1.display();
       Student s2 = new Student(31,89);
       s2.display();
   } 
}
