package com.company;

import com.company.character.Enemy;
import com.company.character.EnemyType;
import com.company.character.Player;
import com.company.character.QuestMaster;

import java.util.Scanner;

public class GameUtil {
    protected static void checkIfPlayerAndEnemyMet(Player player, Enemy enemy, Scanner scanner) throws GameOverException{
        if (player.getxCoord()== enemy.getxCoord() &&
                player.getyCoord() == enemy.getyCoord() &&
                enemy.isVisible() && player.isHasWeapon()==false)
        {
            System.out.println("You met your enemy!");
            System.out.println("Tell the number from 1-3");

            while (player.getHealth()>0 &&
                    enemy.getHealth()>0
            ) {
                GameUtil.fightWithEnemy(player, enemy, scanner);
            }
        } else if(player.getxCoord()== enemy.getxCoord() &&
                player.getyCoord() == enemy.getyCoord() &&
                enemy.isVisible() && player.isHasWeapon()==true)
        {
                enemy.kill();
                enemy.setVisible(false);
                int plus1 =1;
                player.addToKilledEnemies(enemy.getEnemyType(), plus1);
                player.showKilledEnemies();
        }

        if ( (enemy.getHealth() == 0)){

        } else if (player.getHealth() == 0){
                    throw new GameOverException();
        }
    }
    private static void fightWithEnemy(Player player, Enemy enemy, Scanner scanner) {
        int randomNumber = (int) (Math.random()*3)+1;
        int playerNumber = 0;



        while (playerNumber<1||playerNumber>3 && enemy.isVisible()==true) {
            try {
                playerNumber = Integer.parseInt(scanner.nextLine());
                if (randomNumber==playerNumber) {
                    player.takeHealth();
                }else if(playerNumber >= 1 && playerNumber <=3) {
                    enemy.takeHealth();
                } else {
                    throw new NumberHighLowError();
                }
                System.out.printf("random number: %s\nplayer number: %s\nplayer health : %s\nenemy health: %s\n",randomNumber, playerNumber,player.getHealth(),enemy.getHealth());

                if (enemy.getHealth()==0){
                    int plus1 = 1;
                    player.addToKilledEnemies(enemy.getEnemyType(), plus1);
                }
                player.showKilledEnemies();
                enemy.setVisible(false);
            } catch (NumberFormatException e) {
                System.out.println("Error number 1");
                e.printStackTrace();
            } catch (NumberHighLowError e) {
                System.out.println("Error number 2");
                e.printStackTrace();
            }
        }
    }
    protected static void checkIfPlayerAndQmMet(Player player, Enemy enemy, QuestMaster questMaster) {
        if (player.getxCoord()== questMaster.getxCoord() &&
                player.getyCoord() == questMaster.getyCoord()) {
            System.out.println("You met your QM!");
            enemy.reviveEnemy();
            player.revivePlayer();
            enemy.setVisible(true);
        }
    }
}
