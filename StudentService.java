import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }

        if (exists(student.getRollNo())) {
            return false;
        }

        studentList.add(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }

    public Student getStudentByRollNo(int rollNo) {
        for (Student s : studentList) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
        return null;
    }

    public boolean exists(int rollNo) {
        return getStudentByRollNo(rollNo) != null;
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("\n[!] No student records found in the database.");
            return;
        }

        System.out.println("\n+------------+----------------------+--------------+-----------------+");
        System.out.println("| Roll No    | Name                 | DOB          | Class           |");
        System.out.println("+------------+----------------------+--------------+-----------------+");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("+------------+----------------------+--------------+-----------------+");
        System.out.println("Total Records: " + studentList.size());
    }

    public void displayStudent(int rollNo) {
        Student s = getStudentByRollNo(rollNo);
        if (s == null) {
            System.out.println("\n[!] No student found with Roll Number: " + rollNo);
        } else {
            System.out.println("\n[+] Student Details Found:");
            s.display();
        }
    }

    public boolean updateStudent(int rollNo, String newName, String newDob, String newClass) {
        Student existing = getStudentByRollNo(rollNo);
        if (existing == null) {
            return false;
        }

        if (newName != null && !newName.trim().isEmpty()) {
            existing.setName(newName.trim());
        }
        if (newDob != null && !newDob.trim().isEmpty()) {
            existing.setDob(newDob.trim());
        }
        if (newClass != null && !newClass.trim().isEmpty()) {
            existing.setStudentClass(newClass.trim());
        }

        return true;
    }

    public boolean deleteStudent(int rollNo) {
        Student s = getStudentByRollNo(rollNo);
        if (s == null) {
            return false;
        }
        studentList.remove(s);
        return true;
    }

    public int getTotalStudents() {
        return studentList.size();
    }
}
