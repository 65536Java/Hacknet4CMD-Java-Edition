package Boot.devices;

import standard.std;

import java.util.Properties;
import java.util.Random;

public class SystemInf extends std {
    public void printInf(){
        Properties properties = System.getProperties();
        stdout.println("作業系統名稱: " + properties.getProperty("os.name"));
        stdout.println("作業系統版本: " + properties.getProperty("os.version"));
        stdout.println("作業系統架構: " + properties.getProperty("os.arch"));
        stdout.println("Java 版本: " + properties.getProperty("java.version"));
        stdout.println("Java 供應商: " + properties.getProperty("java.vendor"));
        stdout.println("BIOS loaded successfully.");
        slpR(2000L);
    }
    public void getInf(){
        Random r = new Random();
        r.setSeed(Runtime.getRuntime().freeMemory() / Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 5; i++) {
            for (String ndev : devices){
                stdout.print("載入"+ndev+"資訊...\r");
                slpR(1000L);
            }
        }
    }
}
