import java.util.HashMap;

public class SalesManager extends SalesRep {

	
private HashMap<Integer, SalesRep>salesTeam=new HashMap<Integer, SalesRep>() ;


public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesMade=salesMade;
	}//constructor


    public double calculateComission() {
    	double total =0;
    	for (SalesRep salesRep : salesTeam.values()) {
			total+= salesRep.getSalesMade();
		}//forEach
    	return 0.03*total;
    }//calculateComission

    public void addSalesRep(SalesRep salesRep) {
		salesTeam.put(salesRep.getRegistration(), salesRep);	
	}//addSalesRep
    
    public SalesRep getSalesRep(int registration) {
    	return salesTeam.get(registration);
    }//getSalesRep
    
    public void printSalesTeamInfo() {
    	for (SalesRep salesRep: salesTeam.values()) {
    		System.out.println(salesRep.toString()+
    				salesRep.calculateBonus()+salesRep.getVacationDaysTaken());
    	}//foreach
    }//printSalesTeamInfo


	@Override
	public String toString() {
		return "SalesManager [calculateCommission()=" + calculateCommission() + ", getSalesMade()=" + getSalesMade()
				+ ", toString()=" + super.toString() + ", timeToRetirement()=" + timeToRetirement()
				+ ", vacationTimeLeft()=" + vacationTimeLeft() + ", calculateBonus()=" + calculateBonus()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getRegistration()="
				+ getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()=" + getDaysWorked()
				+ ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()=" + getSalary() + "]";
	}//toString
    
	



	
}//class SalesManager
