package TreeExample;

public class Emp implements Comparable<Emp> {

	int eid;
	String name;
	double sal;

	public Emp(int eid, String name, double sal) {
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

	public int compareTo(Emp e) {
		return ((int) (this.eid - e.eid));
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

}
