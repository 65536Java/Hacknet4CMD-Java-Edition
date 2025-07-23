package psr;

import standard.std;

import java.util.Arrays;

public class HNScriptParser extends std {
    public static String getCommand(String s){
        return ArgParser.parse(s)[0];
    }
    public static String[] getArgs(String s){
        String[] oa = ArgParser.parse(s);
        String[] sa = new String[oa.length - 1];
        try{
            for (int i = 1; i < oa.length; i++) {
                sa[i-1] = oa[i];
            }
        }catch (IndexOutOfBoundsException ioobe){

        }
        return sa;
    }
}
