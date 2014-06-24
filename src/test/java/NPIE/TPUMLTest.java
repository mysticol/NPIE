/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NPIE;

import static NPIE.TPUML.units_list;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Baptiste
 */
public class TPUMLTest {

    public TPUMLTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TPUML.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        TPUML.main(args);
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
