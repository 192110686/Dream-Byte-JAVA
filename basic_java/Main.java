package basic_java;
public class Main {
   int add(int a, int b){
      return a+b;
   }
    public static void main(String[] args) {
      Main m = new Main();
     int result= m.add(20,30);
     System.out.println(result);
    }
}
