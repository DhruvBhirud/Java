abstract class Shape {
    abstract void draw();
}
//Implementation is provided by other by user
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
//IR Scenario method is called by programmer
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}