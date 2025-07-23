package com.hacknet.game;

import Boot.interfaces.YesNoAction;
import standard.std;
import tutorial.Main;

import java.util.Scanner;

public class Nbornnb extends std {
    public static void checkIsNoob(){
        stdout.println("歡迎到Hacknet! 如果你是第一次玩這個遊戲請輸入y 不是請輸入n");
        Scanner sc = new Scanner(System.in);
        askYN("Type: ", new YesNoAction() {
            @Override
            public void yes() {
                Main.start();
            }

            @Override
            public void no() {
                stdout.println("==================================");
                stdout.println("\ncmd介面尚未開發完成 敬請期待");
                stdout.println("\n==================================");
                sc.next();
            }
        });
    }
}
