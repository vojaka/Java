package com.company.character;

//import com.company.character.Character;

import com.company.World;

public class Player extends Character {
    private Direction direction;

    public Player() {
        this.xCoord = 1;
        this.yCoord = 1;
        this.symbol = 'p';
        this.direction = Direction.UP;
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
                    if (yCoord>1){
                        yCoord--;
                    }
                    yCoord--;
                    break;
                case DOWN:
                    if (yCoord >= world.getHeight()){
                        yCoord++;
                    } else {
                        yCoord++;
                    }
                    break;
                case LEFT:
                    if(xCoord >1){
                        xCoord--;
                    }
                    xCoord--;
                    break;
                case RIGHT:
                    if (xCoord > world.getWidth()){
                        xCoord++;
                    }
                    xCoord++;
                    break;
            }
        }
    }


