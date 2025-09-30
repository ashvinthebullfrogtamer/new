package hospital;

public class Procedure {
    
    private String procedureName;
    private String procedureDate;
    private String practitioner;
    private double charges;

    
    public Procedure() {}

/**
 * 
 * @param procedureName
 * @param procedureDate
 */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    /**
     * 
     * @param procedureName
     * @param procedureDate
     * @param practitioner
     * @param charges
     */
    public Procedure(String procedureName, String procedureDate, String practitioner, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charges = charges;
    }

    /**
     * 
     * @return
     */
    public String getProcedureName() { return procedureName; }
    /**
     * 
     * @return
     */
    public String getProcedureDate() { return procedureDate; }
    /**
     * 
     * @return
     */
    public String getPractitioner() { return practitioner; }
    /**
     * 
     * @return
     */
    public double getCharges() { return charges; }

    /**
     * 
     * @param procedureName
     */
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    /**
     * 
     * @param procedureDate
     */
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    /**
     * 
     * @param practitioner
     */
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }
    /**
     * 
     * @param charges
     */
    public void setCharges(double charges) { this.charges = charges; }

    /**
     * 
     */
    
    public String toString() {
        return procedureName + "\t" + procedureDate + "\t" + practitioner + "\t$" + String.format("%.2f", charges);
    }
}
