public enum ResponseMsg implements MsgAppend{

    SUCCESS("成功"){
        @Override
        public ResponseMsg append(String str) {
            return super.append(str);
        }
    },
    ERR("异常");


    private StringBuffer msg;

    ResponseMsg(String msg) {
        this.msg = new StringBuffer(msg);
    }

    public void setMsg(StringBuffer msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg.toString();
    }


    @Override
    public ResponseMsg append(String str) {
        msg.append(str);
        return this;
    }
    @Override
    public ResponseMsg append(ResponseMsg responseMsg) {
        msg.append(responseMsg.toString());
        return this;
    }

}
