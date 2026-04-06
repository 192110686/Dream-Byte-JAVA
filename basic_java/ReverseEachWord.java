package basic_java;
public class ReverseEachWord {
  public static void main(String[] args) {
      String input ="Java is powerful";
      String result = "";
      /*Algorithm: 
-----------
1. Split sentence into words 
2. For each word:
         reverse it 
3. Append to result -> joining/adding at the end 
Variable name = words  */

String[] words = input.split(" ");
//syntax: datatype[] varible name = {data};
/* words[] - 3
0    1   2
java is powerful  */
// for(int i=0;i<words.length;i++){//for each loop
//    StringBuilder sb = new StringBuilder(words[i]);
//    result +=sb.reverse().toString()+" ";
// }

/* two loops -> 1 st outer loop ->  moves across teh words 
inner loop -> moves across characters 
 */
for (int i=0;i<words.length;i++){
    String letter = words[i];
    for(int j=letter.length()-1;j>=0;j--){
        result +=letter.charAt(j);
    }
    result+=" ";
}

//java-> 4 -> 3 2 1 0
           // a v a j
System.out.println(result);
  }
}
