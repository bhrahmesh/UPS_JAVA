
import java.io.*;
import java.util.Scanner;

public class Maino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "students.txt";

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter ID, name and marks:");

                int id = sc.nextInt();
                String name = sc.next();
                int marks = sc.nextInt();

                bw.write(id + "," + name + "," + marks);
                bw.newLine();
            }

            bw.close();

            BufferedReader br = new BufferedReader(
                new FileReader(file)
            );

            String line;
            int highest = -1;
            String topper = "";

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);

                if (marks > highest) {
                    highest = marks;
                    topper = line;
                }
            }

            br.close();

            System.out.println("Highest Marks: " + topper);

            System.out.println("\nEnter new student ID, name and marks:");
            int id = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            FileWriter appendWriter = new FileWriter(file, true);
            BufferedWriter appendBuffer =
                new BufferedWriter(appendWriter);

            appendBuffer.write(id + "," + name + "," + marks);
            appendBuffer.newLine();
            appendBuffer.close();

            System.out.println("New student appended successfully.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
