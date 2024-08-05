# Java Game: The Hunter's Quest! 🏹

Let's dive into creating a basic game! In this assignment, you'll create a small game application where a player can move, score points, and interact with enemies.

### 💀 Deadline
This work should be completed before the exercise, on **Friday 23rd September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the [course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
You must read and answer the questions in the OLI material for Module 2.

- Read ["Looking Inside Classes"](https://kth.oli.cmu.edu/jcourse/webui/guest/syllabus/module.do?context=c745e5a8801f01b6a0b9a6276df315c5)
- Register for the course key `dd1337-ht22` if you haven't, at [https://kth.oli.cmu.edu/](https://kth.oli.cmu.edu/)

> **Assistant's Note:** The tasks in the OLI material may not coincide perfectly with this year's assignments, so feel free to read ahead if you didn't find all the material.

### ✅ Learning Goals

This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope and implementing *variable shadowing*

### 🚨 Troubleshooting Guide
Check the [discussion board](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) first if you run into issues. Chances are someone already asked a similar question. If your issue is new, make a post explaining your problem and promptly a TA will get in touch. Remember, you can always discuss with your peers but **don't share answers**!

### 🏛 Assignment

In this assignment, you shall create a simple game called *The Hunter's Quest*. In this game, the player would be a hunter facing dangerous opponents in a forest.

#### Exercise 2.0 - Player class
Create a `Player.java` class with variables to store the player name, current score, and hit points (HP). The player can move in a virtual grid with x and y coordinates, so add *instance fields* to store the current player position. The class should also contain a boolean variable to check if the player is alive.

#### Exercise 2.1 - Enemy class
Create another class `Enemy.java` modeling an enemy. It should contain a name, hit points, and position just like the player. It also needs a power level which will determine how dangerous each enemy is.

#### Exercise 2.2 - Getters and Setters
Encapsulate the *Player* and *Enemy* classes. Add *getters* and *setters* for your fields.

#### Exercise 2.3 - Constructors
Create constructors for the `Player` and `Enemy` classes so you can set the initial variables when creating new instances.

#### Exercise 2.4 - Game Mechanics
Add methods in your classes to move the player and enemies around the virtual grid (up, down, left, right). Then, implement a combat system, where players can attack enemies and enemies can counter-attack. Use your `main` method to create instances of your classes and simulate a game.

#### Exercise 2.5 - Scoring System
The player gains points each time they defeat an enemy. Implement a scoring system and create a method that updates the player's score when an enemy is defeated.

#### Exercise 2.6 - Game Over
When the player’s HP falls to zero, they lose the game. Implement a system that checks the player’s HP, updates the alive status and ends the game when their HP is zero.

#### Bonus Challenge - Variable Shadowing
Implement a method where the concept of variable shadowing is evident, and then fix it.

> **Assistant's Note:** You can execute your game functions sequentially in your main method. Keep it simple, it doesn’t need a User Interface, automated game looping or event-driven logic!

Give it your best shot and have fun coding "The Hunter's Quest" game! 🎯

### 🐞 Bugs and errors?
If you encounter any issue or inconsistency in this exercise, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be rewarded with an honorable mention in the acknowledgment section!