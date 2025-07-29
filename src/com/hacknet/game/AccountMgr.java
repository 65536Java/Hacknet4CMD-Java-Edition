package com.hacknet.game;

import os.path;
import standard.FileScanner;
import standard.std;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountMgr extends std {
    private static final String accountsDir = path.join("data","accounts");
    public static String n = "";
    public static boolean login(String usr){
        File[] accs = FileScanner.scanFile(path.join("data","accounts"));
        boolean bl = false;
        if(accs != null){
            for (File f : accs){
                if(f.getName().equals(usr+".hna")){
                    bl =  true;
                }
            }
        }
        if((usr.equals("Hoyiqiang") || usr.equals("guest")) || bl){
            n = usr;
            return true;
        } else
            return false;
    }
    public static boolean registry(String un, String pw){
        File acc = new File(path.join(accountsDir,un+".hna"));
        FileWriter wtr;
        try {
            wtr = new FileWriter(acc);
            wtr.write(encSHA256(pw));
            wtr.close();
        }catch (IOException ioe){
            stderr.println(ioe);
            return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
