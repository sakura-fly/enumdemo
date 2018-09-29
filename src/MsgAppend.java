public interface MsgAppend {
    ResponseMsg append(String str);
    ResponseMsg append(ResponseMsg responseMsg);
}
