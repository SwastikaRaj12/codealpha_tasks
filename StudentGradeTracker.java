import java.util.Scanner;

public class GradeTracker{
    public static void main(String[] args)
    {
        System.out.println("Student Grade Tracker");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter total number of subjects");

        int numSub = sc.nextInt();
        int totalmarks = 0;
        for(int i=1; i<=numSub; i++)
        {
            System.out.println("Enter marks of subject"+ i + "out of 100");
            int marks = sc.nextInt();

            if(marks < 0|| marks>100)
            {
                System.out.println("Enter marks between 1-100");
                System.out.println("Enter marks of subject"+ i + "out of 100");
                marks = sc.nextInt();
            }
            totalmarks += marks;
        }
        System.out.println("Student result");
        System.out.println("Total marks obtained in all subjects =" + totalmarks);

        sc.close();

        int average = totalmarks/numSub;
        System.err.println("Average Percentage ="+ average);

        if(average>=90)
        {
            System.out.println("Grade: A+");
        }
        else if(average>=82)
        {
            System.out.println("Grade: A");
        }
        else if(average>=73)
        {
            System.out.println("Grade: B+");
        }
        else if(average>=64)
        {
            System.out.println("Grade: B");
        }
        else if(average>=55)
        {
            System.out.println("Grade: C+");
        }
        else if(average>=50)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("YOU ARE FAIL");
        }

    }
}
