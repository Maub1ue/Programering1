package employee;

public class Employee {
	private int id;
	private String lastname;
	private String firstName;
	private int salary;

	public Employee(int id, String firstName, String lastname, int salary) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastname(lastname);
		this.setSalary(salary);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getName() {
		return firstName + lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;

	}

	public int raiseSalary(int percent) {
		this.salary = salary * percent;
		return salary;
	}

	public String toString() {
		return "Employee[id= " + id + " name= " + firstName + lastname + " Salary= " + salary + "]";

	}

}
