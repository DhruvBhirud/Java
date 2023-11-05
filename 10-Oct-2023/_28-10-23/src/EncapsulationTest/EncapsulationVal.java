package EncapsulationTest;

public class EncapsulationVal {
    private int ssn;
    private String empName;
    private int empAge;
    //Getter and Setter Method

    public int getEmpSSN(){
        return ssn;
    }
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
    public void setEmpName(String newValue){
        empName = newValue;
    }
    public void setEmpAge(int newValue){
        empAge = newValue;
    }
}
