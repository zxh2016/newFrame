package cn.xwjrfw.p2p.constant;

/**
 * Created by Administrator on 2017/3/22.
 */

public interface HttpUrl {
//    String BaseUrl = "http://bjp2p.kfxfd.cn:9080/";

    String BaseUrl = "www.xwjr.com/";

    /**
     * 首页数据
     */
    String HomeData = BaseUrl + "api/v2/loans/summaryByProduct";


    /**
     * 登录
     * param:
     * loginName
     * password
     */
    String Login = BaseUrl + "wapLogin";
}
