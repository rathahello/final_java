package final_exam;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Daro", 10, "PNC");
		System.out.println(student);
		student.showSleepQuality();
		
		Employee employee = new Employee(8, "Teb", 600);
		System.out.println(employee);
		employee.showSleepQuality();
	}
	
	}


