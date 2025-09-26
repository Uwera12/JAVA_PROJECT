package StudentGrading;

import java.util.Scanner;

public class STUDENT {

	public static void main(String[] args) {
        Scanner FG= new Scanner(System.in);

        int totalStudents = 0; 
        int passCount = 0;
        int failCount = 0;
        int marks;

        while (true) {
            System.out.print("Enter student marks (0–100) or -1 to stop: ");
            marks = FG.nextInt();

            if (marks == -1) {
                break;
            }

            totalStudents++;

            if (marks >= 80 && marks <= 100) {
                System.out.println("Grade: A");
                passCount++;
            } else if (marks >= 70) {
                System.out.println("Grade: B");
                passCount++;
            } else if (marks >= 60) {
                System.out.println("Grade: C");
                passCount++;
            } else if (marks >= 50) {
                System.out.println("Grade: D");
                passCount++;
            } else {
                System.out.println("Grade: F");
                failCount++;
            }
        }

        // Summary
        System.out.println("\n--- Summary Report ---");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);

        if (totalStudents > 0) {
            double passRate = (passCount * 100.0) / totalStudents;
            System.out.println("Class Pass Rate: " + passRate + "%");
        }

        FG.close();
    }
}



