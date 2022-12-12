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

    public string getName()
    {
    	return name;
    }

    public double getAvg()
    {
    	return avg;
    }



}


class DemoStudent
{

    public static void main(String args[])
    {
        Student st[] = new Student[5];

        st[0] = new Student(1, "Akash", 98.98);
        st[1] = new Student(2, "Chetan", 45.24);
        st[2] = new Student(3, "Sandeep", 67.62);
        st[3] = new Student(4, "Seeta", 78.21);
        st[4] = new Student(5, "Shakti", 93.00);
        Student.showStudent(st);




    }
}