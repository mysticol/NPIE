package NPIE;

import java.util.ArrayList;
import java.util.Scanner;

public class Unit {

    private String name;
    private UnitSystem unitSystem;
    private UnitType unitType;
    private double factor;
    private FactorType factorType;
    private boolean reference;
    private static Scanner sc;

    /**
     * Unit Constructor
     *
     * @param name the name of the unit
     * @param unitSystem the UnitSystem of the unit
     * @param unitType the UnitType of the unit
     * @param factor the factor of the unit
     * @param factorType the FactorType of the unit
     * @param reference the Reference of the unit
     */
    public Unit(String name, UnitSystem unitSystem, UnitType unitType, double factor, FactorType factorType, boolean reference) {
        this.name = name;
        this.unitSystem = unitSystem;
        this.unitType = unitType;
        this.factor = factor;
        this.factorType = factorType;
        this.reference = reference;
    }

    /**
     * Return the name of the unit
     *
     * @return the name of the unit
     */
    public String getName() {
        return name;
    }

    /**
     * Edit the name of a unit
     *
     * @param name the new name of the unit
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the UnitSystem of a unit
     *
     * @return the UnitSystem of a unit
     */
    public UnitSystem getUnitSystem() {
        return unitSystem;
    }

    /**
     * Edit the UnitSystem of a unit
     *
     * @param unitSystem the new UnitSystem of a unit
     */
    public void setUnitSystem(UnitSystem unitSystem) {
        this.unitSystem = unitSystem;
    }

    /**
     * Return the UnitType of a unit
     *
     * @return the UnitType of a unit
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Edit the UnitType of a unit
     *
     * @param unitType the new unitType of a unit
     */
    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    /**
     * Return the factor of a unit
     *
     * @return the factor of a unit
     */
    public double getFactor() {
        return factor;
    }

    /**
     * Edit the factor of a unit
     *
     * @param factor the new factor of a unit
     */
    public void setFactor(float factor) {
        this.factor = factor;
    }

    /**
     * Return the factorType of a unit
     *
     * @return the FactorType of a unit
     */
    public FactorType getFactorType() {
        return factorType;
    }

    /**
     * Edit the FactorType of a unit
     *
     * @param factorType the new FactorType of a unit
     */
    public void setFactorType(FactorType factorType) {
        this.factorType = factorType;
    }

    /**
     * Return the Reference of a unit
     *
     * @return the Reference of a unit
     */
    public boolean getReference() {
        return reference;
    }

    /**
     * Edit the Reference of a unit
     *
     * @param reference the new Reference of a unit
     */
    public void setReference(boolean reference) {
        this.reference = reference;
    }

    /**
     * Return a String display of a unit
     *
     * @return a String display of a unit
     */
    @Override
    public String toString() {
        String res = "";
        if (factorType == FactorType.Simple) {
            res = name + " ( system = " + unitSystem + ", type = " + unitType + ", factor type = " + factorType + ", factor  = " + factor + ", reference = " + reference + " )";
        } else {
            res = name + " ( system = " + unitSystem + ", type = " + unitType + ", factor type = " + factorType + ", reference = " + reference + " )";
        }
        return res;
    }

    /**
     * Return a Unit 
     *
     * @return a Unit 
     */
    public static Unit AddUnit() {

        sc = new Scanner(System.in);
        Integer type = 0;
        String title = "";
        UnitType unitType = null;
        UnitSystem unitSystem = null;
        boolean uniqueName = true;

        System.out.println("Adding new Unit\n");

        // Type
        do {
            System.out.println("Name :");
            title = sc.nextLine();
            for (Unit unit : TPUML.units_list) {
                if (unit.getName().toLowerCase().equals(title.toLowerCase())) {
                    uniqueName = false;
                    System.out.println("This unit already exists, please create a new one");
                }
            }

        } while (uniqueName == false);

        // System
        do {

            System.out.println("System :");
            System.out.println("1- Metric");
            System.out.println("2- Imperial");
            System.out.println("3- Monetary");
            System.out.println("4- Temperature");
            System.out.println("5- Time");
            type = sc.nextInt();
            switch (type) {
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
                default:
                    System.out.println(" Please enter one of the numbers above");
                    break;
            }
        } while (type != 1 && type != 2 && type != 3 && type != 4 && type != 5);

        // Type
        do {

            System.out.println("Type :");
            System.out.println("1- Length");
            System.out.println("2- Mass");
            System.out.println("3- Currency");
            System.out.println("4- Tempertaure");
            System.out.println("5- Time");
            type = sc.nextInt();
            switch (type) {
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
                default:
                    System.out.println(" Please enter one of the numbers above");
                    break;
            }
        } while (type != 1 && type != 2 && type != 3 && type != 4 && type != 5);

        // Conversion type
        Integer conv = 0;
        double factor = 0;
        FactorType factType = null;
        do {
            System.out.println("Conversion type :\n");
            System.out.println("1- Simple  (1 multiplication) \n");
            System.out.println("2- Complex (addition or 2 operations) \n");
            conv = sc.nextInt();
            switch (conv) {
                case 1:
                    factType = FactorType.Simple;
                    System.out.println("Enter the conversion factor relative to  reference Unit : \n");
                    if (unitType == UnitType.Length) {
                        System.out.println("( 1 " + title + " = how many meters ? )\n");
                    }
                    if (unitType == UnitType.Mass) {
                        System.out.println("( 1 " + title + " = how many killogrammes ? )\n");
                    }
                    if (unitType == UnitType.Currency) {
                        System.out.println("( 1 " + title + " = how many dollars ? )\n");
                    }
                    if (unitType == UnitType.Temperature) {
                        System.out.println("( 1 " + title + " = how many kelvins ? )\n");
                    }
                    if (unitType == UnitType.Time) {
                        System.out.println("( 1 " + title + " = how many secondes ? )\n");
                    }

                    factor = sc.nextDouble();
                    break;
                case 2:
                    factType = FactorType.Complex;
                    break;
                default:
                    System.out.println(" Please enter one of the numbers above");
                    break;
            }
        } while (conv != 1 && conv != 2);

        // reference Unit ?
        Integer ref = 0;
        boolean bool = false;
        do {
            System.out.println("Reference Unit ? (Metre, Seconde, Kilogramme, Dollar)  :\n");
            System.out.println("1- Yes  \n");
            System.out.println("2- No  \n");
            ref = sc.nextInt();
            switch (ref) {
                case 1:
                    bool = true;
                    break;
                case 2:
                    bool = false;
                    break;
                default:
                    System.out.println(" Please enter one of the numbers above");
                    break;
            }
        } while (ref != 1 && ref != 2);

        // Unit creation
        Unit unit = new Unit(title, unitSystem, unitType, factor, factType, bool);
        System.out.println("Unit succesfully created !");
        System.out.println(unit.toString());
        return unit;
    }

    /**
     * Display all Units saved in the program
     *
     * @param liste the list of units
     */
    public static void displayUnits(ArrayList<Unit> liste) {
        for (Unit unit : liste) {
            System.out.println(unit.toString());
        }
    }

}
