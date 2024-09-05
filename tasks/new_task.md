# 🎮 Create Your Own Game!

For this programming task, you're going to embark on an adventure to design a simple game using Java. You'll dabble with object-oriented programming as you bring your game to life, including creating player movement, a scoring system, and interactions with enemies.

### 💀 Deadline
This project should be completed by **Friday 30th November**.

### 👩‍🏫 Instructions
For detailed instructions on completing and submitting this assignment, refer to the [course instructions](https://example.com/course-instructions#assignments).

### 📝 Preparation
Before starting this assignment, please make sure to study the following resources:

- Read [Understanding Object-Oriented Design](https://example.com/learning-material/object-oriented-design)
- Complete the exercises on basic Java syntax in the introductory module.

### ✅ Learning Goals
This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide
If you have questions or run into problems, follow these steps:

1. Review this week's [discussion posts](https://example.com/forum). Is someone else facing a similar challenge?
2. If not, create a new post with the title "Task: *brief summary of your problem*".
3. Seek help from a TA during the [weekly lab session](https://example.com/lab-sessions). Check the schedule for times.

We encourage collaboration with peers, but **do not share code**.

### 🏛 Assignment

Welcome to your game design task! You will be implementing a simple game using Java that features a player character interacting in a world filled with challenges and adversaries.

#### Exercise 1.0 -- Designing the Player Character
First, you will create a class for the player character in your game. Open your IDE and create a new Java class called `Player.java`. The player should have:

- `String` name
- `int` score
- `int` xPosition
- `int` yPosition

Make sure these fields are private and implement appropriate *getters* and *setters* for them.

<details>
  <summary> 🛠 Player Example </summary>

  ```java
  public class Player {

      // Instance fields
      private String name;
      private int score;
      private int xPosition;
      private int yPosition;

      // Constructor
      public Player(String name, int xPosition, int yPosition) {
          this.name = name;
          this.xPosition = xPosition;
          this.yPosition = yPosition;
          this.score = 0; // Initial score
      }

      // Getters and Setters
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }
      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }
      public int getxPosition() { return xPosition; }
      public void setxPosition(int xPosition) { this.xPosition = xPosition; }
      public int getyPosition() { return yPosition; }
      public void setyPosition(int yPosition) { this.yPosition = yPosition; }

      // Method to print player info
      public void printInfo() {
          System.out.println("Player: " + name);
          System.out.println("Score: " + score);
          System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
      }
  }
  ```
</details>

#### Exercise 1.1 -- Creating Enemy Characters
Now design an `Enemy` class. Each enemy should encapsulate:

- `String` type
- `int` xPosition
- `int` yPosition

Create this class as you did with the `Player` class, including a constructor, and *getters* and *setters*.

<details>
  <summary> 🛠 Enemy Example </summary>

  ```java
  public class Enemy {

      // Instance fields
      private String type;
      private int xPosition;
      private int yPosition;

      // Constructor
      public Enemy(String type, int xPosition, int yPosition) {
          this.type = type;
          this.xPosition = xPosition;
          this.yPosition = yPosition;
      }

      // Getters and Setters
      public String getType() { return type; }
      public void setType(String type) { this.type = type; }
      public int getxPosition() { return xPosition; }
      public void setxPosition(int xPosition) { this.xPosition = xPosition; }
      public int getyPosition() { return yPosition; }
      public void setyPosition(int yPosition) { this.yPosition = yPosition; }

      // Method to print enemy info
      public void printInfo() {
          System.out.println("Enemy Type: " + type);
          System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
      }
  }
  ```
</details>

#### Exercise 1.2 -- Player Movement
Implement logic within the `Player` class to move the player character. Add methods `moveUp()`, `moveDown()`, `moveLeft()`, and `moveRight()` to change the player's `xPosition` and `yPosition`.

#### Exercise 1.3 -- Scoring System
In the `Player` class, add the `increaseScore(int points)` method. This method should allow the player's score to be increased when certain conditions are met (e.g., when the player encounters an enemy).

#### Exercise 1.4 -- Enemy Interaction
Implement a method in the `Game` class that handles interactions when a player meets an enemy. You may decide the interaction logic—e.g., if the player is "attacked," deduct points; if the player "defeats" the enemy, increase points.

#### Exercise 1.5 -- Building the Game
Create a `Game` class with a `main` method. Initialize player and enemy instances, and simulate a simple scenario where the player moves and interacts with the enemy, updating their score accordingly.

<details>
  <summary> 🛠 Game Main Method Example </summary>

  ```java
  public class Game {
      public static void main(String[] args) {
          // Create player and enemy instances
          Player player = new Player("Hero", 0, 0);
          Enemy enemy = new Enemy("Goblin", 1, 0);

          // Simulate player movement
          player.moveRight();
          player.printInfo();

          // Simulate interaction with enemy
          if (player.getxPosition() == enemy.getxPosition() && player.getyPosition() == enemy.getyPosition()) {
              System.out.println("Encountered an enemy!");
              // Implement interaction logic here (e.g., player fights enemy).
              player.increaseScore(10); // Example interaction
          }

          // Print final state
          player.printInfo();
          enemy.printInfo();
      }
  }
  ```
</details>

#### Exercise 1.6 -- Variable Shadowing
Explore variable shadowing with a small example. Understand how to fix it by properly using the `this` keyword in your game classes.

```Java
public class VariableShadowExample {
    private int number = 10;

    public void showNumber() {
        int number = 5; // Shadows instance variable
        System.out.println(this.number); // Correctly prints the instance variable
    }

    public static void main(String[] args) {
        new VariableShadowExample().showNumber(); // Should print 10
    }
}
```

### 🐞 Found Bugs or Have Suggestions?
If you encounter errors or inconsistencies, please create an issue with the title "Task Error: Description of error." Your feedback helps us improve the quality of exercises and learning materials.

Now, get ready to code, play, and learn in your Java journey! Enjoy creating your game and ensuring your characters navigate through this digital world you built! 🎮