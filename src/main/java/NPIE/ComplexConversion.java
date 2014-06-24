package NPIE;


import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ComplexConversion extends Conversion {

	private Scanner sc;


	public ComplexConversion(Unit source, Unit target, double amount) {
		super(source, target, amount);
	}

	public double ComplexConv(Unit src, Unit tgt, String str) throws ScriptException  {

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		str = str.replace("X", String.valueOf(getAmount()));
		double res = 0;
		res= (double) engine.eval(str);
		return res;
	}

	public double ComplexConv() throws ScriptException {

		String concat="";
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String op ="";
		sc = new Scanner(System.in);
		System.out.println(" Enter operation ");
		System.out.println(" Example : Kelvins -> Farheneit ");
		System.out.println(" Example : = X*1.8 - 459.67");
		System.out.println(" X is the amount u want to convert");
		op = sc.nextLine();	  
		concat = getSource().getName() +"/" + getTarget().getName() + "/" + op;
		op = op.replace("X", String.valueOf(getAmount()));
		double res = 0;
		res= (double) engine.eval(op);
		TPUML.convs_list.add(concat);
		return res;
	}
}
