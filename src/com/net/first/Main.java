package com.net.first;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Main {
    public static void main(String[] args) {

        SchoolGirl mandy = new SchoolGirl("Mandy");

        Proxy daijie = new Proxy(mandy);

        daijie.giveDolls();;
        daijie.giveFlowers();;
        daijie.giveChocolate();

    }
}
