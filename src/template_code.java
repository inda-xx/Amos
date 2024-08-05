```java
    // Create your template with the classname "ByteBeast"
    public class ByteBeast {

        // Identify your ByteBeast's attributes; includes the String name and Integer values for level, health, attack, and defense. State the ByteBeast's living status with a Boolean.
        private String name;
        private int level;
        private int health;
        private int attack;
        private int defense;
        private boolean isAlive;

        //Next step is to create a constructor for your ByteBeast
        public ByteBeast(String name, int level, int health, int attack, int defense) {
            this.name = name;
            this.level = level;
            this.health = health;
            this.attack = attack;
            this.defense = defense;
            this.isAlive = true;
        }

        // getters
        // Complete your ByteBeast's getters here
        public String getName() { return this.name; }
        public int getLevel() { return this.level; }
        public int getHealth() { return this.health; }
        public int getAttack() { return this.attack; }
        public int getDefense() { return this.defense; }
        public boolean isAlive() { return this.isAlive; }

        // setters
        // Complete your ByteBeast's setters here
        public void setName(String name) { this.name = name; }
        public void setLevel(int level) { this.level = level; }
        public void setHealth(int health) { this.health = health; }
        public void setAttack(int attack) { this.attack = attack; }
        public void setDefense(int defense) { this.defense = defense; }
        public void setAlive(boolean isAlive) { this.isAlive = isAlive; }

        // print Stats method
        // Complete the method to print your ByteBeast's stats here
        public void printStats() {
            System.out.println("Name: " + this.name);
            System.out.println("Level: " + this.level);
            System.out.println("Health: " + this.health);
            System.out.println("Attack: " + this.attack);
            System.out.println("Defense: " + this.defense);
            if(isAlive) {
                System.out.println("Status: Alive");
            } else {
                System.out.println("Status: Dead");
            }
        }

        // attack method
        // Complete the method for your ByteBeast to attack here
        public void battle(ByteBeast opponent) {
            // Calculate damage here
            // Update opponent's health here
            // Update opponent's isAlive status here
        }

        // main method
        // Create your main method here
        public static void main(String[] args) {
            // Create ByteBeasts here
            // Print their Stats here
            // Start the battle here
            // Print their Stats here
        }
    }
```