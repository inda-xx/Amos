# The Epic Battle of Pixels: A Java Game!

For the second week of ITCM, you are going to step into the world of game development. You will be applying your knowledge of object-oriented programming in creating a basic outline of a pixel game in Java.

### 🗓 Deadline
This work should be completed and turned in before **Sunday 20th March**.

### 👩‍🏫 Instructions
Refer to the course instructions for how to do and submit the assignment [course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation
Prepare by reading Module 2 of the online course material.
- Revise [Working with Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=d58744f1d4b645b84038fe81dd63c6af)
- If you haven't yet done so, go to https://kth.oli.cmu.edu/, sign up and register for the course key `itcm-ht23`

### ✅ Learning Goals
On completion of this assignment, you should:

* Understand the design of Java classes
* Add instance fields
* Add a constructor method
* Be familiar with the creation of *getters* and *setters*
* Print to the terminal
* Use the `main` method
* Understand scope (also known as *variable shadowing*)

### 🐞 Is something not working?
Follow these steps if you require assistance:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Is someone else experiencing the same issue?
2. If not, create your own [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Make the title informative and begin with "Task *x*: *summary of problem*"
3. If you prefer face-to-face communication, ask a TA in person during the [weekly lab session](https://queue.csc.kth.se/Queue/INDA). Check your timetable to see when the next lab session is.

You are encouraged to discuss with your classmates but do not share your answers directly!

### 🏛 Assignment

We need you to create several classes to model a simple game. Here's what your game will look like:

* A class called `Player` will represent the player in the game. This class should include fields for player's name, health points (hp), score, and position (x, y coordinates).
* Similarly, create a class `Enemy` with the same fields as the `Player` class, but with no score field.
* The `Player` and `Enemy` classes should each incorporate suitable *getters* and *setters*.
* Now, create a `Game` class that will control the different aspects of the game. This class should include methods to move a player or enemy at a new position in the playing area, put an enemy to sleep, and increase the player's score.
* Don't forget to add a constructor to each class, to allow for easy creation of player and enemy objects with preset fields.
* It would be valuable to include a method in the `Player` class to print out their current score.
* Finally, ensure that your `Game` class includes a `main` method, to run your game!

### ⚒ Exercises

#### Exercise 1 -- Game Pieces
Create the `Player` and `Enemy` classes with the specified fields and suitable *getters* and *setters*. Make sure you incorporate a constructor within each class.

#### Exercise 2 -- Movements and Interactions
In the `Game` class, add methods to move the player and enemies in the field. Also include a method to put an enemy to sleep making it non-interactable for a certain amount of time.

#### Exercise 3 -- Scoring
Add a method within the `Player` class to print out the player's score. Additionally, include a method in the `Game` class to increase a player's score when they interact with certain objects or achieve certain feats in the game.

#### Exercise 4 -- Main Method
Include a `main` method in your `Game` class to demonstrate the functionality of your game. Create instances of players and enemies, move them in the field, and have them interact with each other.

#### Exercise 5 -- Variable Shadowing
Look into the examples provided in the course material about the concept of variable shadowing. It is an important concept in object-oriented programming related to scope.

### 🐛 Found a bug?
If you find any discrepancies in this assignment, please open a [New Issue](https://gits-15.sys.kth.se/inda-21/help/issues/new) with the title "Task *x* Error: *summary of error here*". Alternatively, you can contact a course assistant directly in the lab.