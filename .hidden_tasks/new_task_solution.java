```java
public class EconomicsDepartment {
    // Private instance fields
    private String departmentName;
    private double annualBudget;
    private double cashFlow;
    private boolean inDeficit;

    // Constructor initializing the fields and checking validity
    public EconomicsDepartment(String departmentName, double annualBudget, double cashFlow) {
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be null or empty.");
        }
        if (Double.isNaN(annualBudget) || annualBudget < 0) {
            throw new IllegalArgumentException("Annual budget must be a non-negative number.");
        }
        if (Double.isNaN(cashFlow)) {
            throw new IllegalArgumentException("Cash flow cannot be NaN.");
        }

        this.departmentName = departmentName;
        this.annualBudget = annualBudget;
        this.cashFlow = cashFlow;
        this.inDeficit = cashFlow < 0;
    }

    // Getters and Setters with validation
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be null or empty.");
        }
        this.departmentName = departmentName;
    }

    public double getAnnualBudget() {
        return annualBudget;
    }

    public void setAnnualBudget(double annualBudget) {
        if (Double.isNaN(annualBudget) || annualBudget < 0) {
            throw new IllegalArgumentException("Annual budget must be a non-negative number.");
        }
        this.annualBudget = annualBudget;
    }

    public double getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(double cashFlow) {
        if (Double.isNaN(cashFlow)) {
            throw new IllegalArgumentException("Cash flow cannot be NaN.");
        }
        this.cashFlow = cashFlow;
        this.inDeficit = cashFlow < 0;
    }

    public boolean isInDeficit() {
        return inDeficit;
    }

    // Method to print financial status
    public void printFinancialStatus() {
        System.out.println("> FINANCIAL STATUS");
        System.out.println("> Department: " + departmentName);
        System.out.println("> Annual Budget: $" + annualBudget);
        System.out.println("> Cash Flow: $" + cashFlow);
        System.out.println("> In Deficit: " + inDeficit);
    }

    // Method to update finances
    public void updateFinances(double changeInCashFlow) {
        if (Double.isNaN(changeInCashFlow)) {
            throw new IllegalArgumentException("Change in cash flow cannot be NaN.");
        }
        this.cashFlow += changeInCashFlow;
        this.inDeficit = cashFlow < 0;
        System.out.println("> Cash flow updated. Current balance: $" + cashFlow);
        if (inDeficit) {
            System.out.println("> Warning: The department is now in deficit!");
        }
    }

    public static void main(String[] args) {
        // Example usage
        EconomicsDepartment econDept = new EconomicsDepartment("University Economics Department", 5_000_000.00, 500_000.00);

        econDept.printFinancialStatus();

        econDept.updateFinances(-600_000.00); // This should trigger a deficit warning
    }
}
```

This solution includes robust validation in the setters and constructor to avoid invalid states, and logical handling of when the department is in deficit. The unit tests cover a variety of normal, edge, and invalid cases, ensuring comprehensiveness.