package InstanceOf;

public class Dog extends Animal {
    public static void main(String[] args){
        Dog d = new Dog();
        Dog b = null;
        System.out.println(d instanceof Animal);
        System.out.println(b instanceof Animal);
    }
}
