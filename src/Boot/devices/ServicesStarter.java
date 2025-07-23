package Boot.devices;

import standard.std;

import java.util.Random;

public class ServicesStarter extends std {
    public static void start(){
        stdout.println("Services initializing...");
        slp((long) (3000L * new Random().nextFloat()));
        stdout.println("Services started.");
        slp((long) (3000L * new Random().nextFloat()));
        stdout.println("Configuring network...");
        slp(2000L);
        stdout.println("Network configuration failure.");
    }
}
