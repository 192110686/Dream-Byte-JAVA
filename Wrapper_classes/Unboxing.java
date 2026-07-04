public class Unboxing {
    public static void main(String[] args){
        Integer obj = Integer.valueOf(null); //manual conversion
        int a = obj;
        System.out.println(obj);
        System.out.println(a);
    }
}

