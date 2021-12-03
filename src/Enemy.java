import java.util.Random;

public class Enemy {
  public String name;
  public int maxEnemyHealth;
  public int enemyAttackDamage;
  public int currHealth;
  Random rand = new Random();

  public Enemy(int dieRoll, String[] names){


    name = "null";
    maxEnemyHealth = 75; //assign base values just in case
    enemyAttackDamage = 25;

    if (dieRoll < 40) {

      name = names[0];
      enemyAttackDamage = 10;
      maxEnemyHealth = 30;
    }

    if (dieRoll >= 40 && dieRoll < 75) {
      name = names[1];
      enemyAttackDamage = 15;
      maxEnemyHealth = 40;

    }

    if (dieRoll >= 75 && dieRoll < 95) {
      name = names[2];
      enemyAttackDamage = 20;
      maxEnemyHealth = 60;
    }

    if(dieRoll >= 95) {
      name = names[3];
      enemyAttackDamage = 40;
      maxEnemyHealth = 120;
    }

  }

  public Enemy(String name, int maxEnemyHealth, int attackDamage) {
    this.name = name;
    this.maxEnemyHealth = maxEnemyHealth;
    this.enemyAttackDamage = attackDamage;
    this.currHealth = maxEnemyHealth;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMaxHealth() {
    return maxEnemyHealth;
  }

  public void setMaxHealth(int maxHealth) {
    this.maxEnemyHealth = maxHealth;
  }

  public int getAttackDamage() {
    return enemyAttackDamage;
  }

  public void setAttackDamage(int attackDamage) {
    this.enemyAttackDamage = attackDamage;
  }

  public int getCurrHealth() {
    return currHealth;
  }

  public void setCurrHealth(int currHealth) {
    this.currHealth = currHealth;
  }
}
