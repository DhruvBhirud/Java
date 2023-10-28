public class ABC {
    void display(){
        System.out.println("From Parent Class");
    }
}

class XYZ extends ABC {
    void display(){
        System.out.println("From Child Class");
        super.display();
    }
}