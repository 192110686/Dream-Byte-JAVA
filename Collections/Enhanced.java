import java.util.ArrayList;

public class Enhanced {
    public static void main(String[] args) {
        // ArrayList<String> names = new ArrayList<>();
        // names.add("Sri");
        // names.add("Anu");
        // names.add("Rahul");
        ArrayList<Integer> names = new ArrayList<>();
        names.add(70);
        names.add(80);
        names.add(90);
        int total =0;
        for(Integer name : names){
       total = total + name;
        }
        System.out.println("Total:" + total);
    }
}
