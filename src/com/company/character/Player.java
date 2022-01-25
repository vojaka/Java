package com.company.character;

//import com.company.character.Character;

import com.company.World;
import java.util.HashMap;

public class Player extends Character {
    private Direction direction;

    public Player() {
        this.xCoord = 1;
        this.yCoord = 1;
        this.symbol = 'p';
//        this.direction = Direction.UP;
    }
    public void move(String input, World world) {
        switch (input) {
            case "w":
                this.direction = Direction.UP;
                break;
            case "s":
                this.direction = Direction.DOWN;
                break;
            case "a":
                this.direction = Direction.LEFT;
                break;
            case "d":
                this.direction = Direction.RIGHT;
                break;
        }

        switch (direction) {
            case UP:
                if (yCoord < 1) {
                    yCoord++;
                    System.out.println("outside borders UP");
                } else {
                    yCoord--;
                }
                break;
            case DOWN:
                if (yCoord == world.getHeight() - 1) {
                    yCoord--;
                    System.out.println("outside borders DOWN");
                } else {
                    yCoord++;
                }
                break;
            case LEFT:
                if (xCoord < 1) {
                    xCoord++;
                    System.out.println("outside borders LEFT");
                } else {
                    xCoord--;
                }
                break;
            case RIGHT:
                if (xCoord == world.getWidth() - 1) {
                    xCoord--;
                    System.out.println("outside borders RIGHT");
                } else {
                    xCoord++;
                }
                break;
        }
    }


    private HashMap<EnemyType, Integer> killedEnemies = new HashMap<>();
    public void showKilledEnemies() {
        for (EnemyType i : killedEnemies.keySet()) {
            System.out.println("Enemy Type " + i + " Number of death: " + killedEnemies.get(i));
        }
    }
    public void addToKilledEnemies(EnemyType enemyType, int eplus1) {
        switch (enemyType){
            case ANT:
                 Integer count = killedEnemies.get(enemyType);
                if (count == null) {
                    killedEnemies.put(EnemyType.ANT, 1);
                }
                else {
                    killedEnemies.put(EnemyType.ANT, count + eplus1);
                }
//            case MOUSE:
//                killedEnemies.put(enemyType, killedEnemies.get(enemyType) + eplus1);
        }
    }
    public void revivePlayer(){
        this.resetHealth();
    }
}


