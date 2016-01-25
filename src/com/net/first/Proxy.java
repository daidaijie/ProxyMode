package com.net.first;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Proxy implements GiveGift {

    Pursult gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursult(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
