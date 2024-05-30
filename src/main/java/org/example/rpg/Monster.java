package org.example.rpg;

public abstract class Monster {

    private String name;
    private int hitPoints;
    private int damege;

    public Monster(String name, int hitPoints, int damege) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damege = damege;
    }


    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamege() {
        return damege;
    }

   public double attack(){
         return getDamege();
   }

}
