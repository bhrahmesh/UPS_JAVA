
import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    String toFile() {
        return id + "," + name + "," + department + "," + salary;
    }
}

public class MiniProj {
    static ArrayList<Employee> employees = new ArrayList<>();
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static HashSet<Integer> employeeIds = new HashSet<>();

    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "employees.txt";

    static void addEmployee() {
        try {
            System.out.print("Enter employee ID: ");
            int id = Integer.parseInt(sc.nextLine());

            if (employeeIds.contains(id)) {
                System.out.println("Employee ID already exists.");
                return;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter department: ");
            String department = sc.nextLine().trim();

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (id <= 0 || name.isEmpty() || department.isEmpty()
                    || !Double.isFinite(salary) || salary < 0) {
                System.out.println("Invalid employee details.");
                return;
            }

            Employee e = new Employee(id, name, department, salary);

            employees.add(e);
            employeeMap.put(id, e);
            employeeIds.add(id);

            System.out.println("Employee added successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Enter a valid ID and salary.");
        }
    }

    static void searchEmployee() {
        System.out.print("Enter employee ID to search: ");

        try {
            int id = Integer.parseInt(sc.nextLine());
            Employee e = employeeMap.get(id);

            if (e != null) {
                e.display();
            } else {
                System.out.println("Employee not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void updateSalary() {
        System.out.print("Enter employee ID: ");

        try {
            int id = Integer.parseInt(sc.nextLine());
            Employee e = employeeMap.get(id);

            if (e == null) {
                System.out.println("Employee not found.");
                return;
            }

            System.out.print("Enter new salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            if (!Double.isFinite(salary) || salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            e.salary = salary;
            System.out.println("Salary updated successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Enter valid numeric values.");
        }
    }

    static void deleteEmployee() {
        System.out.print("Enter employee ID to delete: ");

        try {
            int id = Integer.parseInt(sc.nextLine());
            Employee e = employeeMap.remove(id);

            if (e != null) {
                employees.remove(e);
                employeeIds.remove(id);
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID.");
        }
    }

    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    static void saveEmployees() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Employee e : employees) {
                bw.write(e.toFile());
                bw.newLine();
            }

            System.out.println("Records saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving records: " + e.getMessage());
        }
    }

    static void loadEmployees() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);

                if (data.length != 4) {
                    System.out.println("Skipping invalid record.");
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String department = data[2];
                    double salary = Double.parseDouble(data[3]);

                    if (id <= 0 || name.trim().isEmpty()
                            || department.trim().isEmpty()
                            || !Double.isFinite(salary) || salary < 0
                            || employeeIds.contains(id)) {
                        System.out.println("Skipping invalid record.");
                        continue;
                    }

                    Employee e = new Employee(id, name, department, salary);

                    employees.add(e);
                    employeeMap.put(id, e);
                    employeeIds.add(id);

                } catch (NumberFormatException ex) {
                    System.out.println("Skipping invalid record.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        loadEmployees();

        while (true) {
            System.out.println("\n===== Employee Record Manager =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Save and Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;

                case "2":
                    searchEmployee();
                    break;

                case "3":
                    updateSalary();
                    break;

                case "4":
                    deleteEmployee();
                    break;

                case "5":
                    displayEmployees();
                    break;

                case "6":
                    saveEmployees();
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
