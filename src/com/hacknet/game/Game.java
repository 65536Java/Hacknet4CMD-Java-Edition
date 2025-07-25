package com.hacknet.game;

import Boot.devices.*;
import os.path;
import standard.FileScanner;
import standard.exceptions.InvalidInputException;
import standard.std;
import tutorial.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
            else if (i == 669) Main.start();
            else throw new InvalidInputException();
        }
        login();
    }
    public static void chooseMod(){
        File[] fs = FileScanner.scan("mods");
        int i = 1;
        if (fs != null) {
            for(File f : fs){
                stdout.println(i + f.getName());
                i++;
            }
            stdout.print("Choose(Enter Number): ");
            String s = sc.nextLine();
            int index = Integer.parseInt(s) - 1;
            usingMods.add(fs[index]);
        }else{
            stdout.println("An error has excepted.");
        }
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
        stdout.println();
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
    private boolean cpw(String string){
        runHNCode("checkPW");
        if(string.equals("Hoyiqiang")){
            if(getInputStr().equals("hoyiqiang1006"))
                stdout.println("Admin mode is not supported.");
            else {
                stdout.println("Wrong password!");
                return false;
            }
        } else {
            try {
                fr = new FileReader(path.join("data", "accounts", string+".hna"));
                bf = new BufferedReader(fr);
                String corpw = strED(bf.readLine());
                if(corpw.equals(getInputStr())){
                    stdout.println("登入成功!");
                    return true;
                }else {
                    stdout.println("Wrong password!");
                    return false;
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                stdout.println("Unknown User name!");
            }
        }
        return false;
    }
    private void login(){
        Scanner sc = new Scanner(System.in);
        boolean bl;
        do{
            stdout.print("請輸入使用者名稱 如果沒有帳戶請輸入guest(分大小寫):");
            bl = AccountMgr.login(sc.next());
            if(bl){
                if(!AccountMgr.n.equals("guest")){
                    bl = cpw(AccountMgr.n);
                    if(bl){
                        break;
                    }
                }
            }else {
                stdout.println("不存在的帳號名稱,請問是否要註冊新的本地帳號?(y/n)");
                runHNCode("choose");
                if(getInputStr().equalsIgnoreCase("y")){
                    runHNCode("accountRegistration");
                    String usrn = getInputStr();
                    runHNCode("accountRegistrationPW");
                    String usrp = getInputStr();
                    boolean bl1 = AccountMgr.registry(usrn,usrp);
                    if(bl1){
                        stdout.println("本地帳號註冊成功!");
                    } else {
                        stdout.println("本地帳號註冊失敗!");
                    }
                }else if (getInputStr().equalsIgnoreCase("n")){
                }else {
                    try {
                        throw new InvalidInputException();
                    } catch (InvalidInputException e) {
                        stdout.println("Invalid Input.");
                    }
                }
            }
            printlns(100);
        }while (!bl);
        boot();
    }
}
