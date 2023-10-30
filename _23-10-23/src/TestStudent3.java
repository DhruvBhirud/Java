//call method to display information
class StudentTest3 {
    int rollno;
    String name;
    void insertRecord(int r, String n) {
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
    class TestStudent3 {
        public static void main (String[] args) {
            StudentTest3 s1 = new StudentTest3();
            StudentTest3 s2 = new StudentTest3();
            s1.insertRecord(111,"Dhruv");
            s2.insertRecord(222,"Aryan");
            s1.displayInformation();
            s2.displayInformation();
        }
    }
