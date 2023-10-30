class EmployeeTest {
    int id;
    String name;
    float salary;
    void insert(int i, String m, float s) {
        id =i;
        name=m;
        salary=s;
    }
    void display() {
        System.out.println(id+""+name+""+salary);
    }
}
