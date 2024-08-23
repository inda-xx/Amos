import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

public class EconomicsDepartment {
    // Private instance fields
    private String departmentName;
    private double annualBudget;
    private double cashFlow;
    private boolean inDeficit;

    // Constructor
    public EconomicsDepartment(String departmentName, double annualBudget, double cashFlow) {
        this.departmentName = departmentName;
        this.annualBudget = annualBudget;
        this.cashFlow = cashFlow;
        this.inDeficit = cashFlow < 0;
    }

    // Getters and Setters
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getAnnualBudget() {
        return annualBudget;
    }

    public void setAnnualBudget(double annualBudget) {
        this.annualBudget = annualBudget;
    }

    public double getCashFlow() {
        return cashFlow;
    }

    public void setCashFlow(double cashFlow) {
        this.cashFlow = cashFlow;
        this.inDeficit = cashFlow < 0;
    }

    public boolean isInDeficit() {
        return inDeficit;
    }
    
    public void setInDeficit(boolean inDeficit) {
        this.inDeficit = inDeficit;
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

// Example for Variable Shadowing
class University {
    private double totalBudget = 10_000_000.00; // I want this printed!

    public void displayBudget() {
        double totalBudget = 5_000_000.00;
        System.out.println("Total Budget: " + this.totalBudget); // Use 'this' to refer to the instance field
    }

    public static void main(String[] args) {
        new University().displayBudget();
    }
}