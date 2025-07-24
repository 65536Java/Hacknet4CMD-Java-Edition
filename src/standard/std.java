package standard;

import Boot.interfaces.YesNoAction;
import Boot.lib.player.Audio;
import os.path;
import psr.HNScriptParser;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class std {
    public static File[] usingMods = new File[]{};
    public static Scanner sc = new Scanner(System.in);
    public static final Audio ad = new Audio();
    static FileReader fr;
    static BufferedReader bf;
    private static String input;
    public final String[] devices = new String[]{
            "處理器",
            "Hotfix",
            "網路卡",
            "時區",
            "Hyper-V"
    };

    public static void runHNCode(String fnm){
        try {
            fr = new FileReader(path.join("resources", "scripts", fnm+".hn4cmd"));
            bf = new BufferedReader(fr);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        while (true){
            String nln = "";
            try {
                nln = bf.readLine();
                if(nln == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] args = HNScriptParser.getArgs(nln);
            String cmd = HNScriptParser.getCommand(nln);
            if(cmd.equals("WAITS")){
                long l = Long.parseLong(args[0]) * 1000L;
                if(l == 0L){
                    l = 135L;
                }
                slp(l);
            }else if(cmd.equals("PRINT")){
                for(String s : args){
                    stdout.print(s+" ");
                }
                stdout.println();
            }else if(cmd.equals("PLAYMUSIC")){
                ad.init(os.path.join("resources","musics",args[0]+".wav"));
                ad.lp(true);
                ad.play();
            }else if(cmd.equals("CLEARSCREEN")){
                printlns(100);
            }else if(cmd.equals("INPUT")){
                for(String s : args){
                    stdout.print(s+" ");
                }
                input = sc.nextLine();
            }
        }
    }

    public static String getInputStr(){
        return input;
    }
    public static final PrintStream stdout = System.out;
    public static final FileWriter fw;
    public static final PrintWriter stderr;
    static {
        try {
            fw = new FileWriter("log.txt");
            stderr = new PrintWriter(fw);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
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
