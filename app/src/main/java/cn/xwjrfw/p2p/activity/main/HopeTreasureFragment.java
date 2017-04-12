package cn.xwjrfw.p2p.activity.main;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.activity.fund.BuyProductActivity;
import cn.xwjrfw.p2p.activity.fund.ToMakeMoneyActivity;
import cn.xwjrfw.p2p.base.BaseFragment;
import cn.xwjrfw.p2p.base.OnSingleClickListener;
import cn.xwjrfw.p2p.constant.DefaultData;
import cn.xwjrfw.p2p.constant.IntentFlag;
import cn.xwjrfw.p2p.constant.StatusFlag;

/**
 * 希望宝
 */
public class HopeTreasureFragment extends BaseFragment {


    @Bind(R.id.title_center)
    TextView titleCenter;//标题
    @Bind(R.id.textView_rate_number)
    TextView textViewRateNumber;//7日年化利率
    @Bind(R.id.button_open_account)
    Button buttonOpenAccount;//立即开户
    @Bind(R.id.button_buy_product)
    Button buttonBuyProduct;//购买产品
    @Bind(R.id.button_earn_money)
    Button buttonEarnMoney;//立即赚钱
    @Bind(R.id.linearLayout_bottom)
    LinearLayout linearLayout_bottom;//底部text提示


    @Override
    protected View init(LayoutInflater inflater) throws Exception {
        View view = View.inflate(getActivity(), R.layout.fragment_hope_treasure, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void defaultData() {

        if (StatusFlag.isAccount)
            changeViewByStatus(DefaultData.HasAccount);
        else
            changeViewByStatus(DefaultData.NoAccount);
    }

    @Override
    protected void setListener() {
        buttonOpenAccount.setOnClickListener(new OnSingleClickListener() {
            @Override
            public void singleClick(View v) {
                StatusFlag.isAccount = true;
                changeViewByStatus(DefaultData.HasAccount);
            }
        });
        buttonBuyProduct.setOnClickListener(new OnSingleClickListener() {
            @Override
            public void singleClick(View v) {
                startActivity(new Intent(getActivity(), BuyProductActivity.class));
            }
        });
        buttonEarnMoney.setOnClickListener(new OnSingleClickListener() {
            @Override
            public void singleClick(View v) {
                startActivity(new Intent(getActivity(), ToMakeMoneyActivity.class));
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    /**
     * 已认证和未认证页面切换
     *
     * @param status 认证状态
     */
    public void changeViewByStatus(int status) {
        switch (status) {
            case DefaultData.HasAccount:
                buttonOpenAccount.setVisibility(View.GONE);
                buttonBuyProduct.setVisibility(View.VISIBLE);
                buttonEarnMoney.setVisibility(View.VISIBLE);
                linearLayout_bottom.setVisibility(View.GONE);
                break;
            case DefaultData.NoAccount:
                buttonOpenAccount.setVisibility(View.VISIBLE);
                buttonBuyProduct.setVisibility(View.GONE);
                buttonEarnMoney.setVisibility(View.GONE);
                linearLayout_bottom.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }
}
