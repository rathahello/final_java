package final_exam;

public class Student extends Person {
	String schoolName;
	public Student(String name, double nbOfSleepHours, String schoolName) {
		super(name, nbOfSleepHours);
		this.schoolName = schoolName;
		
	}
	// override from supper class
	@Override
	public void showSleepQuality() {
		 if(nbOfSleepHours < 7) {
			 System.out.println("Needs more sleep");
			}
		 if(nbOfSleepHours > 7 && nbOfSleepHours < 9) {
			System.out.println("has enough sleep");
		 }
		 if(nbOfSleepHours >= 9) {
			 System.out.println("is probably");
		 }
	}
	@Override
	public String toString() {
		return schoolName + " "+ name + " " + nbOfSleepHours;
	}
}
