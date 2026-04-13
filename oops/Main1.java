class Student1{
   int marks;
    int rollnum;
    Student1(int rollnum,int marks){
        this.rollnum=rollnum;
        this.marks=marks;
    }
void display(){
    System.out.println( rollnum + " " + marks);
}
    }
public class Main1 {
   public static void main(String[] args) {
       Student1 s1 = new Student1(31, 80);
       s1.display();
       Student1 s2 = new Student1(31,89);
       s2.display();
   } 
}
