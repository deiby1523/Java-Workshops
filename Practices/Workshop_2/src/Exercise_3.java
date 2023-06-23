import java.util.Scanner;

public class Exercise_3 {
    /*

    Create a program that allows the registration of grades of the group in which
    the user enters the name of the student and the 3 grades corresponding to the
    three cuts of the subject he/she took. Calculate and display on screen the name
    of each student and his final grade. At the end show the best grade, the worst
    grade and the average of the group in the subject taken by the students.
    (Cycle While - Cycle For).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int nStudents;
        double firstCut, secondCut, thirdCut, finalGrade;
        String name;
        double bestGrade = 0;
        double worstGrade = 0;
        String bestStudent = "";
        String worstStudent = "";
        double average = 0;

        System.out.println("Enter the number of students:");
        nStudents = entry.nextInt();


        for (int i = 0; i < nStudents; i++) {
            System.out.println("Enter the name of the student " + (i+1));
            name = entry.next();
            System.out.println("Enter the grade of " + name + " in the first cut");
            firstCut = entry.nextDouble();
            System.out.println("Enter the grade of " + name + " in the second cut");
            secondCut = entry.nextDouble();
            System.out.println("Enter the grade of " + name + " in the third cut");
            thirdCut = entry.nextDouble();
            finalGrade = (firstCut + secondCut + thirdCut) / 3;
            System.out.println("\nThe final grade of " + name + " is " + finalGrade + "\n");
            if (finalGrade > bestGrade) {
                bestGrade = finalGrade;
                bestStudent = name;
            }

            if (i == 0) {
                worstGrade = finalGrade;
            }

            if (finalGrade < worstGrade) {
                worstGrade = finalGrade;
                worstStudent = name;
            }

            average += finalGrade;

        }

        average = average / nStudents;

        System.out.println("The best grade is " + bestGrade + " by the student " + bestStudent + ", the worst grade is " + worstGrade + " by the student " + worstStudent + " and the average grade is " + average);


        entry.close();
    }
}
