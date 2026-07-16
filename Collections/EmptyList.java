
import java.util.ArrayList;

public class EmptyList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(50);
        names.add("Naveen");
        names.add("Vishnu");
        names.add("megha");
        System.out.println("List: " + names);
        System.out.println("Size: " + names.size());
        ArrayList<String> secondList = new ArrayList<>(names);
        System.out.println(secondList);
    }
}
