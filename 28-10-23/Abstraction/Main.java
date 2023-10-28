public class Main extends Bike {
    void run(){
        System.out.println("Running Safely");
    }
    public static void main(String[] args) {
        Bike obj = new Main();
        obj.run();
        obj.running();
    }
}