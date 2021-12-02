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
            System.out.println("You make your way deeper into the crypt, looking for the necromancer.");

            int enemyHealth = rand.nextInt(maxEnemyHealth); //this will go in the enemies object
            String enemy = enemies[rand.nextInt(enemies.length)]; //this we can leave mostly in the main and then our
            // enemy object can take in the rand int and then figure out what enemy and what their health/damage is


            System.out.println("\t# In from of you, you see a " + enemy + " staggering in the hall! #\n# Prepare to fight! #\n");

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
                System.out.println("Blood drips from your wounds as you fall to the ground. \n Will this crypt be your burial ground too?" +
                        " \n The Necromancer lives another day.");
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
                System.out.println("You continue on, forging ahead towards the necromancer!");
            }
            else if (input.equals("2")) {
                System.out.println("You exit the dungeon alive, but the necromancer lives to haunt another day!");
                break;
            }
        }
        System.out.println("# You defeated " + enemiesDefeated + " enemies");
        System.out.println("####################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("####################");

    }
}