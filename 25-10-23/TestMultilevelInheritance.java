class Animals {
    void eat(){
        System.out.println("Eating");
    }
}
class Dogs extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class BabyDog extends Dogs{
    void weep(){
        System.out.println("Weeping");
    }
}
class TestMultilevelInheritance {
    public static void main (String[] args){
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
