package employee;

public class Main {


	public static void main(String[] args) {

		Employee employee1 = new Employee(16, "Jonas", "Andrée", 5000);
		
		
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getAnnualSalary() );
		System.out.println(employee1.raiseSalary(20) );
		System.out.println(employee1.toString() );
				
				
	}

}
