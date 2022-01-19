package com.company;

import com.company.character.Character;

import java.util.ArrayList;
import java.util.List;

public class World {


    private int height;
    private int width;

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    private List<Character> characters = new ArrayList<>();

    public World(int height, int width) {
        System.out.println("loodi uus maailm");
        this.height = height;
        this.width = width;
    }

    public void addCharacters(Character character) {
        this.characters.add(character);
    }

    public void printMap() {
        System.out.println("kutsuti v'lja");
        char symbol;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0 || x == width-1) {
                    symbol = '|';
                } else if (y == 0 || y == height-1) {
                    symbol = '-';
                } else {
                    symbol = ' ';
                }
                for (Character p: characters) {
                    if (p.getyCoord()== y && p.getxCoord() ==x && p.isVisible())
                    symbol = p.getSymbol();
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}