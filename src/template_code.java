### Template

```java
class Player {
   // Fields
   private String name;
   private int healthPoints;
   private int score;
   private int xPosition;
   private int yPosition;
   
   //Constructor
   public Player(/* arguments */) {
        // initialization code
   }
   
   // Getters
   public /* return type */ getName() {
        // code
   }
   
   public /* return type */ getHealthPoints() {
        // code
   }
   
   public /* return type */ getScore() {
        // code
   }
   
   public /* return type */ getXPosition() {
        // code
   }
   
   public /* return type */ getYPosition() {
        // code
   }
   
   // Setters
   public void setName(/* arguments */) {
        // code
   }
   
   public void setHealthPoints(/* arguments */) {
        // code
   }
   
   public void setScore(/* arguments */) {
        // code
   }
   
   public void setXPosition(/* arguments */) {
        // code
   }
   
   public void setYPosition(/* arguments */) {
        // code
   }
   
   // Methods
   public void printScore() {
        // code
   }
}

// Similar template for Enemy class but with no score field
class Enemy {
   // Fields, getters, setters and constructor here
}

class Game {
  public void movePlayerOrEnemy(/* arguments */) {
        // Code to move the player or the enemy
  }
  
  public void putEnemyToSleep(/* arguments */) {
        // Code to set the enemy sleep state
  }
  
  public void increasePlayerScore(/* arguments */) {
        // Code to increment player score
  }
  
  public static void main(String[] args) {
        // Code to run the game
  }
}
```