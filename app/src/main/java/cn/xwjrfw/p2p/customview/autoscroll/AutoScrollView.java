/** 
 * Project Name锛歐estinghouse 
 * File Name锛欰utoScrollView.java 
 * Package Name锛歝n.harrishuang.attea.view.autoscrollpager 
 * Date锛�2015-1-31 涓婂崍9:25:52 
 * Copyright (c) 2015, harris.huang All Rights Reserved. 
 * harrishuang
 */
package cn.xwjrfw.p2p.customview.autoscroll;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;


import java.util.ArrayList;
import java.util.List;

import cn.xwjrfw.p2p.R;


/**
 * 轮播控件
 */
public class AutoScrollView extends LinearLayout {

	private AutoScrollViewPager vip_autoscroll;
	private LinearLayout layout_indicator;
	private List<View> viewList;
	private Activity context;
	private List<String> dataAllList;
	public DisplayMetrics metrics;

	public AutoScrollView(Context context) {
		super(context);
		this.context = (Activity) context;
		initView(context);
	}

	
	
	
	
	
	
	private void initView(Context context) {
		this.setOrientation(LinearLayout.VERTICAL);
		dataAllList = new ArrayList<String>();
		View view = View.inflate(context, R.layout.layout_autoscrollviewpager,
				null);
		vip_autoscroll = (AutoScrollViewPager) view
				.findViewById(R.id.vip_autoscroll);
		layout_indicator = (LinearLayout) view
				.findViewById(R.id.layout_indicator);
		metrics = new DisplayMetrics();
		Activity activity = (Activity) context;
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		this.addView(view, params);
		vip_autoscroll.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					vip_autoscroll.stopTimer();
					break;
				case MotionEvent.ACTION_UP:
					vip_autoscroll.startTimer();
					break;
				}
				return true;
			}
		});
	}

	public void initCarouslview(final List<String> dataList) {
		if (dataList == null || dataList.size() == 0) {
			return;
		}
		if (dataList.size()>=2) {
			layout_indicator.setVisibility(View.VISIBLE);
		}else {
			layout_indicator.setVisibility(View.INVISIBLE);
		}
		boolean isdouble=false;

		if (dataList.size()==2) {
			isdouble=true;
			dataList.addAll(dataList);
		}
		this.dataAllList = dataList;
		this.setVisibility(View.VISIBLE);
		viewList = new ArrayList<View>();

		for (int i = 0; i < dataList.size(); i++) {
			ImageView imageView = new ImageView(context);
			imageView.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
				int position=	vip_autoscroll.getCurrentItem()%dataList.size();
					mIntent(position);
				}
			});


			viewList.add(imageView);
			
		}





		vip_autoscroll.start(context, viewList, 4000, layout_indicator,
				R.layout.layout_bottom_dot, R.id.dot_view,
				R.drawable.dot_focused, R.drawable.dot_normal,isdouble);
	}

	public void onRestart() {
		if (vip_autoscroll.isStoped) {
			vip_autoscroll.startTimer();
		}

	}

	public void onStop() {
		vip_autoscroll.stopTimer();
	}


	private  void  mIntent(int  position){
		try {

		}catch (Exception e){
			e.printStackTrace();
		}

	}
}
