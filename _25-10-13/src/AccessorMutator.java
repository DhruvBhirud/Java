import java.util.Scanner;

public class AccessorMutator {
    private int roll;
    private String name;
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and roll no");
        this.name=sc.next();
        roll=sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }

    public static void main (String[] args){
        AccessorMutator obj = new AccessorMutator();
        obj.display();
    }
}
