package com.company.character;

public class Enemy extends Character{

    public Enemy() {
        this.xCoord = 2;
        this.yCoord = 2;
        this.symbol = 'e';
        this.enemyType = EnemyType.getRandomEnemyType();
        System.out.println(this.enemyType);
    }
        public void reviveEnemy(){
            this.resetHealth();
            enemyType = EnemyType.getRandomEnemyType();
            System.out.println("new enemy is " + this.enemyType);
        }
}
