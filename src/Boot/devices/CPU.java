package Boot.devices;

import standard.std;

public class CPU extends std {
    public static void check(){
        stdout.println("Checking CPU...");
        stdout.println("CPU diagnostics running...");
        slpR(1000L);
        stdout.println("Cores: "+getCores());
    }
    public static int getCores(){
        return Runtime.getRuntime().availableProcessors();
    }
}
