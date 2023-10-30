package aggregation;

public class Employee1{
    public static void main (String[] args) {
        Address address1 = new Address("gzb","UP","India");
        Address address2 = new Address("gno","UP","India");

        Employee2 e = new Employee2(111,"Dhruv",address1);
        Employee2 e1 = new Employee2(112,"Vaish",address2);
        e.display();
        e1.display();
    }
}