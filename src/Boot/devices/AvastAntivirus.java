package Boot.devices;

import standard.std;

public class AvastAntivirus extends std {
    public static void scan(){
        stdout.println("[Avast] Running antivirus scan...");
        slpR(1000L);
        stdout.println("[Avast] Scanning for viruses...");
        slpR(6000L);
        stdout.println("[Avast] No viruses found.");
        slpR(1000L);
    }
}
