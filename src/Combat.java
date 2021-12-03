import java.util.Random;
import java.util.Scanner;

public class Combat {
    public static boolean runCombat(Player player){

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        String[] enemies = {"Skeleton", "Zombie" , "Mummy", "Necromancer" };
        int d100 = rand.nextInt(100);
        Enemy enemyObj = new Enemy(d100, enemies);
        int healthPotionHealAmount = 30;

        enemyObj.setCurrHealth(rand.nextInt(enemyObj.maxEnemyHealth ) + 1); //this will go in the enemies object

        int nameGenerator = rand.nextInt(4);
        enemyObj.setName(enemies[nameGenerator]);

        //this we can leave mostly in the main and then our
        // enemy object can take in the rand int and then figure out what enemy and what their health/damage is
        //in enemy we will need getName getAttackDamage getHealth
        //they don't need setters that we access because it is all chosen by the random number we export from main



        System.out.println("\t# In front of you, you see a " + enemyObj.getName() + " staggering in the hall! #\n# Prepare to fight! #\n");

        while(enemyObj.getCurrHealth() > 0){  //START HERE ON FIGHT METHOD
            System.out.println("\tYour HP: " + player.getCurrHealth());
            System.out.println("\t" + enemyObj.getName() + "'s HP: " + enemyObj.getCurrHealth());
            System.out.println("\n\tWhat would you like to do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink health potion");
            System.out.println("\t3. Run!");

            String input = scnr.nextLine();
            if(input.equals("1")) {
                int damageDealt = rand.nextInt(player.attackDamage);
                int damageTaken = rand.nextInt(enemyObj.enemyAttackDamage);

                enemyObj.setCurrHealth(enemyObj.getCurrHealth() - damageDealt); //change these to call methods within the enemy
                int tempHealth = player.getCurrHealth();
                player.setCurrHealth(tempHealth - damageTaken); //change to call method within player

                System.out.println("\t> You Strike the " + enemyObj.getName() + " for " + damageDealt + " damage.");
                System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                if(player.getCurrHealth() < 1){
                    System.out.println("\t You have taken too much damage, you re too weak to go on");
                    break;
                }
            }
            else if (input.equals("2")){
                if(player.getNumHealthPotions() > 0){
                    player.setCurrHealth(player.getCurrHealth() + healthPotionHealAmount);

                    if (player.getCurrHealth() > 150){
                        player.setCurrHealth(150);
                    }
                    player.setNumHealthPotions(player.getNumHealthPotions()- 1);
                    System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
                            + "\n\t> You now have " + player.getCurrHealth() + " HP."
                            + "\n\t> You have " + player.getNumHealthPotions() + " health potions left. \n");
                }

                else {
                    System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
                }
            }
            else if (input.equals("3")) {
                System.out.println("\tYou run away from the " + enemyObj.getName() + "!");
                return false;
            }
            else {
                System.out.println("\tInvalid command!");

            }
        }//END HERE ON THE COMBAT METHOD -everything between the start and end can fit in a method
        //we just have the parameters be our enemy and player objects

        if(enemyObj.getName().equals("Necromancer")){

            System.out.println("Congratulations! You've slain the Necromancer!");
            System.out.println("####################");
            System.out.println("# THANKS FOR PLAYING! #");
            System.out.println("####################");
            System.exit(1);

        }

        return true;
    }
}
