# 🚀 Space Adventure

For this programming task, you are going to design a simple space exploration game using Java. Your journey will take you through player movement, scoring systems, and enemy interactions to implement comprehensive game mechanics using the core principles of Java programming.

### 💀 Deadline
This assignment should be completed before the session on **Friday, October 20th**.

### 👩‍🏫 Instructions
For detailed instructions on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://your-institution.edu/course-instructions#assignments).

### 📝 Preparation
Before starting the task, please ensure you've reviewed the materials in Module 3, "Game Programming Essentials."

- Read the section [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Register on the course platform if you haven't to access additional resources.

> **Note:** Allow yourself to explore additional reading materials if any concepts seem unfamiliar.

### ✅ Learning Goals

This week's learning objectives include:
* Designing Java classes
* Adding instance fields
* Writing a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Mastering the `main` method
* Understanding the concept of Scope (Variable Shadowing)

### 🚨 Troubleshooting Guide
If you encounter any issues, follow these steps:

1. Review [this week's posted issues](https://your-institution.edu/help/issues). Are students experiencing similar problems?
2. If unresolved, create a [New Issue](https://your-institution.edu/help/issues/new) with a descriptive title, such as "Task Space Adventure: [brief problem summary]."
3. Discuss problems with peers, but **do not share solutions**!

### 🎮 Assignment

Our adventure begins with coding a simple space exploration game. Fly through space, dodge enemies, and collect points. Below are the exercises that will guide you in building the game's functionalities.

#### Exercise 3.0 -- Fields

Create a class `SpaceExplorer.java` in your `src` directory. You'll be implementing fields to model the player and game dynamics.

- `String` playerName
- `int` score
- `double` positionX
- `double` positionY
- `boolean` collisionOccurred

If implemented correctly, adding the main method from Example 1 should compile when added to `SpaceExplorer.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class SpaceExplorer {

    // Declare your fields here!

    public static void main(String[] args) {
      SpaceExplorer hero = new SpaceExplorer();

      // Initialize fields
      hero.playerName = "Captain Star";
      hero.score = 0;
      hero.positionX = 100.0;
      hero.positionY = 200.0;

      // Output the player's information
      System.out.println("Player: " + hero.playerName);
      System.out.println("Score: " + hero.score);
      System.out.println("Position: (" + hero.positionX + ", " + hero.positionY + ")");
    }
  }
  ```
</details>

#### Exercise 3.1 -- Getters and Setters

Encapsulate the data by making fields private. Implement *getters* and *setters* to access them. 

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class SpaceExplorer {

    // Add private fields and getters/setters!

    public static void main(String[] args) {
      SpaceExplorer hero = new SpaceExplorer();

      hero.setPlayerName("Captain Star");
      hero.setScore(0);
      hero.setPositionX(100.0);
      hero.setPositionY(200.0);

      System.out.println("Player: " + hero.getPlayerName());
      System.out.println("Score: " + hero.getScore());
      System.out.println("Position: (" + hero.getPositionX() + ", " + hero.getPositionY() + ")");
      System.out.println("Collision Status: " + hero.isCollisionOccurred());
    }
  }
  ```
</details>

> **Note:** The getter for the `boolean` collisionOccurred would be `isCollisionOccurred()`.

#### Exercise 3.2 -- Constructor

A constructor simplifies initialization. Design a constructor for initializing the `SpaceExplorer`.

- Constructor should accept player name, initial position, and starting score.

Deploy the updated fields via constructor and conduct tests akin to Example 2.

#### Exercise 3.3 -- Scoring System

Implement a `scorePoints` method to update the player's score. Reflect these changes in the terminal using `printInfo()`.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    SpaceExplorer hero = new SpaceExplorer("Captain Star", 100.0, 200.0, 0);

    // Scoring points
    hero.scorePoints(50);

    // Print updated score
    hero.printInfo();
  }
  ```

  Expected output:

  ```
  > Space Explorer: Captain Star.
  > Score: 50
  > Position: (100.0, 200.0)
  > Collision Status: false
  ```
</details>

#### Exercise 3.4 -- Enemy Interactions

Introduce the `encounterEnemy` method to simulate an interaction with an enemy. If an enemy is 'hit', set `collisionOccurred` to true and reduce the score based on a defined formula.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    SpaceExplorer hero = new SpaceExplorer("Captain Star", 100.0, 200.0, 50);
    hero.encounterEnemy(10);

    hero.printInfo();
  }
  ```

  Expected output:

  ```
  > Space Explorer: Captain Star attacked by an enemy!
  > Score reduced by 10, new score: 40
  > Collision Status: true
  ```
</details>

#### Exercise 3.5 -- Variable Shadowing

Explore the *Variable Shadowing* phenomenon in Java. Understand key concepts that affect variable accessibility within different scopes.

```Java
public class SpaceError {
    private int speed = 100;

    public void printSpeed() {
        int speed = 200;
        System.out.println(speed); // Outputs the wrong speed level!
    }

    public static void main(String[] args){
        new SpaceError().printSpeed();
    }
}
```

Here is another example of shadowing:

```Java
public class Starship {
  private String shipName;
  private double fuelLevel;

  public Starship(String shipName, double fuelLevel) {
    shipName = shipName; // This is incorrect.
    fuelLevel = fuelLevel;
  }

  public void fuelUpdate(){
    double fuelLevel = 50;
    System.out.println("Current fuel level: " + fuelLevel); // Outputs an unintended value.
  }
}
```

> **Note:** Pay attention to the difference between local and instance scopes and how the `this` keyword can help.

### 🐞 Bugs and Errors?
Please report any discrepancies or errors in this task by creating a [New Issue](https://your-institution.edu/help/issues/new) with the title "Task Space Adventure Error: [brief summary]." Bug discoverers will be recognized in acknowledgments.