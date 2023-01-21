package em2;
import java.util.*;
class Emp
{
	private int empid;
	private String name;
	private double salary;
	
	public Emp(int e, String n, double s) {
		empid = e;
		name = n;
		salary = s;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
		public String toString() {
		return "Emp with name "+name+"having "+salary;
	}
}

class Dept{
	int deptno;
	String name;
	Emp emps[];
	
	public Dept(int deptno, String dname, Emp[] emps) {
		super();
		this.deptno = deptno;
		this.name = dname;
		this.emps = emps;
	}
	
	public String empWithMaxSal() {
		double max = emps[0].getSalary();
		int maxemp = 0;
		for(int i=0;i<emps.length;i++) {
			if(max<emps[i].getSalary()) {
				max = emps[i].getSalary();
				maxemp=i;
			}
		}
		return emps[maxemp].getName();
	}
}


public class Program {

	public static void main(String[] args) {
		
		try {
			if(args.length % 2!=0 && args.length>=3) {
				Emp[] arr = new Emp[(args.length-1)/2];
				int j = 0;
				for(int i=1;i<args.length;i+=2) {
					arr[j++] = new Emp(j, args[i], Double.parseDouble(args[i+1]));
				}
				Dept d = new Dept(1, args[0], arr);
				System.out.println(d.empWithMaxSal());
			}
			else
				System.out.println("Insufficient Arguments.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
