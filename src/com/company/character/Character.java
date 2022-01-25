package com.company.character;

public abstract class Character {
    protected int xCoord;
    protected int yCoord;
    protected char symbol;
    protected EnemyType enemyType;
    protected boolean isVisible = true;
    private int health = 3;
    private boolean hasWeapon;
    protected WeaponType wType;
    protected int wDamage;

    public void setHasWeapon(boolean setWeapon) {
        this.hasWeapon = setWeapon;
    }
    public boolean isHasWeapon() {
        return hasWeapon;
    }
    public WeaponType getwType() {
        return wType;
    }
    public int getwDamage() {
        return wDamage;
    }
    public EnemyType getEnemyType() {
        return enemyType;
    }
    public int getHealth(){
        return health;
    }
    public int takeHealth(){
        return health--;
    }
    public void resetHealth() {
        this.health =3;
        System.out.println("Health resetted");
    }
    public void kill(){
        this.health = 0;
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
