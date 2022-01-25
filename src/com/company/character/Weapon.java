package com.company.character;

public class Weapon extends Character {

    public Weapon() {
            this.xCoord = 2;
            this.yCoord = 3;
            this.symbol = 'w';
            this.wType = WeaponType.AK47;
            this.wDamage = 3;
            this.isVisible = true;
            System.out.println(this.wType);
        }
    }

