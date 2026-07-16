
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
     names.add("Naveen");
        names.add("Vishnu");
        names.add("megha");
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}
