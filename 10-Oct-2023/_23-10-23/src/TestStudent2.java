class StudentTest2{
    int id;
    String name;
}
public class TestStudent2 {
    public static void main (String[] args) {
        StudentTest2 s1 = new StudentTest2();
        StudentTest2 s2 = new StudentTest2();
        s1.id = 101;
        s1.name = "Dhruv";
        System.out.println(s1.id + " " + s1.name);
    }
}
