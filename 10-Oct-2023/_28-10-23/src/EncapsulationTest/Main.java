package EncapsulationTest;

public class Main {
    public static void main(String[] args) {
        EncapsulationVal obj =new EncapsulationVal();
        obj.setEmpName("Vaish");
        obj.setEmpAge(22);
        obj.setEmpSSN(810247918);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee SSN: "+obj.getEmpSSN());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}