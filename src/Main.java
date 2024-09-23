

public class Main {

	public static void main(String[] args) {
		
//		Employee cristian = new Employee("Cristian", "López", 001,30,25000.00);
	//	Employee cristian = new Employee("Cristian", "López", 001,30,100,10,25000.00,1);
		SalesRep cristian = new SalesRep("Cristian", "López", 001,30,100,10,25000.00,1,1500.00);
	
		cristian.setDaysWorked(100);
		cristian.setYearsWorked(1);
		cristian.setVacationDaysTaken(10);
		
		 int tiempoRetiro = cristian.timeToRetirement();
	     int vacacionesFaltantes = cristian.vacationTimeLeft();
	     double bonus = cristian.calculateBonus();
	     double comision = cristian.calculateCommission(); 
		
		System.out.println(cristian.toString());
		System.out.println("El tiempo que le queda para jubilarse es de : " + tiempoRetiro + " años");
	    System.out.println("Le quedan " + vacacionesFaltantes + " días de vacaciones");	    
	    System.out.println("Su bono es de: " + bonus + " $ MXN");
	    System.out.println("Usted vendió: " + cristian.getSalesMade()+"$ MXN" +" Su comisión es de: "+ comision+ " $ MXN");
	
	}//main

}//class Main
