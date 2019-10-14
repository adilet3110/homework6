package com.company;

public class Warrior extends Player implements AplySuperAbility {
    private String warriorAttack;


    public String gesSuperAttack() {
        return warriorAttack;
    }

    public void getSuperAttack(String superAttack) {
        this.warriorAttack = superAttack;
    }
    @Override
    public void ability(){
        System.out.println("Warrior Attack");
    }
}
