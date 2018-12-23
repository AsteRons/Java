package Part_2;

public class Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Person p = new Student("Tom", "Ekonomia");

		
	}

}

class Student extends Person
{
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	public String getDescription()
	{
		return "Student specjalizacji " + major;
	}

	
}