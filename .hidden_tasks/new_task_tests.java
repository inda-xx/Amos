```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceExplorerTest {
    
    private SpaceExplorer hero;

    @Before
    public void setUp() {
        // Initialize a new SpaceExplorer object before each test
        hero = new SpaceExplorer("Test Captain", 150.0, 250.0, 0);
    }

    @Test
    public void testInitialSetup() {
        assertEquals("Test Captain", hero.getPlayerName());
        assertEquals(0, hero.getScore());
        assertEquals(150.0, hero.getPositionX(), 0.001);
        assertEquals(250.0, hero.getPositionY(), 0.001);
        assertFalse(hero.isCollisionOccurred());
    }

    @Test
    public void testSettersAndGetters() {
        // Set new values
        hero.setPlayerName("New Captain");
        hero.setScore(100);
        hero.setPositionX(300.0);
        hero.setPositionY(400.0);
        hero.setCollisionOccurred(true);

        // Verify the changes
        assertEquals("New Captain", hero.getPlayerName());
        assertEquals(100, hero.getScore());
        assertEquals(300.0, hero.getPositionX(), 0.001);
        assertEquals(400.0, hero.getPositionY(), 0.001);
        assertTrue(hero.isCollisionOccurred());
    }

    @Test
    public void testScorePoints() {
        hero.scorePoints(50);
        assertEquals(50, hero.getScore());

        hero.scorePoints(20);
        assertEquals(70, hero.getScore());
    }

    @Test
    public void testEncounterEnemyWithoutInitialCollision() {
        hero.encounterEnemy(10);

        // Verify collision occurred and score reduced
        assertTrue(hero.isCollisionOccurred());
        assertEquals(-10, hero.getScore());
    }
    
    @Test
    public void testEncounterEnemyWithInitialCollision() {
        // Simulate an initial collision
        hero.setCollisionOccurred(true);
        
        // Attempt to encounter enemy again
        hero.encounterEnemy(20);
        
        // Score should not be reduced again
        assertTrue(hero.isCollisionOccurred());
        assertEquals(0, hero.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalPositionX() {
        hero.setPositionX(Double.NaN); // This would ideally throw an exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalPositionY() {
        hero.setPositionY(Double.NaN); // This would ideally throw an exception
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalScorePoints() {
        hero.scorePoints(-10); // Score points should not allow negative points
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalEncounterEnemy() {
        hero.encounterEnemy(-5); // Damage should not be negative
    }

    @Test(timeout = 100) // Test for performance
    public void testMassiveScoring() {
        for (int i = 0; i < 100000; i++) {
            hero.scorePoints(1);
        }
        assertEquals(100000, hero.getScore());
    }
}
```