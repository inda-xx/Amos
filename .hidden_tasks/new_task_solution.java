```java
public class ByteBeast {
    private String name;
    private int level;
    private int health;
    private int attack;
    private int defense;
    private boolean isAlive;

    public ByteBeast(String name, int level, int health, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.isAlive = true;
    }

    public String getName() { return this.name; }
    public int getLevel() { return this.level; }
    public int getHealth() { return this.health; }
    public int getAttack() { return this.attack; }
    public int getDefense() { return this.defense; }
    public boolean isAlive() { return this.isAlive; }

    public void setName(String name) { this.name = name; }
    public void setLevel(int level) { this.level = level; }
    public void setHealth(int health) { this.health = health; }
    public void setAttack(int attack) { this.attack = attack; }
    public void setDefense(int defense) { this.defense = defense; }
    public void setAlive(boolean isAlive) { this.isAlive = isAlive; }

    public void printStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        if (isAlive) {
            System.out.println("Status: Alive");
        } else {
            System.out.println("Status: Dead");
        }
    }

    public void battle(ByteBeast opponent) {

        int damage = (this.attack * this.level - opponent.defense) > 0 ? (this.attack * this.level - opponent.defense) : 0;
        opponent.setHealth(opponent.getHealth() - damage);
        
        if (opponent.getHealth() <= 0) {
            opponent.setAlive(false);
        }
    }

    public static void main(String[] args) {
        ByteBeast beast1 = new ByteBeast("Rex", 1, 20, 5, 7);
        ByteBeast beast2 = new ByteBeast("Talon", 2, 18, 4, 6);

        beast1.printStats();
        beast2.printStats();

        beast1.battle(beast2);

        beast1.printStats();
        beast2.printStats();
    }
}
```