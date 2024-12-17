package codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the number of subjects: ");
    int numOfSubjects = scan.nextInt();

    double[] subjectMarks = new double[numOfSubjects];
    double totalMarks = 0;

    for (int i = 0; i < numOfSubjects; i++) {
    	
        System.out.println("Enter marks obtained in subject " + (i + 1) + " out of 100: ");
        
        subjectMarks[i] = scan.nextDouble();
        totalMarks += subjectMarks[i];
    }

    double averagePercentage = (totalMarks / numOfSubjects) ;

    System.out.println("Total Marks = " + totalMarks + ", Average Percentage = " + averagePercentage + "%");
    
    if (averagePercentage >= 90) {
        System.out.println("Excellent!");
    } else if (averagePercentage >= 50) {
        System.out.println("Average.");
    } else {
        System.out.println("Poor.");
    }

    scan.close();
}
}
