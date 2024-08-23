import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

class SpaceExplorer {
  
    // Private fields for encapsulation
    private String playerName;
    private int score;
    private double positionX;
    private double positionY;
    private boolean collisionOccurred;
    
    // Constructor to initialize a new SpaceExplorer
    public SpaceExplorer(String playerName, double positionX, double positionY, int score) {
        this.playerName = playerName;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = score;
        this.collisionOccurred = false; // Default to no collision
    }

    // Getters and Setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }
    
    public boolean isCollisionOccurred() {
        return collisionOccurred;
    }
    
    public void setCollisionOccurred(boolean collisionOccurred) {
        this.collisionOccurred = collisionOccurred;
    }

    // Method to score points
    public void scorePoints(int points) {
        this.score += points;
    }
    
    // Method to simulate an enemy encounter
    public void encounterEnemy(int damage) {
        System.out.println("Space Explorer: " + playerName + " attacked by an enemy!");
        if (!collisionOccurred) { // Check if collision has already occurred
            this.score -= damage; // Reduce score by damage
            this.collisionOccurred = true; // Set collision occurred to true
            System.out.println("Score reduced by " + damage + ", new score: " + score);
        }
    }

    // Method to print the explorer's information
    public void printInfo() {
        System.out.println("> Space Explorer: " + playerName + ".");
        System.out.println("> Score: " + score);
        System.out.println("> Position: (" + positionX + ", " + positionY + ")");
        System.out.println("> Collision Status: " + collisionOccurred);
    }

    public static void main(String[] args) {
        // Create a new SpaceExplorer object
        SpaceExplorer hero = new SpaceExplorer("Captain Star", 100.0, 200.0, 0);
        
        // Print initial information
        hero.printInfo();
        
        // Score points and print updated info
        hero.scorePoints(50);
        hero.printInfo();
        
        // Simulate encountering an enemy
        hero.encounterEnemy(10);
        
        // Print updated information
        hero.printInfo();
    }
}