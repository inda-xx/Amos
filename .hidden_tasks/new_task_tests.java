```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ByteBeastTest {
    private ByteBeast beast1;
    private ByteBeast beast2;

    @Before
    public void setUp() {
        beast1 = new ByteBeast("Rex", 10, 20, 5, 7);
        beast2 = new ByteBeast("Talon", 8, 18, 4, 6);
    }

    @Test
    public void testGetName() {
        assertEquals("Rex", beast1.getName());
        assertEquals("Talon", beast2.getName());
    }

    @Test
    public void testGetLevel() {
        assertEquals(10, beast1.getLevel());
        assertEquals(8, beast2.getLevel());
    }

    @Test
    public void testGetHealth() {
        assertEquals(20, beast1.getHealth());
        assertEquals(18, beast2.getHealth());
    }

    @Test
    public void testGetAttack() {
        assertEquals(5, beast1.getAttack());
        assertEquals(4, beast2.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(7, beast1.getDefense());
        assertEquals(6, beast2.getDefense());
    }

    @Test
    public void testIsAlive() {
        assertEquals(true, beast1.isAlive());
        assertEquals(true, beast2.isAlive());
    }

    @Test
    public void testSetName() {
        beast1.setName("Bruti");
        assertEquals("Bruti", beast1.getName());
    }

    @Test
    public void testSetLevel() {
        beast1.setLevel(12);
        assertEquals(12, beast1.getLevel());
    }

    @Test
    public void testSetHealth() {
        beast1.setHealth(22);
        assertEquals(22, beast1.getHealth());
    }

    @Test
    public void testSetAttack() {
        beast1.setAttack(7);
        assertEquals(7, beast1.getAttack());
    }

    @Test
    public void testSetDefense() {
        beast1.setDefense(8);
        assertEquals(8, beast1.getDefense());
    }

    @Test
    public void testSetAlive() {
        beast1.setAlive(false);
        assertEquals(false, beast1.isAlive());
    }

    @Test
    public void testBattle() {
        beast1 = new ByteBeast("Rex", 10, 20, 5, 7);
        beast2 = new ByteBeast("Talon", 8, 18, 4, 6);
        beast1.battle(beast2);
        assertEquals(17, beast2.getHealth()); // Since level of beast1 is higher than beast2. Health should reduce by 1.
        assertEquals(true, beast2.isAlive());
    }
}
```