package com.company;

import com.company.character.Enemy;
import com.company.character.Player;
import com.company.character.QuestMaster;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Game Start");
        World world = new World(5,5);

        Player player = new Player();
        world.addCharacters(player);

        Enemy enemy = new Enemy();
        world.addCharacters(enemy);

        QuestMaster questMaster = new QuestMaster();
        world.addCharacters(questMaster);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            while (!input.equals("end")) {
                player.move(input, world);
               GameUtil.checkIfPlayerAndEnemyMet(player, enemy, scanner);
               GameUtil.checkIfPlayerAndQmMet(player, enemy, questMaster);
                world.printMap();
                input = scanner.nextLine();
            }
        } catch (GameOverException e) {
            System.out.println("Game End");
        }
    }




}
