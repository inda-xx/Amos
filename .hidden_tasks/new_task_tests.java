```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceJourneyTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 100, true);
        enemy = new Enemy("Villain", 100, true);
    }

    @Test
    public void testPlayerGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testPlayerGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerGetHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testPlayerGetIsAlive() {
        assertEquals(true, player.getIsAlive());
    }

    @Test
    public void testEnemyGetName() {
        assertEquals("Villain", enemy.getName());
    }

    @Test
    public void testEnemyGetHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testEnemyGetIsAlive() {
        assertEquals(true, enemy.getIsAlive());
    }

    @Test
    public void testPlayerAttack() {
        player.attackEnemy(enemy);
        assertEquals(90, enemy.getHealth());
        assertEquals(1, player.getScore());
    }

    @Test
    public void testEnemyDies() {
        enemy.setHealth(0);
        assertEquals(false, enemy.getIsAlive());
    }
}
```