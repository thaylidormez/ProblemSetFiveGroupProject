
public class Enemy {
  public String name;
  public int maxEnemyHealth;
  public int enemyAttackDamage;
  public int currHealth;

  public Enemy(){

    maxEnemyHealth = 75;
    enemyAttackDamage = 25;

    Enemy skeleton = new Enemy("Skeleton", maxEnemyHealth, enemyAttackDamage);
    skeleton.setAttackDamage(10);
    skeleton.setMaxHealth(75);

    Enemy zombie = new Enemy("Zombie", maxEnemyHealth, enemyAttackDamage);
    zombie.setAttackDamage(15);
    zombie.setMaxHealth(85);

    Enemy warrior = new Enemy("Mummy", maxEnemyHealth, enemyAttackDamage);
    warrior.setAttackDamage(20);
    warrior.setMaxHealth(95);

    Enemy assassin = new Enemy("Necromancer", maxEnemyHealth, enemyAttackDamage);
    assassin.setAttackDamage(25);
    assassin.setMaxHealth(120);

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
