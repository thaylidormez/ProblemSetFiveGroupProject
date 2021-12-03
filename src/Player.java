public class Player {
    private int health;
    private int attackDamage ;
    private int numHealthPotions;

    public Player(){
        // Player Variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;

    }

    public Player(int health, int attackDamage, int numHealthPotions){
        this.health = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
    }
}

// new changes