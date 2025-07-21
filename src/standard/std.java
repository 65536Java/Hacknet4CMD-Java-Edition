package standard;

import Boot.interfaces.YesNoAction;
import Boot.lib.player.Audio;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class std {
    public static final Audio ad = new Audio();
    public final String[] devices = new String[]{
            "處理器",
            "Hotfix",
            "網路卡",
            "Hyper-V"
    };
    public static final PrintStream stdout = System.out;
    public static void slp(long mil){
        try {
            Thread.sleep(mil);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void slpR(long mil){
        slp((long) (mil * new Random().nextFloat()));
    }
    public void execCMD(String command){
        try {
            new ProcessBuilder(command).start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void printlns(int c){
        for (int i = 0; i < c; i++) {
            System.out.println();
        }
    }
    public static void exit(){
        askYN("你確定要退出Hacknet嗎?(y,n)", new YesNoAction() {
            @Override
            public void yes() {
                System.exit(0);
            }

            @Override
            public void no() {

            }
        });
    }
    public static void askYN(String yc, YesNoAction action){
        stdout.print(yc);
        Scanner sc = new Scanner(System.in);
        String res = sc.next();
        char resh = res.toLowerCase().toCharArray()[0];
        if(resh == 'y'){
            action.yes();
        }else if (resh == 'n') action.no(); else askYN(yc, action);
    }

}
