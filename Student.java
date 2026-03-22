package realworld.java;

public class Student {

    private int rollNumber;
    private String name;
    private int mark1, mark2, mark3;
    private int total;
    private double percentage;
    private char grade;

    // Constructor
    public Student() {}

    // Getters and setters
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMark1() { return mark1; }
    public void setMark1(int mark1) { this.mark1 = mark1; }

    public int getMark2() { return mark2; }
    public void setMark2(int mark2) { this.mark2 = mark2; }

    public int getMark3() { return mark3; }
    public void setMark3(int mark3) { this.mark3 = mark3; }

    public int getTotal() { return total; }
    public double getPercentage() { return percentage; }
    public char getGrade() { return grade; }

    // Calculate total, percentage, grade
    public void calculateResult() {
        total = mark1 + mark2 + mark3;
        percentage = total / 3.0;

        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 50) grade = 'D';
        else grade = 'F';
    }

    // Formatted report
    public String getReport() {
        return "\n-------- Report ---------" +
               "\nName: " + name +
               "\nRoll Number: " + rollNumber +
               "\nMarks: " + mark1 + " " + mark2 + " " + mark3 +
               "\nTotal: " + total +
               "\nPercentage: " + String.format("%.2f", percentage) +
               "\nGrade: " + grade + "\n";
    }
}
