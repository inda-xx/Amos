```java
public class Player {

    private String name;
    private int score;
    private int hp;
    private int x;
    private int y;
    private boolean isAlive;


    public Player(String name, int hp, int x, int y){
        this.name = name;
        this.hp = hp;
        this.x  = x;
        this.y  = y;
        this.isAlive = true;
    }

    // getters and setters for player name, score, hp, (x, y) position and isAlive status
    // ...

    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void defeat(Enemy enemy){
        if(enemy.getHP() <= 0){
            this.score += 100;
        }
    }

    public void checkStatus(){
        if(this.hp <= 0){
            this.isAlive = false;
        }
    }

    // This method will demonstrate variable shadowing
    public int RetrieveScore(int score){
        return this.score;
    }
}


public class Enemy {

    private String name;
    private int hp;
    private int x;
    private int y;
    private int powerLevel;


    public Enemy(String name, int hp, int x, int y, int powerLevel){
        this.name = name;
        this.hp = hp;
        this.x  = x;
        this.y  = y;
        this.powerLevel = powerLevel;
    }

    // getters and setters for enemy name, hp, (x, y) position and powerLevel
    // ...

    public void moveRight(){
        x++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }
}


public class Main {
    public static void main(String[] args) {
        // Create a new instance of Player at (0, 0) with name "Hunter" and 100 HP
        Player player = new Player("Hunter", 100, 0, 0);

        // Create a new instance of Enemy at (5, 5) with name "Demon", 100 HP and power level 10
        Enemy enemy = new Enemy("Demon", 100, 5, 5, 10);

        // Assume we simulate a game here
        // ...

        player.checkStatus();
    }
}
```