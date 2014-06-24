package NPIE;

public class Conversion {

    private Unit source;
    private Unit target;
    private double amount;

    /**
     * Conversion Constructor
     *
     * @param source the source of the conversion
     * @param target the target of the conversion
     * @param amount the amount of the conversion
     */
    public Conversion(Unit source, Unit target, double amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }

    /**
     * Return the source of the conversion
     *
     * @return the source of the conversion
     */
    public Unit getSource() {
        return source;
    }

    /**
     * Edit the source of the conversion
     * @param source the source of the conversion
     */
    public void setSource(Unit source) {
        this.source = source;
    }

    /**
     * Return the source of the conversion
     *
     * @return the source of the conversion
     */
    public Unit getTarget() {
        return target;
    }

    /**
     * Edit the target of the conversion
     * @param target the target of the conversion
     */
    public void setTarget(Unit target) {
        this.target = target;
    }

    /**
     * Return the amount of the conversion
     *
     * @return the amount of the conversion
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Edit the amount of the conversion
     * @param amount of the conversion
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
