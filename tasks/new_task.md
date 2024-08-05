# Battle of Byte-sized Beasts! 🕹️👾

Get ready to code up your very own simple terminal-based game application. You'll become acquainted with designing Java classes, setting up functionalities, and pit creatures against each other in a mythical miniaturized virtual battlefield!

### ⏱️ Deadline
Get your gaming gears set by **Friday, 2nd December**.

### 👩‍🏫 Instructions

Here's what you need to check for the assignment details and submission guidelines: [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation

Gear up for the task with module 3 insights:

- Study [Building Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If not yet registered, head to https://kth.oli.cmu.edu/, signup and use the course key `dd1337-ht22`

> **Assistant's Note:** Keep in mind that this year's OLI content and tasks might have a slightly different alignment.

### 💡 Learning Goals

This assignment will help you master:
- Designing Java classes
- Instituting instance fields
- Developing a constructor method
- Creating *getters* and *setters*
- Terminal-based printing
- Applying the `main` method
- Understanding Scope, or *variable shadowing*

### <svg>❗</svg> Troubleshooting Guide

Stuck? Don't worry! Follow this process:

1. Visit this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to find if anyone else is struggling with the same issue.
2. If not, it's time to ask a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Give it a descriptive title, commencing with "Task *x*: *summary of your problem*"
3. Get the help of a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab timing.

Friendly reminder: feel free to discuss with your course pals but **keep your answers to yourself**!

### 🎯 Assignment

Build an engaging game featuring miniature mythical characters, the *ByteBeasts*. You're going to model these tiny terrors in Java!

#### Exercise 1 -- Draft a ByteBeast

In the [`src`](src) folder, start by creating a class called `ByteBeast.java`. Your ByteBeast-class should contain the following attributes:

- `String` name
- `int` level
- `int` health
- `int` attack
- `int` defense
- `boolean` isAlive

#### Exercise 2 -- Breathing Life into Your Creature

Done with the fields? Now it's time to bestow some behaviors. Set the access modifiers of the fields in the ByteBeast class to `private` and add *getters* and *setters* for each field which are a total of ten methods! For your `boolean` type, remember to name them as `isAlive()` and `setAlive()`.

#### Exercise 3 -- Create a ByteBeast

Construct a method to generate a new ByteBeast object with the help of a constructor.

#### Exercise 4 -- ByteBeast Info Checker

Next, foster a method named `printStats()` that can be used to print all details about the ByteBeast to the terminal.

#### Exercise 5 -- BattleByte: Fight!

Time to make some ruckus! Fabricate a method called `battle` that takes in a ByteBeast object, which will be its opponent. The offense can reduce the health of the opponent calculated based on the attacker's level, attack power, and the opponent's defense. Don't forget to check for the health and update the 'isAlive' status.

#### Exercise 6 -- An Exploration of Variable Shadowing

Check out the examples of *Variable shadowing* below. Ponder on how to fix these examples. Reflect on the concepts of *local scope*, *global variables*, and *instance fields* while examining these examples.

### 🐛 Found bugs?

If you encounter any inconsistencies or errors in this exercise, consider opening a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Helpful bug reports will receive an acknowledgment!