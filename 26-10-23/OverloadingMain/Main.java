//Can we overload main method, YES
public class Main {
    public static void main(String[] args) {
        System.out.println("Main w String[]");
    }
    public static void main(String args){
        System.out.println("Main with String");
    }
    public static void main(){
        System.out.println("Main without args");
    }
}