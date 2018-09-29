public enum  ReponseCode {

    SUCCESS(1),
    ERR(-1);





    private final int code;

    ReponseCode(int code) {
        this.code = code;
    }



    public int getCode(){
        return code;
    }

}
