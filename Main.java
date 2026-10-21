import java.util.Scanner;

class StudentInputHandler {
    private final Scanner scanner;

    public StudentInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("[!] Invalid input. Please enter a valid integer number.");
            }
        }
    }

    public Student getStudentDetailsFromUser(StudentService service) {
        System.out.println("\n--- Enter Student Details ---");
        
        int rollNo;
        while (true) {
            rollNo = readInt("Enter Roll Number: ");
            if (service.exists(rollNo)) {
                System.out.println("[!] A student with Roll No " + rollNo + " already exists. Try another Roll No.");
            } else {
                break;
            }
        }

        String name;
        while (true) {
            name = readString("Enter Student Name: ");
            if (!name.isEmpty()) {
                break;
            }
            System.out.println("[!] Name cannot be empty.");
        }

        String dob;
        while (true) {
            dob = readString("Enter Date of Birth (e.g. DD-MM-YYYY): ");
            if (!dob.isEmpty()) {
                break;
            }
            System.out.println("[!] DOB cannot be empty.");
        }

        String studentClass;
        while (true) {
            studentClass = readString("Enter Class / Course: ");
            if (!studentClass.isEmpty()) {
                break;
            }
            System.out.println("[!] Class cannot be empty.");
        }

        return new Student(rollNo, name, dob, studentClass);
    }

    public int getRollNumberFromUser(String action) {
        return readInt("Enter Roll Number to " + action + ": ");
    }

    public void getUpdateDetailsFromUser(StudentService service) {
        int rollNo = getRollNumberFromUser("update");
        Student existing = service.getStudentByRollNo(rollNo);

        if (existing == null) {
            System.out.println("\n[!] Student with Roll No " + rollNo + " not found!");
            return;
        }

        System.out.println("\n--- Current Details of Student ---");
        existing.display();

        System.out.println("(Leave blank and press Enter to keep current value)");
        String newName = readString("Enter New Name [" + existing.getName() + "]: ");
        String newDob = readString("Enter New DOB [" + existing.getDob() + "]: ");
        String newClass = readString("Enter New Class [" + existing.getStudentClass() + "]: ");

        boolean updated = service.updateStudent(rollNo, newName, newDob, newClass);
        if (updated) {
            System.out.println("\n[+] Student with Roll No " + rollNo + " updated successfully!");
        } else {
            System.out.println("\n[!] Failed to update student.");
        }
    }

    public int getMenuChoice() {
       
        System.out.println("         STUDENT DATABASE APPLICATION        ");
       
        System.out.println("1. Add New Student (Create)");
        System.out.println("2. View All Students (Read)");
        System.out.println("3. Search Student by Roll No (Read)");
        System.out.println("4. Update Student Details (Update)");
        System.out.println("5. Delete Student (Delete)");
        System.out.println("6. Exit");
      
        return readInt("Enter your choice (1-6): ");
    }

    public void close() {
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        StudentInputHandler inputHandler = new StudentInputHandler();

        boolean running = true;

        System.out.println("Welcome to the Student Database Management System!");

        while (running) {
            int choice = inputHandler.getMenuChoice();

            switch (choice) {
                case 1: {
                    Student newStudent = inputHandler.getStudentDetailsFromUser(service);
                    boolean added = service.addStudent(newStudent);
                    if (added) {
                        System.out.println("\n[+] Student added successfully!");
                    } else {
                        System.out.println("\n[!] Error: Could not add student.");
                    }
                    break;
                }

                case 2: {
                    service.displayAllStudents();
                    break;
                }

                case 3: {
                    int rollNo = inputHandler.getRollNumberFromUser("search");
                    service.displayStudent(rollNo);
                    break;
                }

                case 4: {
                    inputHandler.getUpdateDetailsFromUser(service);
                    break;
                }

                case 5: {
                    int rollNo = inputHandler.getRollNumberFromUser("delete");
                    boolean deleted = service.deleteStudent(rollNo);
                    if (deleted) {
                        System.out.println("\n[+] Student with Roll No " + rollNo + " deleted successfully!");
                    } else {
                        System.out.println("\n[!] No student found with Roll No: " + rollNo);
                    }
                    break;
                }

                case 6: {
                    System.out.println("\nThank you for using Student Database Application. Goodbye!");
                    running = false;
                    break;
                }

                default: {
                    System.out.println("\n[!] Invalid choice. Please select an option between 1 and 6.");
                    break;
                }
            }
        }

        inputHandler.close();
    }
}