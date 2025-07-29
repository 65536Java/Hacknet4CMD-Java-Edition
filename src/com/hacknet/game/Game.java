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
    public Game(String title){
        this.title = title;
    }

    public void start() throws NumberFormatException,InvalidInputException{
        while (true){
            runHNCode("Mainmenu");
            int i = Integer.parseInt(getInputStr());
            if(i == 4)
                exit();
            else if(i == 2)chooseMod();
            else if (i == 1) break;
            else if (i == 3) runHNCode("settings");
            else if (i == 669) Main.start();
            else throw new InvalidInputException();
        }
        while (true){
            runHNCode("logonUI");
            int i = Integer.parseInt(getInputStr());
            if(i == 2) reg();
            else if(i == 3)Main.start();
            else if (i == 1) break;
            else throw new InvalidInputException();
        }
        login();
    }
    public static void chooseMod(){
        File[] fs = FileScanner.scanFile("mods");
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
        runHNCode("boot");
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
                String ipw = getInputStr();
                String corpw = bf.readLine();
                if(corpw.equals(encSHA256(ipw))){
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
                if(getInputStr().equalsIgnoreCase("y"))reg();
                else if(!(getInputStr().equals("n"))) try {throw new InvalidInputException();}
                catch (InvalidInputException e) {
                    throw new RuntimeException(e);
                }
            }
        }while (!bl);
        boot();
    }
    public static boolean reg(){
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
        return bl1;
    }
}
