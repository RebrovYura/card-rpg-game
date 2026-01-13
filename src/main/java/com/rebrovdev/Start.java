package com.rebrovdev;

import net.cardgame.heroes.HeroEntity;
import net.cardgame.heroes.HeroType;
import net.cardgame.heroes.Knight;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Knight player1 = new Knight("player");
        System.out.println(player1.getAbilityName());
        System.out.println(player1.getStats().toString());
        player1.getHurt(2);
        player1.getHurt(2);
        player1.getHurt(1);
        player1.getHurt(1);

//        Scanner sc = new Scanner(System.in);

        System.out.println(player1.getStats());
    }
}