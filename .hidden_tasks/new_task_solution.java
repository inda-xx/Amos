```java
class Player {
    private String name;
    private int score;
    private int health;
    private boolean isAlive;

    public Player(String name, int score, int health, boolean isAlive) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.isAlive = isAlive;
    }
    
    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHealth(int health) {
        if(health <= 0) {
            this.isAlive = false;
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void attackEnemy(Enemy enemy) {
        int newHealth = enemy.getHealth() - 10;
        enemy.setHealth(newHealth);
        if (!enemy.getIsAlive()) {
            setScore(getScore() + 1);
        }
    }

    public void printStats() {
        System.out.println("Player Name : " + getName());
        System.out.println("Score : " + getScore());
        System.out.println("Health : " + getHealth());
        System.out.println("Is Alive : " + getIsAlive());
    }
}

class Enemy {
    private String name;
    private int health;
    private boolean isAlive;

    public Enemy(String name, int health, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if(health <= 0) {
            this.isAlive = false;
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void printStats() {
        System.out.println("Enemy Name : " + getName());
        System.out.println("Health : " + getHealth());
        System.out.println("Is Alive : " + getIsAlive());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new Player object
        Player player = new Player("Hero", 0, 100, true);
        // Create a new Enemy object
        Enemy enemy = new Enemy("Villain", 100, true);
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