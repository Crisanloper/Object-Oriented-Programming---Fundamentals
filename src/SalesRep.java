
public class SalesRep extends Employee {

	double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor
	public double calculateCommission() {
	    return 0.1 * salesMade; // Comisión es el 10% de las ventas realizadas
	}//calculateCommission
	public double getSalesMade() {
		return salesMade;
	}//getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}//setSalesMade

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()="
				+ timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()="
				+ calculateBonus() + "]";
	}//toString
	
	
	

}//class SalesRep
