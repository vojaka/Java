package com.company.character;

public abstract class Character {
    protected int xCoord;
    protected int yCoord;
    protected char symbol;
    protected boolean isVisible = true;
    private int health = 3;

    public int getHealth(){
        return health;
    }
    public void resetHealth() {
        this.health =3;
    }
    public int takeHealth(){
        return health--;
    }
    public boolean isVisible() {
        return isVisible;
    }
    public void setVisible(boolean visible) {
        isVisible = visible;
    }
    public int getxCoord() {
        return xCoord;
    }
    public int getyCoord() {
        return yCoord;
    }
    public char getSymbol() {
        return symbol;
    }

}
