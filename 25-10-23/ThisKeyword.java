class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno, String name, float fee) {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println("Roll No. "+rollno+" Name: "+name+" Fee: "+fee);
    }
}
public class ThisKeyword {
    public static void main (String[] args) {
        Student s1 = new Student(111, "Dhruv", 5000f);
        s1.display();
        Student s2 = new Student(222, "Vaish", 10000f);
        s2.display();
        Student s3 = new Student(333, "Yuvraj", 15000f);
        s3.display();
    }
}
