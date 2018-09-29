public enum Host {

    GENRAL("https://","he.bobdz.com",80,""),
    GETK(GENRAL.XY,GENRAL.HOST,GENRAL.PORT,"gek");

    private final String XY;
    private final String HOST;
    private final int PORT;
    private final String URI;

    Host(String XY, String HOST, int PORT, String URI) {
        this.XY = XY;
        this.HOST = HOST;
        this.URI = URI;
        this.PORT = PORT;
    }


    @Override
    public String toString() {
        return XY + HOST + PORT + URI;
    }
}
