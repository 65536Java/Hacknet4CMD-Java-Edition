package com.hacknet.game;

import Boot.devices.*;
import standard.FileScanner;
import standard.exceptions.InvalidInputException;
import standard.std;
import tutorial.Main;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Game extends std {
    String title;
    SystemInf inf = new SystemInf();
    int a = 0;
    String[] bigTitle = new String[]{
            "██╗  ██╗  █████╗   █████╗  ██╗  ██╗ ███╗  ██╗ ███████╗ ████████╗",
            "██║  ██║ ██╔══██╗ ██╔══██╗ ██║ ██╔╝ ████╗ ██║ ██╔════╝ ╚══██╔══╝",
            "███████║ ███████║ ██║  ╚═╝ █████═╝  ██╔██╗██║ █████╗      ██║   ",
            "██╔══██║ ██╔══██║ ██║  ██╗ ██╔═██╗  ██║╚████║ ██╔══╝      ██║   ",
            "██║  ██║ ██║  ██║ ╚█████╔╝ ██║ ╚██╗ ██║ ╚███║ ███████╗    ██║   ",
            "╚═╝  ╚═╝ ╚═╝  ╚═╝  ╚════╝  ╚═╝  ╚═╝ ╚═╝  ╚══╝ ╚══════╝    ╚═╝   ",
            "                     Java Edition                               "
    };
    char[] circle = new char[]{
            '-',
            '/',
            '|',
            '\\'
    };
    public Game(String title){
        this.title = title;
    }

    public void start() throws NumberFormatException,InvalidInputException{
        Scanner sc = new Scanner(System.in);
        ad.init(os.path.join("resources","musics","AmbientDroneClipped.wav"));
        ad.lp(true);
        ad.play();
        while (true){
            for(String tn : bigTitle){
                stdout.println(tn);
            }
            printlns(7);
            stdout.println("                       1) 主頁面");
            stdout.println("                       2) 離開Hacknet");
            stdout.println("                       3) 選擇模組");
            printlns(9);
            stdout.print("choose: ");
            int i = Integer.parseInt(sc.next());
            if(i == 2)
                exit();
            else if(i == 3)chooseMod();
            else if (i == 1) break;
            else if (i == 669) Main.prthackTohuirohbuhrupieahiui();
            else throw new InvalidInputException();
        }
        login();
    }
    public static void chooseMod(){
        /*File[] fs = FileScanner.scan();
        int i = 1;
        if (fs != null) {
            for(File f : fs){
                stdout.println(i + f.getName());
                i++;
            }
            stdout.print("Choose(Enter Number): ");
            String s = sc.nextLine();
            int index = Integer.parseInt(s) - 1;
            usingMods[index] = fs[index];
        }else{
            stdout.println("An error has excepted.");
        }*/
        stdout.println("Coming soon!");
    }
    private void boot() {
        Random r = new Random();
        r.setSeed(Runtime.getRuntime().freeMemory() / Runtime.getRuntime().availableProcessors());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= 100; i++) {
            sb.append("=");
            stdout.print("Progress:["+ sb +"] "+i+"%\r");
            slpR(500L);
            a++;
        }
        stdout.println("Loading BIOS...");
        slp((long) (1000L * Math.random()));
        stdout.println("Getting system information...");
        inf.getInf();
        inf.printInf();
        CPU.check();
        Disk.check();
        OS.load();
        ServicesStarter.start();
        AvastAntivirus.scan();
        printlns(2);
        stdout.println("Booting complete.");
        slpR(3000L);
        Nbornnb.checkIsNoob();
    }
    private boolean cpw(){
        stdout.println("Sorry. You can't use admin mode.");
        return false;
    }
    private void login(){
        Scanner sc = new Scanner(System.in);
        boolean bl;
        do{
            stdout.print("請輸入使用者名稱 如果沒有帳戶請輸入guest(分大小寫):");
            bl = Logon.login(sc.next());
            if(bl && Logon.n.equals("Hoyiqiang")){
                cpw();
            }
        }while (!bl);
        if(Logon.n.equals("guest")){
            boot();
        }
    }
}
