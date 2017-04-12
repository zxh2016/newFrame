package cn.xwjrfw.p2p.activity.main;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.xwjr.utilcode.customview.PullToRefreshView.SwipyRefreshLayout;
import com.xwjr.utilcode.utils.LogUtils;

import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseFragment;
import cn.xwjrfw.p2p.contract.HomeContract;
import cn.xwjrfw.p2p.model.bean.HomeFragmentBean;
import cn.xwjrfw.p2p.presenter.HomePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment implements HomeContract.View {
    private HomePresenter presenter;
    private EditText editText;
    private SwipyRefreshLayout swipyRefreshLayout;

    private boolean isDataLoad;
    private HomeFragmentBean homeFragmentBean;


    @Override
    protected View init(LayoutInflater inflater) throws Exception {
        presenter = new HomePresenter(this);
        return View.inflate(getActivity(), R.layout.fragment_home, null);
    }

    @Override
    protected void findView() {
        swipyRefreshLayout = (SwipyRefreshLayout) view.findViewById(R.id.swipyRefreshLayout);
    }

    @Override
    protected void defaultData() {
        if (isDataLoad) {

        } else {

        }
    }

    @Override
    protected void setListener() {
        swipyRefreshLayout.setOnRefreshListener(new SwipyRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(int index) {
                LogUtils.i("刷新");
                swipyRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onLoad(int index) {
                LogUtils.i("加载");
                swipyRefreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void getHomeDataSuccess(HomeFragmentBean homeFragmentBean) {

    }
}
