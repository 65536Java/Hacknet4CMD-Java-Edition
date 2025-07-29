package standard;

import java.io.File;

public class FileScanner extends std{
    public static File[] scanFile(String dir){
        String folderPath = dir;
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            return files;
        } else {
            return null;
        }
    }
}
