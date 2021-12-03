import java.util.Random;
import java.util.Scanner;

public class ProblemSetWorksheet {


    public static void main (String[] args){

        // System objects
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // game variables
        String[] enemies = { "Skeleton", "Zombie" , "Mummy", "Necromancer" };
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;
        int enemiesDefeated = 0;



        Enemy skeleton = new Enemy("Zombie", maxEnemyHealth, enemyAttackDamage);
        skeleton.setAttackDamage(10);
        skeleton.setMaxHealth(75);

        Enemy zombie = new Enemy("Skeleton", maxEnemyHealth, enemyAttackDamage);
        zombie.setAttackDamage(15);
        zombie.setMaxHealth(85);

        Enemy warrior = new Enemy("Warrior", maxEnemyHealth, enemyAttackDamage);
        warrior.setAttackDamage(20);
        warrior.setMaxHealth(95);

        Enemy assassin = new Enemy("Assassin", maxEnemyHealth, enemyAttackDamage);
        assassin.setAttackDamage(25);
        assassin.setMaxHealth(120);

        Enemy[] enemyObjects = {Skeleton, Zombie , Mummy, Necromancer};
        //move to the enemy method, dont thing we need an array here

        // Player Variables

        System.out.println("Enter your name:");
        String name = scnr.next();
        int health = 150;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50;

        Player player = new Player(name, health, attackDamage, numHealthPotions);



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

            Combat.runCombat(player);

            if(health < 1) {
                System.out.println("Blood drips from your wounds as you fall to the ground. \n Will this crypt be your burial ground too?" +
                        " \n The Necromancer lives another day.");
                break;
            }

            System.out.println("-----------------------------------");
            System.out.println(" # " + enemy.getName + " was defeated! # ");
            System.out.println(" # You have " + player.health + " HP left. #");

            enemiesDefeated++;
            if(rand.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy.getName + " dropped a health potion! #");
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