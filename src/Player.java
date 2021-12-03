public class Player {
    private int maxHealth;
    private int attackDamage ;
    private int numHealthPotions;
    private String name;
    private int currHealth;

    public Player(){
        // Player Variables
        name = "Bob";
        maxHealth = 100;
        attackDamage = 50;
        numHealthPotions = 3;

    }

    public Player(String name, int health, int attackDamage, int numHealthPotions){

        this.name = name;
        this.maxHealth = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getCurrHealth() {
        return currHealth;
    }

    public void setCurrHealth(int currHealth) {
        this.currHealth = currHealth;
    }




}

// new changes