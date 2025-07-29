package standard;

import Boot.interfaces.YesNoAction;
import Boot.lib.player.Audio;
import os.path;
import psr.HNScriptParser;
import standard.exceptions.InvalidArgumentException;

import java.io.*;

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

import java.security.MessageDigest;


public class std {
    public static ArrayList<File> usingMods = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static final Audio ad = new Audio();
    public static FileReader fr;
    public static HashMap<String,Object> vars = new HashMap<>();
    public static final PrintStream stdout = System.out;
    public static final FileWriter fw;
    public static final PrintWriter stderr;
    public static BufferedReader bf;
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
            }else if(cmd.equals("PLAYAUDIO")){
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
            } else if (cmd.equals("PAUSE")) {
                sc.nextLine();
            } else if (cmd.equals("CALL")) {
                runHNCode(args[0]);
                return;
            }else if(cmd.equals("GOTO")){
                try {
                    fr.close();
                    bf.close();
                    try {
                        fr = new FileReader(path.join("resources", "scripts", fnm+".hn4cmd"));
                        bf = new BufferedReader(fr);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    while (true){
                        String rs = bf.readLine();
                        if(rs == null){
                            throw new InvalidArgumentException();
                        }
                        if (rs != null && rs.equals("LABEL " + args[0])) {
                            break;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException aioobe){
                    stdout.println("GOTO後面必須有至少一個參數");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(cmd.equals("ANN")){
            }else if(cmd.equals("CRT")){
                if(args[0].equals("VAR")){
                    vars.put(args[1], args[2]);
                }
            }else if(cmd.equals("SET")){
                if(args[0].equals("VAR")){
                    vars.replace(args[1], args[2]);
                }
            }else if(cmd.equals("PRINTW")){
                for(String s : args){
                    print(s+" ");
                }
                stdout.println();
            }else if(cmd.equals("STOPALLAUDIO")){
                ad.stop();
            }
            /*else if(cmd.equals("IF")){
                Object obj = vars.get(args[0]);
                if(args[1].equals("==")){
                    if(args[2] == obj){
                        if(args[3].equals("CALL")){
                            runHNCode(args[4]);
                            return;
                        }
                        run(fnm,args[4]);
                    }
                }
                if(args[1].equals(">=")){
                    if(Integer.parseInt(args[2]) >= Integer.parseInt(obj.toString())){
                        if(args[3].equals("CALL")){
                            runHNCode(args[4]);
                            return;
                        }
                        run(fnm,args[4]);
                    }
                }
                if(args[1].equals("<=")){
                    if(Integer.parseInt(args[2]) <= Integer.parseInt(obj.toString())){
                        if(args[3].equals("CALL")){
                            runHNCode(args[4]);
                            return;
                        }
                        run(fnm,args[4]);
                    }
                }
            }*/
        }
    }
    public static void print(String s){
        char[] cs = s.toCharArray();
        for(char c : cs){
            stdout.print(c);
            slp(100);
        }
    }
    public static void run(String fnm,String lab){
        try {
            fr.close();
            bf.close();
            try {
                fr = new FileReader(path.join("resources", "scripts", fnm+".hn4cmd"));
                bf = new BufferedReader(fr);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            while (true){
                String rs = bf.readLine();
                if(rs == null){
                    throw new InvalidArgumentException();
                }
                if (rs != null && rs.equals("LABEL " + lab)) {
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException aioobe){
            stdout.println("GOTO後面必須有至少一個參數");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String encSHA256(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes());
        byte[] result = messageDigest.digest();

        StringBuilder hexString = new StringBuilder();
        for (byte b : result) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString().toLowerCase();
    }

    public static String getInputStr(){
        return input;
    }
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
        askYN("Are you sure to exit Hacknet?(y,n)", new YesNoAction() {
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
