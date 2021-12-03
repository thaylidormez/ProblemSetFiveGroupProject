
public class Enemy {
  private String name;
  private int maxHealth;
  private int attackDamage;

  public Enemy(String name, int maxHealth, int attackDamage) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.attackDamage = attackDamage;

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

  //Skeleton; max health: 75    attack damage: 10

      //Zombie; max health: 85      attack damage: 15

      //Warrior; max health: 95     attack damage: 20

      //Assassin; max health: 110   attack damage: 25

    // decromancer; max health : 200 attack damage: 30 final boss to defeat the game 1/20 chance of it showing up
}
