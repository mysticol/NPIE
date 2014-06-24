package NPIE;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ComplexConversion extends Conversion {

    private Scanner sc;

    /**
     * ComplexConversion Constructor
     *
     * @param source the source of the ComplexConversion
     * @param target the target of the ComplexConversion
     * @param amount the amount of the ComplexConversion
     */
    public ComplexConversion(Unit source, Unit target, double amount) {
        super(source, target, amount);
    }

    /**
     * Return the result of the ComplexConversion
     *
     * @param src the source of the ComplexConversion
     * @param tgt the target of the ComplexConversion
     * @param str the formula of the ComplexConversion
     * @return the result of the ComplexConversion
     * @throws javax.script.ScriptException
     */
    public double ComplexConv(Unit src, Unit tgt, String str) throws ScriptException {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        str = str.replace("X", String.valueOf(getAmount()));
        double res = 0;
        res = (double) engine.eval(str);
        return res;
    }

    /**
     * Return the result of the ComplexConversion (for already done ComplexConversions only)
     *
     * @return the result of the ComplexConversion
     * @throws javax.script.ScriptException
     */
    public double ComplexConv() throws ScriptException {

        String concat = "";
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String op = "";
        sc = new Scanner(System.in);
        System.out.println(" Enter operation ");
        System.out.println(" Example : Kelvins -> Farheneit ");
        System.out.println(" Example : = X*1.8 - 459.67");
        System.out.println(" X is the amount u want to convert");
        op = sc.nextLine();
        concat = getSource().getName() + "/" + getTarget().getName() + "/" + op;
        op = op.replace("X", String.valueOf(getAmount()));
        double res = 0;
        res = (double) engine.eval(op);
        TPUML.convs_list.add(concat);
        return res;
    }
}
