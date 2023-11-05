public class InstanceMethodExample {
    public static void main(String[] args){
        InstanceMethodExample obj = new InstanceMethodExample();
        System.out.println("The sum is: "+obj.add(12,13));
    }
    int s;
    //user defined method because we have not used static keyword
    public int add(int a, int b){
        s = a+b;
        return s;
    }
}
