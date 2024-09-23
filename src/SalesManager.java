import java.util.HashMap;

public class SalesManager extends SalesRep {
//Al poner Integer para registration me daba error, por eso lo dejé como String.
//Quise utilizar mi valor de registration para poder agregar trabajadores pero ya no di más.	
	HashMap<String, SalesRep>salesTeam=new HashMap<String, SalesRep>() ;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<String, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}//constructor
	
    public void addSalesRep(String registration, SalesRep salesRep) {
        salesTeam.put(registration, salesRep);
    }//addSalesRep

    public void removeSalesRep(String registration) {
        salesTeam.remove(registration);
    }//removeSalesRep

    public SalesRep getSalesRep(String registration) {
        return salesTeam.get(registration);
    }//getSalesRep

//Hasta aquí llegué mil disculpas, hice mi mejor intento.
    
	@Override
	public String toString() {
		return "SalesManager [salesTeam=" + salesTeam + ", calculateCommission()=" + calculateCommission()
				+ ", getSalesMade()=" + getSalesMade() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", timeToRetirement()="
				+ timeToRetirement() + ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()="
				+ calculateBonus() + "]";
	}//toString

	
}//class SalesManager
