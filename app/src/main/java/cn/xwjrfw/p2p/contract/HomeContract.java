package cn.xwjrfw.p2p.contract;

import cn.xwjrfw.p2p.base.BasePresenter;
import cn.xwjrfw.p2p.base.BaseView;
import cn.xwjrfw.p2p.model.bean.HomeFragmentBean;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface HomeContract {

    interface Presenter extends BasePresenter {
        void getHomeData();
    }

    interface View extends BaseView<Presenter> {
        void getHomeDataSuccess(HomeFragmentBean homeFragmentBean);
    }
}
