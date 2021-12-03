public class Player {
        private int attackDamage ;
    private int numHealthPotions;
    private String name;
    private int currHealth;

    public Player(){
        // Player Variables
        name = "Bob";
        currHealth = 100;
        attackDamage = 50;
        numHealthPotions = 3;

    }

    public Player(String name, int health, int attackDamage, int numHealthPotions){

        this.name = name;
        this.currHealth = health;
        this.attackDamage = attackDamage;
        this.numHealthPotions = numHealthPotions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public void setNumHealthPotions(int numHealthPotions) {
        this.attackDamage = numHealthPotions;
    }



}

// new changes