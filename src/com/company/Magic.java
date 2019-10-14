package com.company;

public class Magic extends Player implements AplySuperAbility {
    private String magicAttack;

    public String getMagicAttack() {
        return magicAttack;
    }

    public void getMagicAttack(String magicAttack) {
        this.magicAttack = magicAttack;
    }
    @Override
    public void ability(){
        System.out.println("Magic Attack");

    }
}
