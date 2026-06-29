class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
public class customMarks {
private int marks;
public void setMarks(int marks) throws InvalidMarksException{
  if(marks<0 || marks>100){
    throw new InvalidMarksException("Marks should be between 0 nad 100");
  }
  else{
    this.marks=marks;
 }
}
public int getMarks(){
   return marks; 
}
   public static void main(String[] args) {
customMarks m = new customMarks();
try{
    m.setMarks(-30);
}
catch(InvalidMarksException e){
    System.out.println(e);
}
   } 
}
