

public class Main {

	public static void main(String[] args) {
		
//		Employee cristian = new Employee("Cristian", "López", 001,30,25000.00);
	//	Employee cristian = new Employee("Cristian", "López", 001,30,100,10,25000.00,1);
		SalesRep cristian = new SalesRep("Cristian", "López", 001,30,100,10,25000.00,1,1500.00);
		
		SalesManager manager = new SalesManager("Andrés", "Erazo", 1000,45,152,0,950.25,15,0);
		
		manager.addSalesRep(new SalesRep("Libertad", "Rivas", 2501,21,125,1,250,3,25500));
		manager.addSalesRep(new SalesRep("Carlos", "Argueta", 2502,20,125,1,250,3,25500));
		
		//System.out.println(manager.calculateBonus());
		System.out.println("SALARIO"+manager.getSalary()+manager.calculateBonus());
		System.out.println("INFO 2501"+manager.getSalesRep(2501).calculateCommission());
		System.out.println(manager);
		
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
