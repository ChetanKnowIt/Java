
import java.util.Scanner;  // Import the Scanner class

public class Student
{
    private int rno;
    private String name;
    private double avg;

    public Student()
    {

    }

    public Student(int rno, String name, double avg)
    {
        this.rno = rno;
        this.name = name;
        this.avg = avg;
    }

    static void showStudent(Student []s)
    {
        for(int i = 0; i < s.length; i++)
        {
            if (s[i].avg > 75)
                System.out.println(s[i].name + " " + s[i].rno);
        }
    }

    public String toString()
    {
    	return "\t"+rno+"\t"+name+"\t"+avg;
    }

    public int getRno()
    {
    	return rno;
    }

    public String getName()
    {
    	return name;
    }

    public double getAvg()
    {
    	return avg;
    }


    public static Student getHigestAvg(Student s[])
    {

            int index = 0;
            double max = s[0].getAvg();
            for(int i =1; i < s.length; i++)
            {
                if(s[i].getAvg() > max)
                {
                    max = s[i].avg;
                    index = i;
                }
            }

            return s[index];
    }


}


class DemoStudent
{

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       Student students[] = new Student[5];
       for(int i = 0; i< students.length; i++)
       {
            System.out.println("Enter Roll No, Name and Avg: ");
            students[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
       }

       for(int i = 0; i< students.length; i++)
       {
            System.out.println(students[i]);           
       }


       System.out.println("Highest Student Avg Score: "+Student.getHigestAvg(students));

    }
}