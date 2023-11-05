package Interface;

public class Main implements printable {
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.print();
    }
}