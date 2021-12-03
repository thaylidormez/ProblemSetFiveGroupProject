import java.util.Random;
import java.util.Scanner;

public class ProblemSetWorksheet {


    public static void main (String[] args){

        // System objects
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        // game variables


        int enemiesDefeated = 0;







        // Player Variables

        Player player = new Player();

        System.out.println("Enter your name:");
        player.setName(scnr.next());
        player.setCurrHealth(150);
        player.setAttackDamage(50);
        player.setNumHealthPotions(3);

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


            if (Combat.runCombat(player) == false) {
            continue;
            }


            if(player.getCurrHealth() < 1) {
                System.out.println("Blood drips from your wounds as you fall to the ground. \n Will this crypt be your burial ground too?" +
                        " \n The Necromancer lives another day.");
                break;
            }

            System.out.println("-----------------------------------");
            System.out.println(" # The Enemy was defeated! # ");
            System.out.println(" # You have " + player.getCurrHealth() + " HP left. #");

            enemiesDefeated++;
            if(rand.nextInt(100) < healthPotionDropChance) {
                player.setNumHealthPotions(player.getNumHealthPotions() + 1);
                System.out.println(" # The enemy dropped a health potion! #");
                System.out.println(" # You have " + player.getNumHealthPotions() + " health potion(s). # ");
            }

            System.out.println("-----------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Delve deeper");
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