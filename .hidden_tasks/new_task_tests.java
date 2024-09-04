```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
    private Hero hero1;
    private Hero hero2;

    @Before
    public void setUp() {
        hero1 = new Hero("Luna", 100, 70, 20, false, 0);
        hero2 = new Hero("Venus", 120, 80, 30, true, 500);
    }

    @Test
    public void testGetName() {
        assertEquals("Luna", hero1.getName());
        assertEquals("Venus", hero2.getName());
    }

    @Test
    public void testGetHp() {
        assertEquals(100, hero1.getHp());
        assertEquals(120, hero2.getHp());
    }

    @Test
    public void testGetAttack() {
        assertEquals(70, hero1.getAttack());
        assertEquals(80, hero2.getAttack());
    }

    @Test
    public void testGetDefense() {
        assertEquals(20, hero1.getDefense());
        assertEquals(30, hero2.getDefense());
    }

    @Test
    public void testGetMagicPotion() {
        assertEquals(false, hero1.isMagicPotion());
        assertEquals(true, hero2.isMagicPotion());
    }

    @Test
    public void testGetExperience() {
        assertEquals(0, hero1.getExperience());
        assertEquals(500, hero2.getExperience());
    }

    @Test
    public void testSetName() {
        hero1.setName("Vega");
        assertEquals("Vega", hero1.getName());
    }

    @Test
    public void testSetHp() {
        hero1.setHp(50);
        assertEquals(50, hero1.getHp());
    }

    @Test
    public void testSetAttack() {
        hero1.setAttack(60);
        assertEquals(60, hero1.getAttack());
    }

    @Test
    public void testSetDefense() {
        hero1.setDefense(40);
        assertEquals(40, hero1.getDefense());
    }

    @Test
    public void testSetsMagicPotion() {
        hero1.setMagicPotion(true);
        assertEquals(true, hero1.isMagicPotion());
    }

    @Test
    public void testSetExperience() {
        hero1.setExperience(10);
        assertEquals(10, hero1.getExperience());
    }
  
    @Test
    public void testGoForAdventure() {
        hero1.goForAdventure("forest");
        assertEquals(100, hero1.getExperience()); 
        assertEquals(true, hero1.isMagicPotion()); 

        hero2.goForAdventure("city");
        assertEquals(550, hero2.getExperience()); 
        assertEquals(true, hero2.isMagicPotion());
    } 
}
```