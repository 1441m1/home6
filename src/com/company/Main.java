package com.company;

public class Main {

    public static void main(String[] args) {
Boss boss = new Boss ( 20,46);
Weapon weapon = new Weapon("колибри", "гладкоствольный пистолет");
boss.setWeapon(weapon);
        System.out.println(boss.getHealth()+ " " + boss.getDamage()+ " " + boss.getWeapon().getNameWeapon()+ " " + boss.getWeapon().getTypeWeapon());
    }
}
