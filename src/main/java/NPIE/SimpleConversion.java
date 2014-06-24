package NPIE;

public class SimpleConversion extends Conversion {

	public SimpleConversion(Unit source, Unit target, double amount) {
		super(source, target, amount);
	}
	
	public double SimpleConv(){
		return (getSource().getFactor()*getAmount())/getTarget().getFactor();
	}
}

