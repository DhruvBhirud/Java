package OverloadConstructor;

public class Student {
    int id;
    String name;
    int age;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    Student(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
}
