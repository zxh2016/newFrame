package cn.xwjrfw.p2p.activity.fund;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xwjr.utilcode.customview.MyEditTextHaveDeleteButton;
import com.xwjr.utilcode.customview.MyListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseActivity;
import cn.xwjrfw.p2p.base.CommonAdapter;

public class BuyProductActivity extends BaseActivity {


    @Bind(R.id.title_back)
    RelativeLayout titleBack;//返回
    @Bind(R.id.title_center)
    TextView titleCenter;//标题
    @Bind(R.id.myListView)
    MyListView myListView;//listView
    @Bind(R.id.editText_search)
    MyEditTextHaveDeleteButton editTextSearch;//搜索查询
    @Bind(R.id.button_search)
    Button buttonSearch;//搜索按钮
    private CommonAdapter adapter;//listView Adapter
    private List<String> dataList;//listView Data

    @Override
    protected void init() {
        dataList = new ArrayList<>();
        setContentView(R.layout.activity_buy_product);
        ButterKnife.bind(this);

    }

    @Override
    protected void findView() {

    }

    @Override
    protected void defaultData() {
        titleBack.setVisibility(View.VISIBLE);
        titleCenter.setText(R.string.hint1);
        setListView();
    }


    @Override
    protected void setListener() {

    }


    @OnClick(R.id.title_back)
    public void onClick() {
        finish();
    }

    private void setListView() {

    }
}
