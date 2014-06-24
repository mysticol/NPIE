package NPIE;

import java.util.ArrayList;
import java.util.Scanner;

public class Unit {

	// Attributes 
	private String name;
	private UnitSystem unitSystem;
	private UnitType unitType;
	private double factor;
	private FactorType factorType;
	private boolean reference;
	private static Scanner sc;


	// Constructor 
	public Unit(String name, UnitSystem unitSystem, UnitType unitType, double factor, FactorType factorType, boolean reference) {
		this.name = name;
		this.unitSystem = unitSystem;
		this.unitType = unitType;
		this.factor=factor;
		this.factorType=factorType;
		this.reference=reference;
	}

	// Getters and Setters :
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UnitSystem getUnitSystem() {
		return unitSystem;
	}

	public void setUnitSystem(UnitSystem unitSystem) {
		this.unitSystem = unitSystem;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(float factor) {
		this.factor = factor;
	}

	public FactorType getFactorType() {
		return factorType;
	}

	public void setFactorType(FactorType factorType) {
		this.factorType = factorType;
	}

	public boolean getReference() {
		return reference;
	}

	public void setReference(boolean reference) {
		this.reference = reference;
	}

	// To String 
	@Override
	public String toString() {
		String res="";
		if(factorType==FactorType.Simple) {
			res =  name +" ( system = " + unitSystem + ", type = " + unitType + ", factor type = " + factorType +", factor  = " + factor + ", reference = " + reference + " )" ;
		} else {
			res =  name +" ( system = " + unitSystem + ", type = " + unitType + ", factor type = " + factorType +", reference = " + reference + " )" ;
		}
		return res;
	}

	// Add Unit
	public static Unit AddUnit(){

		sc = new Scanner(System.in);
		Integer type =0;
		String title="";
		UnitType unitType = null;
		UnitSystem unitSystem = null;
		boolean uniqueName = true;

		System.out.println("Adding new Unit\n");


		// Type
		do {
			System.out.println("Name :");
			title = sc.nextLine();
			for (Unit unit : TPUML.units_list){
				if(unit.getName().toLowerCase().equals(title.toLowerCase())) {
					uniqueName=false;
					System.out.println("This unit already exists, please create a new one");
				}
			}


		}while(uniqueName==false);

		// System
		do{	

			System.out.println("System :");
			System.out.println("1- Metric");
			System.out.println("2- Imperial");
			System.out.println("3- Monetary");
			System.out.println("4- Temperature");
			System.out.println("5- Time");
			type = sc.nextInt();
			switch(type){
			case 1:
				unitSystem = UnitSystem.MetricSystem;
			break;
			case 2:
				unitSystem = UnitSystem.ImperialSystem;
			break;
			case 3:
				unitSystem = UnitSystem.MonetarySystem;
			break;
			case 4:
				unitSystem = UnitSystem.Temperature;
			break;
			case 5:
				unitSystem = UnitSystem.Time;			
			break;
			default :
				System.out.println(" Please enter one of the numbers above");
				break;
			}
		}while( type!= 1 && type!=2 && type!= 3 && type!= 4 && type!= 5 );


		// Type
		do {

			System.out.println("Type :");
			System.out.println("1- Length");
			System.out.println("2- Mass");
			System.out.println("3- Currency");
			System.out.println("4- Tempertaure");
			System.out.println("5- Time"); 
			type = sc.nextInt();				
			switch(type){
			case 1:
				unitType = UnitType.Length;
			break;
			case 2:
				unitType = UnitType.Mass;
			break;
			case 3:
				unitType = UnitType.Currency;
			break;
			case 4:
				unitType = UnitType.Temperature;
			break;
			case 5:
				unitType = UnitType.Time;				
			break;
			default :
				System.out.println(" Please enter one of the numbers above");
				break;
			}
		}while( type!= 1 && type!=2 && type!= 3 && type!= 4 && type!= 5 );


		// Conversion type
		Integer conv = 0;
		double factor = 0;
		FactorType factType = null;
		do{
			System.out.println("Conversion type :\n"); 
			System.out.println("1- Simple  (1 multiplication) \n");
			System.out.println("2- Complex (addition or 2 operations) \n");
			conv = sc.nextInt();	
			switch(conv){
			case 1:
				factType = FactorType.Simple;
			System.out.println("Enter the conversion factor relative to  reference Unit : \n");
			if (unitType==UnitType.Length) System.out.println("( 1 " + title+" = how many meters ? )\n");
			if (unitType==UnitType.Mass) System.out.println("( 1 " + title+" = how many killogrammes ? )\n");
			if (unitType==UnitType.Currency) System.out.println("( 1 " + title+" = how many dollars ? )\n");
			if (unitType==UnitType.Temperature) System.out.println("( 1 " + title+" = how many kelvins ? )\n");
			if (unitType==UnitType.Time) System.out.println("( 1 " + title+" = how many secondes ? )\n");

			factor = sc.nextDouble();
			break;
			case 2:
				factType = FactorType.Complex;
			break;
			default :
				System.out.println(" Please enter one of the numbers above");
				break;
			}
		}while ( conv != 1 && conv !=2);


		// reference Unit ?
		Integer ref =0;
		boolean bool = false ;
		do{
			System.out.println("Reference Unit ? (Metre, Seconde, Kilogramme, Dollar)  :\n"); 
			System.out.println("1- Yes  \n");
			System.out.println("2- No  \n");
			ref = sc.nextInt();
			switch(ref){
			case 1:
				bool = true ;
			break;
			case 2:
				bool = false;
			break;
			default : 
				System.out.println(" Please enter one of the numbers above");
				break;
			}
		}while ( ref != 1 && ref != 2);


		// Unit creation
		Unit unit = new Unit(title,unitSystem, unitType, factor, factType, bool);
		System.out.println("Unit succesfully created !");
		System.out.println( unit.toString());
		return unit; 
	}

	
	
	
	public static void displayUnits(ArrayList<Unit> liste){
		for (Unit unit : liste) 
			System.out.println(unit.toString());
	}

}