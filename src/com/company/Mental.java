package com.company;

public class Mental extends Player implements AplySuperAbility {
    private String mentalAttack;



    public String getMentalAttack() {
        return mentalAttack;
    }

    public void setMentalAttack(String mentalAttack) {
        this.mentalAttack = mentalAttack;
    }
    @Override
    public void ability(){
        System.out.println("Mental Attack");
    }
}
