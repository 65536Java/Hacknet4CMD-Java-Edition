package Boot.devices;

import standard.std;



public class OS extends std {
    public static void load(){
        stdout.println("Loading operating system...");
        slpR(3000L);
        stdout.println("Operating system loaded successfully.");
        slpR(1000L);
    }
}
