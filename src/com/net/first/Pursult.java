package com.net.first;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Pursult implements GiveGift {

    SchoolGirl mm;

    public Pursult(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");

    }
}
