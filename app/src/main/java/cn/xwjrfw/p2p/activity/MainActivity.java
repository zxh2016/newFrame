package cn.xwjrfw.p2p.activity;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.xwjr.utilcode.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseActivity;
import cn.xwjrfw.p2p.activity.main.AssetsFragment;
import cn.xwjrfw.p2p.activity.main.HomeFragment;
import cn.xwjrfw.p2p.activity.main.ChoiceFragment;
import cn.xwjrfw.p2p.activity.main.HopeTreasureFragment;

import static com.ashokvarma.bottomnavigation.BottomNavigationBar.MODE_FIXED;

public class MainActivity extends BaseActivity {

    private BottomNavigationBar bottomNavigationBar;
    private List<Fragment> fragmentList;
    private FragmentManager fragmentManager;

    @Override
    protected void init() {
        fragmentList = new ArrayList<>();
        fragmentManager = getSupportFragmentManager();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void findView() {
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
    }

    @Override
    protected void defaultData() {
        setFragmentList();
        setBottomNavigationBar();
        fragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.fragment_enter_alpha, R.anim.fragment_exit_alpha)
                .replace(R.id.frame_layout, fragmentList.get(0))
                .commit();
    }


    @Override
    protected void setListener() {
        /**设置底部导航栏监听*/
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int i) {
                LogUtils.i("onTabSelected" + i);
                fragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.fragment_enter_alpha, R.anim.fragment_exit_alpha)
                        .replace(R.id.frame_layout, fragmentList.get(i))
                        .commit();
            }

            @Override
            public void onTabUnselected(int i) {
                LogUtils.i("onTabUnselected" + i);

            }

            @Override
            public void onTabReselected(int i) {
                LogUtils.i("onTabReselected" + i);
//                WXHelp.loginByWX(MainActivity.this);
            }
        });
    }
    /**
     * 设置底部导航栏样式
     */
    @SuppressWarnings("deprecation")
    private void setBottomNavigationBar() {
        bottomNavigationBar
                .setMode(MODE_FIXED)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                .addItem(new BottomNavigationItem(R.mipmap.home_item1_check, getString(R.string.home))
                        .setActiveColor(Color.BLUE)
                        .setInActiveColor(Color.GRAY)
                        .setInactiveIcon(getResources().getDrawable(R.mipmap.home_item1_uncheck)))
                .addItem(new BottomNavigationItem(R.mipmap.home_item2_check, getString(R.string.choice))
                        .setActiveColor(Color.BLUE)
                        .setInActiveColor(Color.GRAY)
                        .setInactiveIcon(getResources().getDrawable(R.mipmap.home_item2_uncheck)))
                .addItem(new BottomNavigationItem(R.mipmap.home_item3_check, getString(R.string.hope_treasure))
                        .setActiveColor(Color.BLUE)
                        .setInActiveColor(Color.GRAY)
                        .setInactiveIcon(getResources().getDrawable(R.mipmap.home_item3_uncheck)))
                .addItem(new BottomNavigationItem(R.mipmap.home_item4_check, getString(R.string.assets))
                        .setActiveColor(Color.BLUE)
                        .setInActiveColor(Color.GRAY)
                        .setInactiveIcon(getResources().getDrawable(R.mipmap.home_item4_uncheck)))
                .setFirstSelectedPosition(0)
                .initialise();

    }

    /**
     * 添加fragment
     */
    private void setFragmentList() {
        fragmentList.add(new HomeFragment());
        fragmentList.add(new ChoiceFragment());
        fragmentList.add(new HopeTreasureFragment());
        fragmentList.add(new AssetsFragment());
    }
}
