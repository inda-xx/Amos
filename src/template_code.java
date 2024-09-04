```java
/*  
 * This is the basic template for this assignment. Fill out the placeholders as directed by your exercise
 * instructions to create a hero object that includes a name, hp, attack, defense, magicPotion, and experience.
 */

public class Hero {
    // Fields Exercise 2.0
    private String name; //TODO: Initialize name
    private int hp; //TODO: Initialize hp
    private int attack; //TODO: Initialize attack
    private int defense; //TODO: Initialize defense
    private boolean magicPotion; //TODO: Initialize magicPotion
    private int experience; //TODO: Initialize experience

     // Getters and Setters Exercise 2.1
     public String getName() {
         //TODO: Implement getter for name
     }

     public void setName(String name) {
         //TODO: Implement setter for name
     }

     // Continue implementing getters and setters for each field (hp, attack, defense, magicPotion, experience)

     /* Constructor Exercise 2.2
      * Implement a constructor that accepts all six instance variables (name, hp, attack, defense, magicPotion, experience) 
     * as parameters and assigns them to the instance variables.
     */
     public Hero(String name, int hp, int attack, int defense, boolean magicPotion, int experience){
         //TODO: Implement the constructor
     }

     // Implement printHeroDetails Exercise 2.3 
     public void printHeroDetails(){ 
         //TODO: Implement this method to print all hero fields        
     }

     // Implement the goForAdventure Exercise 2.4
     public void goForAdventure(String path){
         //TODO: Implement this method to obtain experience and decide if you get a magic potion based on the provided path string
     }

     public static void main(String[] args) {
         Hero hero = new Hero("Luna", 100, 70, 20, false, 0); //Replace with your variables if needed
         hero.printHeroDetails();
     }

     // Variable Shadowing Exercise 2.5
     //TODO: Here, examine the examples of variable shadowing and try to fix the errors.
 }
 ```