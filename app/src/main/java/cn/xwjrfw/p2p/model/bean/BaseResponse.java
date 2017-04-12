package cn.xwjrfw.p2p.model.bean;

/**
 * Created by Administrator on 2017/3/17.
 */

public class BaseResponse {

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }

    /**
     * status : 200
     * msg : 请求成功
     */

    private int status;
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
