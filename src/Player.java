public class Player {
    public int health;
    public int attackDamage ;
    public int numHealthPotions;
    public String name;

    public Player(){
        // Player Variables
        name = "Bob";
        health = 100;
        attackDamage = 50;
        numHealthPotions = 3;

    }

    public Player(String name, int health, int attackDamage, int numHealthPotions){

        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
    }




}

// new changes