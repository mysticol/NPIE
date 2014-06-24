package NPIE;

public class SimpleConversion extends Conversion {

     /**
     * Conversion Constructor
     *
     * @param source the source of the Simpleconversion
     * @param target the target of the Simpleconversion
     * @param amount the amount of the Simpleconversion
     */
    public SimpleConversion(Unit source, Unit target, double amount) {
        super(source, target, amount);
    }

    /**
     * @return the result of the simple conversion
     */
    public double SimpleConv() {
        return (getSource().getFactor() * getAmount()) / getTarget().getFactor();
    }
}
