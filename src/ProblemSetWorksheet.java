import java.util.Random;
import java.util.Scanner;

public class ProblemSetWorksheet {


    public static void main (String[] args){

        // System objects
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // game variables
        String[] enemies = { "Skeleton", "Zombie" , "Warrior", "Assassin" };
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;
        int enemiesDefeated = 0;

        // Player Variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;



        System.out.println("# After your difficult journey, you have finally reached your destination. #\n# In a crack in the mountain you see the entrance " +
                "to the necromancer's crypt! #\n# There is no shame in turning away now. #\n# Enter, if you dare! #");
        System.out.println("What do you do?");
        System.out.println("1. Enter");
        System.out.println("2. Turn back");

        String input = scnr.nextLine();
        boolean running = false;

        if (input.equals("1")){
            running = true;
        }
        else if (input.equals("2")){
            running = false;
        }



        GAME:
        while(running) {
            System.out.println("-----------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");

            while(enemyHealth > 0){
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                input = scnr.nextLine();
                if(input.equals("1")) {
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You Strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You recieve " + damageTaken + " in retaliation!");

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
                                + "\n\t> You now have " + health + " HP."
                                + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    }

                    else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!");
                    }
                }
                else if (input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME;
                }
                else {
                    System.out.println("\tInvalid command!");

                }
            }
            if(health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }

            System.out.println("-----------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");

            enemiesDefeated++;
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! #");
                System.out.println(" # You have " + numHealthPotions + " health potion(s). # ");
            }

            System.out.println("-----------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit dungeon");

            input = scnr.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = scnr.nextLine();
            }

            if(input.equals("1")) {
                System.out.println("You continue on your adventure!");
            }
            else if (input.equals("2")) {
                System.out.println("You exit the dungeon, successful from your adventure!");
                break;
            }
        }
        System.out.println("# You defeated " + enemiesDefeated + " enemies");
        System.out.println("####################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("####################");

    }
}