```java
public class Hero {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private boolean magicPotion;
    private int experience;

    public Hero(String name, int hp, int attack, int defense, boolean magicPotion, int experience){
         this.name = name;
         this.hp = hp;
         this.attack = attack;
         this.defense = defense;
         this.magicPotion = magicPotion;
         this.experience = experience;
     }

     public String getName() {
         return this.name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getHp() {
         return this.hp;
     }

     public void setHp(int hp) {
         this.hp = hp;
     }

     public int getAttack() {
         return this.attack;
     }

     public void setAttack(int attack) {
         this.attack = attack;
     }

     public int getDefense() {
         return this.defense;
     }

     public void setDefense(int defense) {
         this.defense = defense;
     }

     public int getExperience() {
         return this.experience;
     }

     public void setExperience(int experience) {
         this.experience = experience;
     }

     public boolean isMagicPotion() {
         return this.magicPotion;
     }

     public void setMagicPotion(boolean magicPotion) {
         this.magicPotion = magicPotion;
     }

     public void printHeroDetails(){ 
         System.out.println("Name: " + this.name);
         System.out.println("HP: " + this.hp);
         System.out.println("Attack: " + this.attack);
         System.out.println("Defense: " + this.defense);
         System.out.println("Magic Potion Availability: " + this.magicPotion);
         System.out.println("Experience: " + this.experience);
     }

     public void goForAdventure(String path){
         switch(path) {
            case "forest":
                this.experience += 100; 
                this.magicPotion = true;
                break;
            case "city":
                this.experience += 50;
                break;
            case "mountain":
                this.experience += 200;
                this.magicPotion = false; 
                break;
            case "cave":
                this.experience += 150; 
                this.magicPotion = false;
                break;
            default:
                break;
         }
     }

     public static void main(String[] args) {
         Hero hero = new Hero("Luna", 100, 70, 20, false, 0); 
         hero.printHeroDetails();
     }
}
```