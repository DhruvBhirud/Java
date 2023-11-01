package PrintableShowable;

public class Main implements Printable, Showable {
    public void print(){
        System.out.println("Print");
    }
    public static void main(String[] args){
        Printable obj = new Main();
        Showable obj1 = new Main();
        obj.print();
        obj1.print();
    }
}
