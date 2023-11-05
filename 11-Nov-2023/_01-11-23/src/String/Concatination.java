package String;

public class Concatination {
    public static void main (String[] args){
        String s ="Sachin"; //concat() mehtod appends the string
        String a = s.concat(" Tendulkar");  //will print only Sachin because String is immutable object
        System.out.println(a);
    }
}
