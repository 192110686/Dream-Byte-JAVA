
import java.util.ArrayList;
import java.util.List;

public class ListSyntax {
    public static void main(String[] args){
  List<Integer> list = new ArrayList<>();
  list.add(1);
  list.add(3);
  list.add(1);
  list.add(4);
  list.add(1);
  System.out.println(list.lastIndexOf(1));
for(Integer li:list){
    System.out.println(li);
}
    }
}
