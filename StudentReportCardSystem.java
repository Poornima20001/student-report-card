package realworld.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentReportCardSystem {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("------ Student Report Card ------");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Save Reports to File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    StudentUtils.inputStudentDetails(s, sc);
                    students.add(s);
                    System.out.println("Successfully added student.\n");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No records found.\n");
                    } else {
                        for (Student st : students) {
                            System.out.println(st.getReport());
                        }
                    }
                    break;

                case 3:
                    try (FileWriter writer = new FileWriter("StudentReports.txt", true)) {
                        for (Student st : students) {
                            StudentUtils.saveToFile(st, writer);
                        }
                        System.out.println("Reports saved to file successfully.\n");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }

        } while (choice != 4);

        sc.close();
    }
}
