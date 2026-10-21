public class Student {
    private int rollNo;
    private String name;
    private String dob;
    private String studentClass;

    public Student() {
    }

    public Student(int rollNo, String name, String dob, String studentClass) {
        this.rollNo = rollNo;
        this.name = name;
        this.dob = dob;
        this.studentClass = studentClass;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public void display() {
      
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("DOB         : " + dob);
        System.out.println("Class       : " + studentClass);
        
    }

    @Override
    public String toString() {
        return String.format("| %-10d | %-20s | %-12s | %-15s |", 
            rollNo, name, dob, studentClass);
    }
}
