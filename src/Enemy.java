
public class Enemy {
  public String name;
  public int maxHealth;
  public int enemyAttackDamage;
  public int currHealth;

  public Enemy(String name, int maxHealth, int attackDamage) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.enemyAttackDamage = attackDamage;
    this.currHealth = maxHealth;
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
