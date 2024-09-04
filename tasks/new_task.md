# 🦸‍♀️ Be the Hero of Your Story!

Welcome to the third exercise of INDA, this time we are going to focus on creating and manipulating Java objects. Polish your armor and prepare your magical spells!

### 💀 Deadline
This work should be completed before the exercise, on **Friday 23rd September**.

### 👩‍🔬 Instructions
For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 🧩 Preparation
You must read and answer the questions in the OLI material for Module 3.

- Read [Making and using objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=ddacefe803f83876188a597b8d7feb1d)
- Don't forget to register at https://kth.oli.cmu.edu/, with the course key `dd1337-ht22`

> **Assistant's Note:** The OLI material and tasks might be slightly out of line this year, so it is ok to read ahead if you did not find all the material.

### ✅ Learning Goals

This weeks learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🆘 Troubleshooting Guide
If you have any questions or problems, follow these steps:

1. Take a look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking about your problem?
2. If you can't find a solution, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, starting with "Task *x*: *summary of problem here*"
3. Approach a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

Collaboration with your peers is encouraged, but **do not share answers**!

### 🏰 Assignment

Assume you're in a different realm, a place where your actions dictate the future of the world. How exciting! In our case, you are a young hero preparing for an epic journey. We will model this scenario in Java!

#### Exercise 2.0 -- Fields
In the [`src`](src) folder, create a new class called `Hero.java`. It should consist of:

- `String` name
- `int` hp (standing for **hit points**)
- `int` attack
- `int` defense
- `boolean` magicPotion
- `int` experience

Now, add an initial main class as presented in Example 1 to `Hero.java`.

<details>
  <summary>🔮 Example 1</summary>

```java
  class Hero {

    // Add your fields here!

    public static void main(String[] args) {
      Hero hero = new Hero();
      hero.name = "Luna";
      hero.hp = 100;
      hero.attack = 70;
      hero.defense = 20;
      hero.magicPotion = false;
      hero.experience = 0;

      System.out.println("Name: " + hero.name);
      System.out.println("HP: " + hero.hp);
      System.out.println("Attack: " + hero.attack);
      System.out.println("Defense: " + hero.defense);
      System.out.println("Magic Potion Availability: " + hero.magicPotion);
      System.out.println("Experience: " + hero.experience);
    }

  } // end class
```
</details>

#### Exercise 2.1 -- Getters and Setters
By restricting the direct access, we move to a concept called [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)). It can be done by setting the [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) of the fields in `Hero.java` to `private`. However, you can still read from and write to the fields by adding *getters* and *setters* methods to each field. Implement these ten methods in total. After that, add the main method provided in Example 2 to `Hero.java`.

<details>
  <summary>🔮 Example 2</summary>

```java
  class Hero {

    // Add your fields here!

    // Add your getters and setters here!

    public static void main(String[] args) {
      Hero hero = new Hero();
      hero.setName("Luna");
      hero.setHp(100);
      hero.setAttack(70);
      hero.setDefense(20);
      hero.setMagicPotion(false);
      hero.setExperience(0);

      System.out.println("Name: " + hero.getName());
      System.out.println("HP: " + hero.getHp());
      System.out.println("Attack: " + hero.getAttack());
      System.out.println("Defense: " + hero.getDefense());
      System.out.println("Magic Potion Availability: " + hero.isMagicPotion());
      System.out.println("Experience: " + hero.getExperience());
    }

  } // end class
  ```
</details>

#### Exercise 2.2 -- Constructor
Implement a constructor in `Hero` class to initialize all the fields. 

#### Exercise 2.3 -- `printHeroDetails()`
Implement a new method called `printHeroDetails()`. It should print all the fields of your hero.

<details>
  <summary> 🔮 Example 3 </summary>

   ```java
   public static void main(String[] args){
     Hero hero = new Hero("Luna", 100, 70, 20, false, 0);
     hero.printHeroDetails();
   }
   ```
 </details>

#### Exercise 2.4 -- Go For the Adventure!
You are ready for your big adventure. Write a method `goForAdventure()`, which should receive a string representing the chosen path (e.g., "forest", "cave", "mountain"). This string would determine your obtained experience and whether you get a magic potion or not.

#### Exercise 2.5 -- Variable Shadowing
Reflect on the examples of variable shadowing below. Try to fix them and understand how the Java keyword `this` works.

<details>
  <summary> 🔮 Shadowing Example </summary>

```java
   public class Hero {
       private int experience = 0;

       public void earnExperience() {
           int experience = 500;
           System.out.println(experience);
       }

       public static void main(String[] args){
           new Hero().earnExperience();
       }
   }
   
   public class Horse {
       private String name;
       private Color color;

       public Horse(String name, Color color) {
           name = name;
           color = color;
       }

       public neigh(){
           String name = "Jolly Jumper";
           System.out.println(name + " neighs! Neiiiigh!");
       }
   }
```
</details>

### 🐞 Bugs and errors?
If you find any inconsistencies or errors in this exercise, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be rewarded by mentions in the acknowledgment section.