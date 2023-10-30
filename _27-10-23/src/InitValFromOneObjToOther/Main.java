package InitValFromOneObjToOther;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(111,"Dhruv");
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}