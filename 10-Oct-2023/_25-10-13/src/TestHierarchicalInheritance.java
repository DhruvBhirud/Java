class Animals1 {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog1 extends Animals1{
    void bark(){
        System.out.println("Barking");
    }
}
class Cat1 extends Animals1{
    void meow(){
        System.out.println("Meowing");
    }
}
public class TestHierarchicalInheritance {
    public static void main(String[] args){
        Cat1 c = new Cat1();
        c.meow();
        c.eat();
        Dog1 d = new Dog1();
        d.bark();
        d.eat();
    }
}
