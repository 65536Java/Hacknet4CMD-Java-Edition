package psr;

import standard.std;

public class ArgParser extends std {
    public static String[] parse(String s){
        return s.split(" ");
    }
}
