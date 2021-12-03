import java.util.Random;
import java.util.Scanner;

public class Combat {
    public static void runCombat(Player player, Enemy enemy, String[] enemies){

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int enemyHealth = rand.nextInt(maxEnemyHealth); //this will go in the enemies object
        String enemy = enemies[rand.nextInt(enemies.length)]; //this we can leave mostly in the main and then our
        // enemy object can take in the rand int and then figure out what enemy and what their health/damage is
        //in enemy we will need getName getAttackDamage getHealth
        //they don't need setters that we access because it is all chosen by the random number we export from main



        System.out.println("\t# In from of you, you see a " + enemy.getName + " staggering in the hall! #\n# Prepare to fight! #\n");

        while(enemyHealth > 0){  //START HERE ON FIGHT METHOD
            System.out.println("\tYour HP: " + player.health);
            System.out.println("\t" + enemy.getName + "'s HP: " + enemy.Health);
            System.out.println("\n\tWhat would you like to do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink health potion");
            System.out.println("\t3. Run!");

            String input = scnr.nextLine();
            if(input.equals("1")) {
                int damageDealt = rand.nextInt(attackDamage);
                int damageTaken = rand.nextInt(enemy.enemyAttackDamage);

                enemyHealth -= damageDealt; //change these to call methods within the enemy
                health -= damageTaken; //change to call method within player

                System.out.println("\t> You Strike the " + enemy.getName + " for " + damageDealt + " damage.");
                System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                if(health < 1){
                    System.out.println("\t You have taken too much damage, you re too weak to go on");
                    break;
                }
            }
            else if (input.equals("2")){
                if(numHealthPotions > 0){
                    health += healthPotionHealAmount;
                    if (health > 100){
                        health = 100;
                    }
                    numHealthPotions--;
                    System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
                            + "\n\t> You now have " + player.health + " HP."
                            + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                }

                else {
                    System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
                }
            }
            else if (input.equals("3")) {
                System.out.println("\tYou run away from the " + enemy.getName + "!");
                continue GAME;
            }
            else {
                System.out.println("\tInvalid command!");

            }
        }//END HERE ON THE COMBAT METHOD -everything between the start and end can fit in a method
        //we just have the parameters be our enemy and player objects
    }
}
