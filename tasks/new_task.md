# Space Journey :rocket:

Exercise for the INDA programming course. This assignment is about developing a basic game application using Java. You will put into practice the components and application of a Java class.

### 👨‍💻 Instructions

For instructions on how to complete and submit this assignment, kindly refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation

Remember to thoroughly read and reply to the questions in the OLI material for Module 2.

- Read [Working with Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven’t already done so, go to https://kth.oli.cmu.edu/, sign up and register for the course key `pf1337-ht22`.

> **Assistant's Tip:** The OLI material and exercises are a bit syncopated this year, so it's no harm to read ahead if you haven’t found all the information yet.

### 🎯 Learning Goals

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the main method
- Scope (or variable shadowing)

### 🎮 Assignment

You are required to create the basics for a mini-game. The game includes players, enemies and a scoring system. Implement objects using *Java Classes* corresponding to the game entities. 

#### Exercise 2.1 -- Player Class
In the [`src`](src) directory, make a new `Player.java` class. The Player class is supposed to have:

- `String` name
- `int` score
- `int` health
- `boolean` isAlive

Inject these parameters via Class constructor. Also, encapsulate these fields and create the neccessary getters and setters. Print information about Player object in a `printStats()` function.

#### Exercise 2.2 -- Enemy Class
Create an `Enemy.java` class analogous to the Player class. It should have following elements:

- `String` name
- `int` health
- `boolean` isAlive

Inject these parameters via Class constructor. Also, encapsulate these fields and create the neccessary getters and setters. Print information about Enemy objects in a `printStats()` function.

#### Exercise 2.3 -- Main Class & Interactions
Create a `Main.java` class and design a `main` function to simulate the game. Create objects of the Player and Enemy classes, define their attributes, and utilize the `printStats()` method to display the initial state of the player and enemy.

Now, let the Player attack the Enemy via an `attackEnemy(Enemy enemy)` function in the Player class. When a player attacks an enemy, the health of the enemy decreases. Use the formula `new_health = health - 10` for the attack. If a player attacks and the health of the enemy is less than or equal to zero, the enemy is marked as dead and the player's score increases by 1.

#### Exercise 2.4 -- Variable Shadowing
Consider the Player's `attackEnemy(Enemy enemy)` method. If there is a local variable named `enemy` inside the method, explain what would occur i.e., describe the concept of variable shadowing. Also, discuss how the `this` keyword can be used to avoid this issue.

> **Assistant's Note:** For the `attackEnemy(Enemy enemy)` method, think about what it's expecting to happen and how to use `getters` and `setters` to modify the object's value. Also, look at the article on [Variable Shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and how the Java keyword [this](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html) works.