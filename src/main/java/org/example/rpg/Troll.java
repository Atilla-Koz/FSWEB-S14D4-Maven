package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{


    public Troll(String name, int hitPoints, int damege) {
        super(name, hitPoints, damege);
    }

    @Override
    public double bleed() {
        return 0.25;
    }

    @Override
    public double poison() {
        return 0.3;
    }

    @Override
    public double attack() {
        return getDamege() + bleed() + poison();
    }


}
