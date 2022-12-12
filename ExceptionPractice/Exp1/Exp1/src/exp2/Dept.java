package exp2;
//CORE JAVA EME - 2

import java.util.*;

public class Dept {

	private int deptno;
	private String dname;
	private Emp[] emps;

	public Dept(int deptno, String dname, Emp[] emps) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.emps = emps;
	}

	public double getMaxSal() {
		double max = emps[0].getSalary();
		int index = 0;
		for (int i = 0; i < emps.length; i++) {
			if (max < emps[i].getSalary()) {
				max = emps[i].getSalary();
				index = i;
			}
		}
		return emps[index];
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", emps=" + Arrays.toString(emps) + "]";
	}

}
