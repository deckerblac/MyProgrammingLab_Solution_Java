/*@molayodecker*/
public class Employee {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Susan Meyers,", 47899, "Marketing.", "Sales Rep");
		staff[1] = new Employee("Mark Jones,", 39119, "IT.", "Programmer");
		staff[2] = new Employee("Joy Rogers,", 81774, "Manufacturing.", "Engineer");

		for (Employee e : staff) {
			System.out.println(e.getName() + " employee number " + e.getidNumber() + "," + " works as a "
					+ e.getPosition() + " in " + e.getDepartment());
		}

	}

	public Employee(String name, int idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.idNumber = idNumber;
		this.position = position;

	}
	


	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getidNumber() {
		return idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public String getPositon() {
		return positon;
	}

	private String name;
	private String position;
	private int idNumber;
	private String department;
	private String positon;
}
