/*They are used in function declarations as a parameter.
Allows zero to multiple n arguments to be passed when the function is called it is known as var arguments or ellipsis*/
public class Main {
    static void display(String...values){
        for (String s:values){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        display();
        display("Hello");
        display("Dhruv","Vaish","Yuvraj");
    }
}