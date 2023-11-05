package ArrayToMethod;
//Passing array to method
public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printArray(arr);
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]+" ");
        }
    }
}
