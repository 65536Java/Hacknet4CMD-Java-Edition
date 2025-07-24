package standard;

public enum Missions {

    PRTHACK(19850);

    int id;
    Missions(int i) {
        id = i;
    }
    public int getID(){
        return id;
    }
}
