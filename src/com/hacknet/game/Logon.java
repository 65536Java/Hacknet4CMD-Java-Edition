package com.hacknet.game;

public class Logon {
    public static String n = "";
    public static boolean login(String usr){
        if(usr.equals("Hoyiqiang") || usr.equals("Null") || usr.equals("guest")){
            n = usr;
            return true;
        } else
            return false;
    }
}
