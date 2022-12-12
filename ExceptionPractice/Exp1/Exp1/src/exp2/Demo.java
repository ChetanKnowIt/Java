package exp2;
//CORE JAVA EME - 2

public class Demo {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "Seeta", 35256.45);
		Emp e2 = new Emp(102, "Geeta", 7424.72);
		Emp e3 = new Emp(103, "Neeta", 56135.52);

		Emp emps[] = new Emp[3];

		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;

		Dept d1 = new Dept(1, "Tech", emps);
		System.out.println(d1);
		System.out.println(d1.getMaxSal());

	}

}
