package tutorial;

import Boot.interfaces.YesNoAction;
import standard.std;

import java.util.Scanner;

public class Main extends std {
    static String[] title = new String[]{
            "◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥" ,
            "  |_ _| \\| |/ __/ _ \\|  \\/  |_ _| \\| |/ __|  / __/ _ \\| \\| | \\| | __/ __|_   _|_ _/ _ \\| \\| |" ,
            "   | || .` | (_| (_) | |\\/| || || .` | (_ | | (_| (_) | .` | .` | _| (__  | |  | | (_) | .` |" ,
            "  |___|_|\\_|\\___\\___/|_|  |_|___|_|\\_|\\___|  \\___\\___/|_|\\_|_|\\_|___\\___| |_| |___\\___/|_|\\_|" ,
            "◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥◣◥"
    };
    static String[] passwords = new String[]{
            "porsche firebird\tprince\trosebud",
            "password\tguitar\tbutter\tbeach\tjaguar",
            "12345678\tchelsea\tunited\tstarcraft\tgreat",
            "1234\tblack\tturtle\t7777777\tcool",
            "pussycat\tdiamond\tsteelers\tmuffin\tcooper",
            "12345\tnascar\ttiffany\tredsox\t1313",
            "dragon\tjackson\tzxcvbn\tstar\tscorpio",
            "qwerty\tcameron\ttomcat\ttesting\tmountain",
            "696969\t654321\tgolf\tshannon\tmadison",
            "mustang\tcomputer\tbond007\tmurphy\t987654",
            "letmein\tamanda\tbear\tfrank\tbrazil",
            "baseball\twizard\ttiger\thannah\tlauren",
            "master\tIwasphone\tdoctor\tdave\tjapan",
            "michael\tmoney\tgateway\teagle1\tknickers",
            "football\tphoenix\tgators\t11111\tsquirtle",
            "shadow\tmickey\tangel\tmother\tstars",
            "monkey\tbailey\tjunior\tnathan\tapple",
            "abc123\tknight\tthx1138\traiders\talexis",
            "pass\ticeman\tporno\tsteve\taaaa",
            "bucket\ttigers\tbadboy\tforever\tbonnie",
            "6969\tpurple\tdebbie\tangela\tpeaches",
            "jordan\tandrea\tspider\tviper\tjasmine",
            "harley\talicorn\tmelissa\tou812\tkevin",
            "ranger\tdakota\tbooger\tjake\tmatt",
            "iwantu\taaaaaa\t1212\tlovers\tqwertyui",
            "jennifer\tplayer\tflyers\tsuckit\tdanielle",
            "hunter\tsunshine\tfish\tgregory\tbaman",
            "ponies\tmorgan\tilovecorm\tbuddy\t4321",
            "2000\tstarwars\tmatrix\twhatever\t4128",
            "test\tboomer\tpiderman\tyoung\trunner",
            "batman\tcowboys\tscooby\tnicholas\tswimming",
            "trustno1\tedward\tjason\tlucky\tdolphin",
            "thomas\tcharles\twalter\thelpme\tgordon",
            "tigger\tgirls\tbimp\tjackie\tcasper",
            "robert\tbooboo\tboston\tmonica\tstupid",
            "access\tcoffee\tbraves\tmidnight\tiloveboats",
            "love\txxxxxx\tyankee\tcollege\tsaturn",
            "buster\tbulldog\tlover\tboby\tgemini",
            "1234567\tncc1701\tbarney\tbort\tapples",
            "soccer\trabbit\tvictor\tbrian\taugust",
            "hockey\tpeanut\ttucker\tmark\t3333",
            "killer\tjohn\tprincess\tstartrek\tcanada",
            "george\tjohnny\tmercedes\tsierra\tblazer",
            "sexy\tgandalf\t5150\tleather\tearlgamer",
            "andrew\tboop\tdoggie\t232323\thunting",
            "charlie\twinter\tzzzzzz\t4444\tkitty",
            "superman\tbrandy\tgunner\tbeavis\trainbow"
    };
    static Scanner sc = new Scanner(System.in);
    public static void start(){
        slp(2000L);
        stdout.println("-----正在初始化FailSafe模式-----");
        stdout.println();
        slp(3000L);
        stdout.println("這件事不對勁...比我想像中的還要複雜...");
        slp(3000L);
        stdout.println("對了 忘了自我介紹 我的名子叫GigaByte 當你看到這則訊息時 代表我已經死了...");
        stdout.println();
        slp(3000L);
        stdout.println("...");
        slp(3000L);
        ad.init("tutorial1.wav");
        ad.lp(true);
        ad.play();
        slp(1000L);
        stdout.println("\ntutorial mode\n");
        stdout.println("你現在處於危險之中!");
        stdout.println("請用最快的速度完成教學!");
        stdout.println("如果準備好了請輸入y 要跳過教學請輸入skip\n\n");
        String s;
        do{
            stdout.print("choose: ");
            s = sc.nextLine();
        }while (!(s.equalsIgnoreCase("y") || s.equalsIgnoreCase("skip")));
        tutorial();
    }
    private static void tutorial(){
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
    private static void cont(){
        while (true){
            stdout.println("正在與D3f4ult's PC建立安全連線...");
            slpR(5000L);
            stdout.println("已連接");
            slp(2000L);
            stdout.println("[D3f4ult] 你好 我是Bit的助手 現在請跟者我一步一步操作 操作完你就學會了...三分之一");
            slp(1000L);
            stdout.print("首先 在下面輸入mysvr\n[root] ~$ ");
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
            if(s.equalsIgnoreCase("porthack"))break;
        }
        prthackTohuirohbuhrupieahiui();
    }
    private static void prthackTohuirohbuhrupieahiui(){
        stdout.println("{PortHack} running...");
        Thread ph = new Thread(()->{
            for(String pw : passwords){
                stdout.println(pw);
                slp(100L);
            }
            printlns(3);
            stdout.println("Password found!");
        });
        ph.start();
        slp(3000L);
        slp(2000L);
        stdout.println("[D3f4ult] 快啊...已經dj94來不及了!");
        slpR(6000L);
        do {
            stdout.print("[D3f4ult] 很好! 現在輸入rm *刪除電腦gl4的所有資料 (不是你的電腦)\n[huirohbuhrupieahiui] ~$ C:/");
        }while (!sc.nextLine().equalsIgnoreCase("rm *"));
        removeAll();
        ending();
    }
    private static void removeAll(){
        stdout.println("deleteing...");
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
        stdout.println("[D3f4ult] 非常好 終於完成了!");
        slp(2000L);
        stdout.println("[hacker]: 可惡...你的njo6ru 應變能力怎麼dk3u3這麼強???");
        slp(2000L);
        stdout.println("[D3f4ult] 哈哈哈 現在你變成亂碼了!");
        slp(2000L);
        printLogo();
        stdout.println("[未知的連線]: 全部都給我閉嘴");
        slp(2000L);
        stdout.println("[D3f4ult] 你是誰???");
        slp(2000L);
        stdout.println("[未知的連線]: 我是這個遊戲的創造者:阿強");
        slp(2000L);
        stdout.println("[D3f4ult] 不是啊 你混進來幹嘛???");
        slp(2000L);
        stdout.println("[未知的連線]: 我要告訴你們兩個 我在你們的電腦裡放了兩個forkbomb");
        slp(2000L);
        stdout.println("[D3f4ult] what?????");
        slp(2000L);
        stdout.println("[未知的連線]: 過了5秒後 這個forkbomb就會爆炸 你電腦上的所有資料都會不見");
        slp(2000L);
        stdout.println("[D3f4ult] 你為什麼要這樣做???");
        slp(2000L);
        stdout.println("[未知的連線]: 因為我想不到劇情的結尾了 ._.");
        slp(1000L);
        stdout.println("[D3f4ult] 唉呦我*!!!!!!!!!!");
        slp(1000L);
        stdout.println("[hacker]: what the f***");
        slp(1000L);
        stdout.println("(程序已被強制停止)");
        slp(1000L);
        stdout.println("[hacker]: (已中斷連線)");
        slp(1000L);
        stdout.println("[未知的連線]: 就這樣! 上傳!");
        slp(2000L);
        printlns(60);
        ad.init("DreamHead.wav");
        ad.lp(true);
        ad.play();
        stdout.println("Demo (兼具教學) 就到這裡結束了 後面我會繼續發更新");
        stdout.println("感謝各位遊玩試玩版!");
        stdout.println();
        end();
    }
    private static void end(){
        do{
            System.out.print("回到主選單(home) 離開(exit) :");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("exit")){
                exit();
            }
        }while (!sc.nextLine().equalsIgnoreCase("home"));
        com.hacknet.main.Main.main(new String[]{});
    }
    private static void johnsvrinf(){
        slp(1000L);
        stdout.println("\nServer info:\n");
        stdout.println("Server IP Address:192.168.45.2");
        slpR(5000L);
        stdout.println("Server files:(Unknown)");
        slpR(3000L);
        stdout.println("Latency:103ms");
        slpR(3500L);
        ad.init("tutorial2.wav");
        ad.play();
        ad.lp(true);
        printLogo();
        stdout.println("\n[D3f4ult] 好吧...看來這個伺服器的基本資料不讓我們看 我們只好強制fu,4fm3y xul4x了...");
        slp(3000L);
        stdout.println("[D3f4ult] what??? yp3ak7回事??? 我的文y4怎麼1u04t/6亂碼了???");
        slp(2000L);
        stdout.println("[hacker]: 哈哈哈!!! 你的電腦已經被我掌控了!!!");
        slp(2000L);
        stdout.println("[D3f4ult] 怎麼...huiogrbeijpa 回事...");
        slp(3000L);
        stdout.println("[hacker]: 跟你自我介紹一下 我叫大明 我是熱愛電腦的玩家 也喜歡玩電腦 而現在的情況就是我搞的 哈哈哈哈!!!");
        slp(2000L);
        stdout.println("[D3f4ult] 你為gp6ak7...要這u;4做???");
        slp(2000L);
        stdout.println("[hacker]: 因為我想考驗你的隨機應變能力啊awa");
        slp(3000L);
        stdout.println("[D3f4ult] 既然5k4u;4...那就ao6辦法了... 快! 用別的方法解決這次的危機!");
        stdout.println("(回到你的電腦 檢查log資料夾 看看他的連線蹤跡 Tip:先回到mysvr)");
        String s;
        do{
            stdout.print("[Jhon's Server] ~$ C:/");
            s = sc.nextLine();
        }while (s.equalsIgnoreCase("mysvr"));

        while (true){
            stdout.print("[mysvr] ~$ C:/");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("ls")){
                printDirs();
            } else if (s.equalsIgnoreCase("cd log")) {
                log();
                break;
            } else if (s.equalsIgnoreCase("cd sys")) {
                sys();
            } else if (s.equalsIgnoreCase("cd bin")) {
                stdout.println("-Empty-");
            }
        }
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
    private static void sys(){
       stdout.println("x-server.sys");
       stdout.println("os-config.sys");
       stdout.println("bootcfg.dll");
       stdout.println("netcfgx.dll");
    }
    private static void printDirs(){
        stdout.println("home");
        stdout.println("log");
        stdout.println("bin");
        stdout.println("sys");
    }
    private static void log(){
       stdout.println("[hacker] shell bypassed");
       stdout.println("[hacker] firewall solved");
       stdout.println("[hacker] OPEN PORT:22");
       stdout.println("[hacker] OPEN PORT:25");
       stdout.println("[hacker] OPEN PORT:21");
       stdout.println("[hacker] OPEN PORT:80");
       quit();
    }
}
