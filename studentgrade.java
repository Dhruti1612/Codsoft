import java.util.Scanner;

public class Studentgrade
 {
    private String studentName;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;

    public Studentgrade(String studentName) 
    {
        this.studentName = studentName;
    }

    public void setGrades() {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Enter math grade: ");
            mathGrade = scanner.nextDouble();

            System.out.print("Enter science grade: ");
            scienceGrade = scanner.nextDouble();

            System.out.print("Enter english grade: ");
            englishGrade = scanner.nextDouble();
        }
    }

    public void calculateGrade() 
    {
        double average = (mathGrade + scienceGrade + englishGrade) / 3;

        if (average >= 90) 
        {
            System.out.println("Student " + studentName + " has an A grade with an average of " + average);
        } else if (average >= 80)
         {
            System.out.println("Student " + studentName + " has a B grade with an average of " + average);
        } else if (average >= 70) 
        {
            System.out.println("Student " + studentName + " has a C grade with an average of " + average);
        } else if (average >= 60) 
        {
            System.out.println("Student " + studentName + " has a D grade with an average of " + average);
        } else 
        {
            System.out.println("Student " + studentName + " has an F grade with an average of " + average);
        }
    }

    public static void main(String[] args)
     {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Enter student name: ");
            String studentName = scanner.next();

            Studentgrade calculator = new Studentgrade(studentName);
            calculator.setGrades();
            calculator.calculateGrade();
        }
    }
}
