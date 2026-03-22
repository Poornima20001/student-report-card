package realworld.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentUtils {

    // Input student details
    public static void inputStudentDetails(Student s, Scanner sc) {
        System.out.println("Enter Roll Number:");
        s.setRollNumber(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.println("Enter Name:");
        s.setName(sc.nextLine());

        System.out.println("Enter Mark 1:");
        s.setMark1(validateMark(sc));

        System.out.println("Enter Mark 2:");
        s.setMark2(validateMark(sc));

        System.out.println("Enter Mark 3:");
        s.setMark3(validateMark(sc));

        s.calculateResult();
    }

    // Validate marks (0-100)
    private static int validateMark(Scanner sc) {
        int mark;
        while (true) {
            mark = sc.nextInt();
            if (mark >= 0 && mark <= 100) {
                break;
            } else {
                System.out.println("Invalid number. Enter 0-100:");
            }
        }
        return mark;
    }

    // Save student reports to file
    public static void saveToFile(Student s, FileWriter writer) throws IOException {
        writer.write(s.getReport());
    }
}
