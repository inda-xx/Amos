```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        enemy = new Enemy("Goblin", 1, 1);
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, player.getxPosition());
        assertEquals(0, player.getyPosition());
    }

    @Test
    public void testPlayerMovesUp() {
        player.moveUp();
        assertEquals(-1, player.getyPosition());
        assertEquals(0, player.getxPosition());
    }

    @Test
    public void testPlayerMovesDown() {
        player.moveDown();
        assertEquals(1, player.getyPosition());
        assertEquals(0, player.getxPosition());
    }

    @Test
    public void testPlayerMovesRight() {
        player.moveRight();
        assertEquals(1, player.getxPosition());
        assertEquals(0, player.getyPosition());
    }

    @Test
    public void testPlayerMovesLeft() {
        player.moveLeft();
        assertEquals(-1, player.getxPosition());
        assertEquals(0, player.getyPosition());
    }

    @Test
    public void testInitialScoreIsZero() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEnemyInitialPosition() {
        assertEquals(1, enemy.getxPosition());
        assertEquals(1, enemy.getyPosition());
    }

    @Test
    public void testPlayerEnemyInteraction() {
        player.moveRight();
        player.moveDown();
        if (player.getxPosition() == enemy.getxPosition() && player.getyPosition() == enemy.getyPosition()) {
            player.increaseScore(50);
        }
        assertEquals(50, player.getScore());
    }

    @Test
    public void testInvalidPlayerNameHandling() {
        try {
            new Player(null, 0, 0);
            fail("Expected IllegalArgumentException for null name");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty", e.getMessage());
        }

        try {
            new Player("", 0, 0);
            fail("Expected IllegalArgumentException for empty name");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null or empty", e.getMessage());
        }
    }

    @Test
    public void testInvalidEnemyTypeHandling() {
        try {
            new Enemy(null, 0, 0);
            fail("Expected IllegalArgumentException for null type");
        } catch (IllegalArgumentException e) {
            assertEquals("Type cannot be null or empty", e.getMessage());
        }

        try {
            new Enemy("", 0, 0);
            fail("Expected IllegalArgumentException for empty type");
        } catch (IllegalArgumentException e) {
            assertEquals("Type cannot be null or empty", e.getMessage());
        }
    }
}
```