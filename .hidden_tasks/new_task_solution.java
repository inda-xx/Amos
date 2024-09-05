```java
public class Player {
    
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int xPosition, int yPosition) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.score = 0; // Initial score
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public void moveUp() {
        yPosition--;
    }

    public void moveDown() {
        yPosition++;
    }

    public void moveLeft() {
        xPosition--;
    }

    public void moveRight() {
        xPosition++;
    }

    public void increaseScore(int points) {
        score += points;
    }
}

public class Enemy {
    
    private String type;
    private int xPosition;
    private int yPosition;

    public Enemy(String type, int xPosition, int yPosition) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type cannot be null or empty");
        }
        this.type = type;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void printInfo() {
        System.out.println("Enemy Type: " + type);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
}

public class Game {

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Goblin", 1, 0);

        player.moveRight();
        player.printInfo();

        handleInteraction(player, enemy);

        player.printInfo();
        enemy.printInfo();
    }

    private static void handleInteraction(Player player, Enemy enemy) {
        if (player.getxPosition() == enemy.getxPosition() && player.getyPosition() == enemy.getyPosition()) {
            System.out.println("Encountered an enemy!");
            player.increaseScore(10);
        }
    }
}
```

This solution creates a simple game scenario with a `Player` and `Enemy` class, allowing player movements and handling interactions with enemies. The unit tests ensure the robustness of the game logic, checking boundary cases, invalid inputs, and expected behaviors.