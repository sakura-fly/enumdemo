public class Run {
    public static void main(String[] args) {
        ResponseMsg s = ResponseMsg.SUCCESS;
        System.out.println(s);
        s.setMsg(new StringBuffer("qwe"));
        System.out.println(s);
         // System.out.println(ResponseMsg.SUCCESS.append(ResponseMsg.ERR));
         // System.out.println(ReponseCode.SUCCESS.getCode());
    }
}
