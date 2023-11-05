package String;

public class Main {
    public static void main(String[] args){
        //Creating string using string literal
        String s1 = "GmailAccess";
        String s2 = "GmailAccess";

        //Creating string using new keyword
        String s3 = new String("GmailAccess");
        String s4 = new String("GmailAccess");

        if(s1==s2){
            System.out.println("s1 and s2 are equal");
        }
//        if(s1.equals(s2)){
//            System.out.println("s1 and s2 are equal");
//        }
        else{
            System.out.println("s1 and s2 are not equal");
        }
        if(s3==s4){
            System.out.println("s3 and s4 are equal");
        }
//        if(s3.equals(s4)){
//            System.out.println("s3 and s4 are equal");
//        }
        else{
            System.out.println("s3 and s4 are not equal");
        }
    }
}
