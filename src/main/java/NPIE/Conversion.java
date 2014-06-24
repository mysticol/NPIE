package NPIE;

public class Conversion {

	// Attributes
	private Unit source;
	private Unit target;
	private double amount;
	
	// Constructor
	public Conversion (Unit source, Unit target, double amount) {
		this.source = source;
		this.target = target;
		this.amount=amount;
	}

	// Getters and Setters :
	public Unit getSource() {
		return source;
	}

	public void setSource(Unit source) {
		this.source = source;
	}

	public Unit getTarget() {
		return target;
	}

	public void setTarget(Unit target) {
		this.target = target;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}

