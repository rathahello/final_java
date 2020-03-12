package final_exam;

public class Employee extends Person implements ITaxPayable {
	double salary;
	public Employee(double salary,String name, double nbOfSleepHours) {
		super(name, nbOfSleepHours);
		this.salary = salary;
		
	}
	public void showSleepQuality(){
		 if(nbOfSleepHours < 5) {
			 System.out.println("Needs more sleep");
			}
		 if(nbOfSleepHours > 5 && nbOfSleepHours < 8) {
			 System.out.println("has enough sleep");
		 }
		 if(nbOfSleepHours > 8) {
			 System.out.println("is probably");
		 }
	}

	@Override
	public double calulateNetSalary() {
		return nbOfSleepHours;
	}
	
	 public String toString() {	 
		return name + nbOfSleepHours;
	 }
	
}
