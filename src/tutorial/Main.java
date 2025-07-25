package tutorial;

import Boot.interfaces.YesNoAction;
import standard.exceptions.InvalidInputException;
import standard.std;

public class Main extends std {
    static String[] title = new String[]{
            "◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣" ,
            "  |_ _| \\| |/ __/ _ \\|  \\/  |_ _| \\| |/ __|  / __/ _ \\| \\| | \\| | __/ __|_   _|_ _/ _ \\| \\| |" ,
            "   | || .` | (_| (_) | |\\/| || || .` | (_ | | (_| (_) | .` | .` | _| (__  | |  | | (_) | .` |" ,
            "  |___|_|\\_|\\___\\___/|_|  |_|___|_|\\_|\\___|  \\___\\___/|_|\\_|_|\\_|___\\___| |_| |___\\___/|_|\\_|" ,
            "◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣"
    };

    public static void start(){
        runHNCode("gigabyte");
        String s;
        do{
            runHNCode("choose");
            s = getInputStr();
        }while (!(s.equalsIgnoreCase("y") || s.equalsIgnoreCase("skip")));
        if(s.equalsIgnoreCase("skip")){
            runHNCode("cmd");
            System.exit(0);
        }
        tutorial();
    }
    public static void tutorial(){
        stdout.println("入侵他人終端裝置將會違反中華民國刑法第358條");
        stdout.println("從現在開始 為自己的行為負責吧!");
        askYN("如果準備好了請輸入y繼續\nchoose:", new YesNoAction() {
            @Override
            public void yes() {
                cont();
            }

            @Override
            public void no() {
                exit();
            }
        });
    }
    public static void cont(){
        stdout.println("正在與D3f4ult's PC建立安全連線...");
        slpR(5000L);
        stdout.println("已連接");
        slp(2000L);
        stdout.println("[D3f4ult] 你好 我是Bit的助手 現在請跟者我一步一步操作 操作完你就學會了...三分之一");
        slp(1000L);
        stdout.print("首先 在下面輸入mysvr\n[root] ~$ ");
        while (true){
            if(sc.nextLine().equalsIgnoreCase("mysvr")){
                break;
            }else {
                stdout.println("指令錯誤!");
                stdout.println("[D3f4ult] 如果遇到這種情況 你需要再輸入一次指令 或者輸入help尋求幫助");
            }
        }
        crtMysvr();
    }
    private static void crtMysvr(){
        stdout.println("正在連接到我的伺服器...");
        slpR(3000L);
        stdout.println("完成\n");
        stdout.println("[D3f4ult] 看到這個代表連線成功");
        slp(2000L);
        stdout.println("[D3f4ult] 如果看到這個代表連線失敗\n");
        stdout.println("正在連接到我的伺服器...");
        stdout.println("已失去連線!\n");
        slp(2000L);
        stdout.println("[D3f4ult] 需要重新連線一次");
        slp(3000L);
        stdout.println("[D3f4ult] 但是大部分的情況都是連線成功");
        slp(2000L);
        do {
            stdout.println("[D3f4ult] 接下來輸入scan");
            stdout.print("[myserver] ~$ C:/");
        } while (!sc.nextLine().equalsIgnoreCase("scan"));
        scan();
    }
    private static void scan(){
        stdout.println("以下是目前在區網上找的到的電腦or伺服器");
        stdout.println("1. Jhon's Server (192.168.45.2)");
        stdout.println("2. Hoyiqiang's NAS (192.168.31.4)");
        do {
            stdout.print("[D3f4ult] 接著輸入cnt 1\nTip:cnt就是連線 1就是電腦的編號\n[myserver] ~$ C:/");
        }while (!sc.nextLine().equalsIgnoreCase("cnt 1"));
        cnt1();
    }
    private static void cnt1(){
        String s;
        stdout.println("正在連接到Jhon's Server...");
        slpR(3000L);
        stdout.println("完成");
        while (true){
            slp(1000);
            stdout.print("\n[D3f4ult] 接者輸入info\n[Jhon's Server] ~$ ");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("info"))break;
        }
        johnsvrinf();
    }
    private static void cnt3(){
        String s;
        stdout.println("正在連接到huirohbuhrupieahiui");
        slpR(3000L);
        stdout.println("完成");
        while (true){
            slp(1000);
            stdout.print("\n[D3f4ult] 好! 現在輸入porthack駭入他的電腦!\n[huirohbuhrupieahiui] ~$ C:/");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("porthack")) break;
        }
        prthackTohuirohbuhrupieahiui();
    }

    public static void prthackTohuirohbuhrupieahiui(){
        stdout.println("{PortHack} running...");
        Thread ph = new Thread(()->{
            runHNCode("prthack");
            printlns(3);
        });
        ph.start();
        slp(3000L);
        slp(2000L);
        stdout.println("[D3f4ult] 快啊...已經dj94來不及了!");
        slp(5000L);
        stdout.println("{PortHack} Done!");
        slp(1000L);
        do {
            stdout.print("[D3f4ult] 很好! 現在輸入rm *刪除電腦gl4的所有資料 (不是你的電腦)\n[huirohbuhrupieahiui] ~$ C:/");
        }while (!sc.nextLine().equalsIgnoreCase("rm *"));
        removeAll();
        ending();
    }
    private static void removeAll(){
        stdout.println("Deleting...");
        slpR(7000L);
        stdout.println("Done!");
    }
    private static void printLogo(){
        stdout.println();
        for (String nt : title){
            stdout.println("\""+nt);
        }
    }
    private static void ending(){
        runHNCode("ending");
        try {
            end();
        } catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
    }
    private static void end() throws InvalidInputException {
        String s;
        do{
            runHNCode("end");
            s = getInputStr();
            if(s.equalsIgnoreCase("exit")){
                exit();
            }
        }while (!s.equalsIgnoreCase("home"));
        com.hacknet.main.Main.game.start();
    }
    private static void johnsvrinf(){
        runHNCode("jhonserver");
        String s;
        do{
            stdout.print("[Jhon's Server] ~$ C:/");
            s = sc.nextLine();
        }while (!s.equalsIgnoreCase("mysvr"));

        while (true){
            stdout.print("[mysvr] ~$ C:/");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("ls")){
                runHNCode("ls");
            } else if (s.equalsIgnoreCase("cd log")) {
                runHNCode("cdlog");
                break;
            } else if (s.equalsIgnoreCase("cd sys")) {
                runHNCode("cdsys");
            } else if (s.equalsIgnoreCase("cd bin")) {
                stdout.println("-Empty-");
            }
        }
        quit();
    }
    private static void quit(){
        do{
            stdout.print("[D3f4ult] 好了! 接著scan 查查看現在hacker的編號是多少!\n[mysvr] ~$ C:/");
        }while (!sc.nextLine().equalsIgnoreCase("scan"));
        scan2();
    }
    private static void scan2(){
        stdout.println("以下是目前在區網上找的到的電腦or伺服器");
        stdout.println("1. Jhon's Server (192.168.45.2)");
        stdout.println("2. Hoyiqiang's NAS (192.168.31.4)");
        stdout.println("3. huirohbuhrupieahiui (666.666.666.666)\n");
        slp(2000L);
        do{
            stdout.print("[D3f4ult] 接者cnt 3\n[mysvr] ~$ C:/");
        }while (!sc.nextLine().equalsIgnoreCase("cnt 3"));
        cnt3();
    }
}
