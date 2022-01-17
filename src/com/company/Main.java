package com.company;

import com.company.character.Enemy;
import com.company.character.Player;
import com.company.character.QuestMaster;

public class Main {

    public static void main(String[] args) {
        System.out.println("töötab");
        World world = new World(5,5);

        Player player = new Player();
        world.addCharacters(player);

        Enemy enemy = new Enemy();
        world.addCharacters(enemy);

        QuestMaster questMaster = new QuestMaster();
        world.addCharacters(questMaster);



        world.printMap();
    }
}
