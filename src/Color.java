public enum  Color {
    RED("#ff0000"), GREEN("#00ff00"), BLUE("#0000ff");

    private  final String b ;

    Color(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return b;
    }
}
