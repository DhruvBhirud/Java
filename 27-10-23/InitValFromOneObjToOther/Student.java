public class Student {
    int id;
    String name;
    //Constructor to Init Integer and String
    Student(int i,String n){
        id=i;
        name=n;
    }
    //Constructor to Init another object
    Student(Student s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
