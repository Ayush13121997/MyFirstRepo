package in.Collection.Set.Comparator4;

public class Employee implements Comparable {

	String name;

	int eid;

	public Employee(String name, int id) {

		this.name = name;
		this.eid = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Object o) {

		int eid1 = this.eid;

		Employee e = (Employee) o;

		int eid2 = e.eid;

		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		} else {
			return 0;
		}
	}

}
