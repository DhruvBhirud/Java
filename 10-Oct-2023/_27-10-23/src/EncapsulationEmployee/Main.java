package EncapsulationEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeCount e = new EmployeeCount();
        e.setNumOfEmployees(900);
        System.out.println("Number of Employees: "+e.getNoOfEmployees());
    }
}