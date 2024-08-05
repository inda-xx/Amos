```java
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class PlayerAndEnemyTest {
    Player player;
    Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hunter", 100, 0, 0); // player starts at (0, 0) with 100 HP
        enemy = new Enemy("Demon", 100, 5, 5, 10); // enemy starts at (5, 5) with 100 HP and 10 power level
    }

    @Test
    public void testPlayerIsAliveAtStart() {
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerCanMove() {
        player.moveRight();
        assertEquals(1, player.getXPos());

        player.moveUp();
        assertEquals(1, player.getYPos());

        Player.moveLeft();
        assertEquals(0, player.getXPos());

        player.moveDown();
        assertEquals(0, player.getYPos());
    }

    @Test
    public void testPlayerCanDefeatEnemy(){
        enemy.setHP(0); // Set enemy HP to 0
        player.defeat(enemy); // Player should defeat enemy
        assertTrue(player.getScore() > 0);    // Player's score should increase
    }

    @Test
    public void testPlayerCannotDefeatAliveEnemy() {
        player.defeat(enemy); // Attempt to defeat enemy with non-0 HP
        assertEquals(0, player.getScore()); // Player's score should not increase
    }

    @Test
    public void testPlayerLosesWhenHpZero() {
        player.setHP(0); // Causes player's HP to drop to 0
        player.checkStatus(); // Check if player is still alive
        assertFalse(player.isAlive()); // Player should be dead
    }

    @Test
    public void testEnemyCanMove() {
        enemy.moveRight();
        assertEquals(6, enemy.getXPos());

        enemy.moveUp();
        assertEquals(6, enemy.getYPos());

        enemy.moveLeft();
        assertEquals(5, enemy.getXPos());

        enemy.moveDown();
        assertEquals(5, enemy.getYPos());
    }

    @Test
    public void testVariableShadowing(){
        player.setScore(1000); // set player's score to 1000
        int score = 0; // declare shadow variable with same name
        assertEquals(1000, player.retrieveScore(score)); // ensure method returns correct score
    }
}
```