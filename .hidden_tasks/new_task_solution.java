```java
class Player {
    private String name;
    private int healthPoints;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int healthPoints, int score, int xPosition, int yPosition) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getScore() {
        return score;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void printScore() {
        System.out.println("The current score of the player " + this.name + " is " + this.score + ".");
    }
}

class Enemy {
    private String name;
    private int healthPoints;
    private int xPosition;
    private int yPosition;

    public Enemy(String name, int healthPoints, int xPosition, int yPosition) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}

class Game {
    public void movePlayerOrEnemy(Object character, int newXPosition, int newYPosition) {
        if (character instanceof Player) {
            ((Player)character).setXPosition(newXPosition);
            ((Player)character).setYPosition(newYPosition);
        } else if (character instanceof Enemy) {
            ((Enemy)character).setXPosition(newXPosition);
            ((Enemy)character).setYPosition(newYPosition);
        }
    }
  
    public void putEnemyToSleep(Enemy enemy) {
        System.out.println("Putting enemy " + enemy.getName() + " to sleep.");
        // Implementation goes here
    }
  
    public void increasePlayerScore(Player player, int scoreIncrease) {
        int currentScore = player.getScore();
        player.setScore(currentScore + scoreIncrease);
    }
  
    public static void main(String[] args) {
        Player player1 = new Player("Player1", 100, 0, 0, 0);
        Enemy enemy1 = new Enemy("Enemy1", 100, 5, 5);
        Game game = new Game();
        game.movePlayerOrEnemy(player1, 1, 1);
        player1.printScore();
    }
}
```