package HalfPyramid;
//Half Pyramid with star pattern
public class Main {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            System.out.println(" ");
            for(int j=i; j>0; j--){
                System.out.print(" * ");
            }
        }
    }

}
