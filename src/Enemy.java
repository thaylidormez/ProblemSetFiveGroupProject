
public class Enemy {
  private String name;
  private int maxHealth;
  private int attackDamage;
  private int currHealth;

  public Enemy(String name, int maxHealth, int attackDamage) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.attackDamage = attackDamage;
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
