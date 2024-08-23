```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EconomicsDepartmentTest {
    private EconomicsDepartment econDept;

    @Before
    public void setUp() {
        econDept = new EconomicsDepartment("University Economics Department", 5_000_000.00, 500_000.00);
    }

    @Test
    public void testGetters() {
        assertEquals("University Economics Department", econDept.getDepartmentName());
        assertEquals(5_000_000.00, econDept.getAnnualBudget(), 0);
        assertEquals(500_000.00, econDept.getCashFlow(), 0);
        assertFalse(econDept.isInDeficit());
    }

    @Test
    public void testSetters() {
        econDept.setDepartmentName("New Economics Department");
        assertEquals("New Economics Department", econDept.getDepartmentName());

        econDept.setAnnualBudget(6_000_000.00);
        assertEquals(6_000_000.00, econDept.getAnnualBudget(), 0);

        econDept.setCashFlow(600_000.00);
        assertEquals(600_000.00, econDept.getCashFlow(), 0);
        assertFalse(econDept.isInDeficit());

        econDept.setCashFlow(-1_000.00);
        assertEquals(-1_000.00, econDept.getCashFlow(), 0);
        assertTrue(econDept.isInDeficit());
    }

    @Test
    public void testUpdateFinancesLeadsToDeficit() {
        econDept.updateFinances(-600_000.00);
        assertTrue(econDept.isInDeficit());
        assertEquals(-100_000.00, econDept.getCashFlow(), 0);
    }

    @Test
    public void testUpdateFinancesRemovesDeficit() {
        // Initially force into deficit
        econDept.updateFinances(-600_000.00);
        assertTrue(econDept.isInDeficit());

        // Adjust finances to remove deficit
        econDept.updateFinances(+200_000.00);
        assertFalse(econDept.isInDeficit());
        assertEquals(100_000.00, econDept.getCashFlow(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidBudget() {
        econDept.setAnnualBudget(-1000.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCashFlow() {
        new EconomicsDepartment("Test Department", 5_000_000.00, Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDepartmentName() {
        new EconomicsDepartment(null, 5_000_000.00, 500_000.00);
    }
}
```