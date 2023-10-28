public class Dog extends Animal {
    String color = "Black";
    void printColor(){
        System.out.println(color);  //print color of dog class
        System.out.println(super.color);    //print color of Animal class
    }
    void eat(){
        System.out.println("Eating bread (Dog class)");
    }
    //bark method
    void bark(){
        System.out.println("Bark");
    }

    void work(){
        super.eat();
    }
}
