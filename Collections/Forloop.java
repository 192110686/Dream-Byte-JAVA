import java.util.ArrayList;

public class Forloop {
    public static void main(String[] args) {
    ArrayList<Integer> names = new ArrayList<>();
    names.add(70);
     names.add(80);
        names.add(90);
    for(int i=0; i<names.size(); i++){
        int a = names.get(i) + 5;
        names.set(i,a);
        // if(i==2){
        //     names.set(2,78);
        // }
        // else{
        //     continue;
        // }
    }
        System.out.println(names);
}
}
