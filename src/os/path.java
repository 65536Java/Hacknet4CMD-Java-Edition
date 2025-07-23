package os;

import standard.std;

public class path extends std {
    public static String join(String ... paths){
        String separator = System.getProperties().getProperty("file.separator");
        StringBuffer sb = new StringBuffer();
        for(String s : paths){
            sb.append(s);
            sb.append(separator);
        }
        return sb.toString();
    }
}
