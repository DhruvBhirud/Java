package AbstractClassWithBothMethods;

public class Main extends Bike {
    void run(){
        System.out.println("Running Safely");
    }
    //call abstract and non-abstract methods
    public static void main(String[] args) {
        Bike obj = new Main();
        obj.run();
        obj.changeGear();
    }
}