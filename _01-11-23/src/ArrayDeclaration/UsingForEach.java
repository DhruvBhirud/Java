package ArrayDeclaration;

public class UsingForEach {
    public static void main(String[] args){
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        //Print all the array elements using For each loop
        for(double element: myList){
            System.out.println(element);
        }
    }
}
