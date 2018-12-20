package Part_1;

public class Manager extends Employee 
{
	private double bonus;
	
	/**
	 * 
	 * @param name imie i nazwisko pracownika
	 * @param salary pensja
	 * @param years rok zatrudnienia
	 * @param month miesi¹c zatrudnienia
	 * @param day dzieñ zatrudnienia
	 */

	
	public Manager(String name, double salary, int years, int month, int day) {
		super(name, salary, years, month, day);
		bonus = 0;
	}
	
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	
}
