package NPIE;

import java.util.ArrayList;
import java.util.Scanner;

import javax.script.ScriptException;

public class TPUML {

	// 
	static ArrayList<Unit> units_list = new ArrayList();		// contains the Units created
	static ArrayList<String> convs_list = new ArrayList();  // contains the complex conversions

	///////////////////////////////// MAIN ///////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws ScriptException {

		// Adding the reference Units
		Unit metre = new Unit("Metre", UnitSystem.MetricSystem, UnitType.Length, 1, FactorType.Simple, true);
		units_list.add(metre);

		Unit seconde = new Unit("Seconde", UnitSystem.Time, UnitType.Time, 1, FactorType.Simple, true);
		units_list.add(seconde);

		Unit kilogramme = new Unit("Kilogramme", UnitSystem.MetricSystem, UnitType.Mass, 1, FactorType.Simple, true);
		units_list.add(kilogramme);

		Unit kelvin = new Unit("Kelvin", UnitSystem.Temperature, UnitType.Temperature, 1, FactorType.Simple, true);
		units_list.add(kelvin);

		Unit dollar = new Unit("Dollar", UnitSystem.MonetarySystem, UnitType.Currency, 1, FactorType.Simple, true);
		units_list.add(dollar);

		// Menu
		Integer choice = 0;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		do{

			System.out.println("////////Welcome///////////////////////////////////////////////////////////////////////////////");
			System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("                                       UNIT CONVERTER ");
			System.out.println("//////////////////////////////////////////////////////////////// Authors : HADDOUCH & ROLLAND /////////////");
			System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
			System.out.println("1- Add new Unit");
			System.out.println("2- Display Units");
			System.out.println("3- Perform a conversion");
			System.out.println("4- Exit");
			choice= sc.nextInt();
			switch(choice){
                            case 1 : 
				units_list.add(Unit.AddUnit());
			break;
                            case 2 : 
				System.out.println("Units presently registered :\n");
			Unit.displayUnits(units_list);
			System.out.println("\n");
			break;
                            case 3 : 
				System.out.println("Performing a conversion");
			Scanner sc2 = new Scanner(System.in);
			Integer SysChoice =0;
			UnitSystem temp =  UnitSystem.MetricSystem;
			Integer choice2 = 0;



			///////////////////////////////// Conversion : Source Unit
			System.out.println("Select the System of the source Unit : \n");
			System.out.println("1- MetricSystem ");
			System.out.println("2- ImperialSystem ");
			System.out.println("3- MonetarySystem ");
			System.out.println("4- Time ");
			System.out.println("5- Temperature ");
			SysChoice = sc2.nextInt();
			switch(SysChoice){
                            case 1 : 
				temp = UnitSystem.MetricSystem;
			break;
                            case 2 : 
				temp = UnitSystem.ImperialSystem;
			break;
                            case 3 : 
				temp = UnitSystem.MonetarySystem;
			break;
                            case 4 : 
				temp = UnitSystem.Time;
			break;
                            case 5 : 
				temp = UnitSystem.Temperature;
			break;
			}

			System.out.println("Select the source Unit : \n");
			int cpt = 1;
			ArrayList<Unit> units_list2 = new ArrayList<Unit>();
			for (Unit unit : units_list) {
				if(unit.getUnitSystem()==temp){
					System.out.println(cpt +"- "+ unit.toString());
					units_list2.add(unit);
					cpt++;
				}

			}
			choice2 = sc2.nextInt();
			Unit src = units_list2.get(choice2 - 1 );
			units_list2.clear();





			////////////////////////////// Conversion : Target Unit
			Integer choice3 = 0;
			cpt =1;		
			System.out.println("Select the System of the target Unit : \n");
			System.out.println("1- MetricSystem ");
			System.out.println("2- ImperialSystem ");
			System.out.println("3- MonetarySystem ");
			System.out.println("4- Time ");
			System.out.println("5- Temperature ");
			SysChoice = sc2.nextInt();
			switch(SysChoice){
                            case 1 : 
				temp = UnitSystem.MetricSystem;
			break;
                            case 2 : 
				temp = UnitSystem.ImperialSystem;
			break;
                            case 3 : 
				temp = UnitSystem.MonetarySystem;
			break;
                            case 4 : 
				temp = UnitSystem.Time;
			break;
                            case 5 : 
				temp = UnitSystem.Temperature;
			break;
			}

			System.out.println("Select the target Unit : \n");
			// create temp list for only same type Units

			for (Unit unit : units_list) {
				//display only same type Units
				if (unit.getUnitType()==src.getUnitType() && unit.getName()!=src.getName() && unit.getUnitSystem()==temp){
					System.out.println(cpt +"- "+ unit.toString());
					cpt++;
					units_list2.add(unit);
				}
			}
			choice3 = sc2.nextInt();
			Unit tgt = units_list2.get(choice3 - 1 );

			
			////////////////////////////// Conversion : Amount
			System.out.println("Enter the amount to convert : \n");
			double amt = sc2.nextDouble();

			
			///////////////////////////// Conversion : Functions calls
		
			double convRes = 0;

			/////// Simple
			if (src.getFactorType()==FactorType.Simple && tgt.getFactorType()==FactorType.Simple ) {

				SimpleConversion simpleConversion = new SimpleConversion(src, tgt,amt);
				convRes = simpleConversion.SimpleConv();

				

				/////// Complex 
			} else {

				ComplexConversion complexConversion = new ComplexConversion(src, tgt,amt);

				boolean exist=false;
				String operation ="";
				// test if we already did this conversion
				String testString=src.getName() + "/" + tgt.getName() + "/";
				for (String string : convs_list ) {
					// already did
					if (string.contains(testString)){
						System.out.println("The formula for this conversion is already known :)");	
						String str[] = string.split("/");
						operation = str[2];
						exist = true;				
					}
				}
				if (exist) {
					convRes = complexConversion.ComplexConv(src, tgt, operation);
				
				} else {

					convRes=complexConversion.ComplexConv();
					
				}
			}
			System.out.println(amt + " " + src.getName() + " = " + convRes + " " + tgt.getName());
			break;

                            case 4 :
				System.out.println("Bye !");
			exit = true;
			break;
			} 
		}while(choice!=4 | exit == false);
		sc.close();
	}
}