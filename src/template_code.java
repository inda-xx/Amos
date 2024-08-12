### Template

```java

// Begin template for the Player class
class Player {
    private String name;
    private int score;
    private int health;
    private boolean isAlive;
    
    // Constructor
    public Player(String name, int score, int health, boolean isAlive) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.isAlive = isAlive;
    }
    
    // Getters
    public String getName() { /* Add your code here */ }
    public int getScore() { /* Add your code here */ }
    public int getHealth() { /* Add your code here */ }
    public boolean getIsAlive() { /* Add your code here */ }

    // Setters
    public void setName(String name) { /* Add your code here */ }
    public void setScore(int score) { /* Add your code here */ }
    public void setHealth(int health) { /* Add your code here */ }
    public void setIsAlive(boolean isAlive) { /* Add your code here */ }

    // Attack method
    public void attackEnemy(Enemy enemy) { /* Add your code here */ }

    // Print stats method
    public void printStats() { /* Add your code here */ }
} // End template for the Player class

// Begin template for the Enemy class
class Enemy {
    private String name;
    private int health;
    private boolean isAlive;
    
    // Constructor
    public Enemy(String name, int health, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
    }

    // Getters
    public String getName() { /* Add your code here */ }
    public int getHealth() { /* Add your code here */ }
    public boolean getIsAlive() { /* Add your code here */ }

    // Setters
    public void setName(String name) { /* Add your code here */ }
    public void setHealth(int health) { /* Add your code here */ }
    public void setIsAlive(boolean isAlive) { /* Add your code here */ }

    // Print stats method
    public void printStats() { /* Add your code here */ }
} // End template for the Enemy class

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a new Player object
        Player player = new Player("Name", 0, 100, true);
        // Create a new Enemy object
        Enemy enemy = new Enemy("Name", 100, true);
        // Print out Player and Enemy info
        player.printStats();
        enemy.printStats();
        // Call the attack method
        player.attackEnemy(enemy);
        // Print out Player and Enemy info
        player.printStats();
        enemy.printStats();
    }
}
```