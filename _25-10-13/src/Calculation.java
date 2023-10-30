class Calculation {
    void fact(int a){
        for(int i = 1; i<=a;i++){
            a = a*i;
        }
        System.out.println("factorial: "+a);
    }
    public static void main(String[] args){
        new Calculation().fact(5);
    }
}