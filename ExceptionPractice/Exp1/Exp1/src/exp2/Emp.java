package exp2;
// CORE JAVA EME - 2

public class Emp {

	private int empno;
	private String name;
	private double salary;
	
	public Emp(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
