package cn.xwjrfw.p2p.activity.fund;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.xwjr.utilcode.utils.LogUtils;
import com.xwjr.utilcode.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseActivity;
import lecho.lib.hellocharts.gesture.ContainerScrollType;
import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.listener.LineChartOnValueSelectListener;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.ValueShape;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class ToMakeMoneyActivity extends BaseActivity {

    String[] date = {"10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07"};//X轴的标注
    double[] score = {3.453, 3.458, 3.404, 3.505, 3.596, 3.665, 4.123};//图表的数据点
    private List<PointValue> mPointValues = new ArrayList<PointValue>();
    private List<AxisValue> mAxisXValues = new ArrayList<AxisValue>();
    private LineChartView lineChart;
    private LineChartData lineChartData;

    @Override
    protected void init() {
        setContentView(R.layout.activity_to_make_money);

    }

    @Override
    protected void findView() {

        lineChart = (LineChartView) findViewById(R.id.lineChartView);

    }

    @Override
    protected void defaultData() {
        getAxisXLables();//获取x轴的标注
        getAxisPoints();//获取坐标点
        initLineChart();//初始化
    }

    @Override
    protected void setListener() {

    }


    /**
     * 设置X 轴的显示
     */
    private void getAxisXLables() {
        for (int i = 0; i < date.length; i++) {
            mAxisXValues.add(new AxisValue(i).setLabel(date[i]));
        }
    }

    /**
     * 图表的每个点的显示
     */
    private void getAxisPoints() {
        for (int i = 0; i < score.length; i++) {
            mPointValues.add(new PointValue(i, (float) score[i]));
        }
    }

    /**
     * 初始化折线图
     */
    private void initLineChart() {
        Line line = new Line(mPointValues).setColor(getResources().getColor(R.color.text_red));  //折线的颜色（橙色）
        List<Line> lines = new ArrayList<Line>();
        line.setShape(ValueShape.CIRCLE);//折线图上每个数据点的形状  这里是圆形 （有三种 ：ValueShape.SQUARE  ValueShape.CIRCLE  ValueShape.DIAMOND）
        line.setCubic(false);//曲线是否平滑，即是曲线还是折线
        line.setFilled(true);//是否填充曲线的面积
        line.setStrokeWidth(1);//折线宽度
        line.setAreaTransparency(60);//覆盖区域透明度
        line.setPointRadius(3);//设置节点半径
//        line.setHasLabels(true);//曲线的数据坐标是否加上备注
        line.setHasLabelsOnlyForSelected(true);//点击数据坐标提示数据（设置了这个line.setHasLabels(true);就无效）
        line.setHasLines(true);//是否用线显示。如果为false 则没有曲线只有点显示
        line.setHasPoints(true);//是否显示圆点 如果为false 则没有原点只有点显示（每个数据点都是个大的圆点）
        lines.add(line);

//        List<PointValue> mPoint2 = new ArrayList<PointValue>();
//        mPoint2.add(new PointValue(0,0));
//        Line line2 = new Line(mPoint2).setColor(getResources().getColor(R.color.transparent));  //折线的颜色（橙色）
//        line2.setFilled(false);
//        line2.setStrokeWidth(0);
//        line2.setHasPoints(true);
//        lines.add(line2);

        LineChartData data = new LineChartData();
//        data.setBaseValue(50);
        data.setValueLabelBackgroundAuto(true);// 设置数据背景是否跟随节点颜色
        data.setValueLabelBackgroundColor(getResources().getColor(R.color.text_red));// 设置数据背景颜色
        data.setValueLabelBackgroundEnabled(true);// 设置是否有数据背景
        data.setValueLabelsTextColor(getResources().getColor(R.color.white));// 设置数据文字颜色
        data.setValueLabelTextSize(15);// 设置数据文字大小
        data.setValueLabelTypeface(Typeface.MONOSPACE);// 设置数据文字样式
        data.setLines(lines);

        //坐标轴
        Axis axisX = new Axis(); //X轴
        axisX.setHasTiltedLabels(false);  //X坐标轴字体是斜的显示还是直的，true是斜的显示
        axisX.setTextColor(getResources().getColor(R.color.text333));  //设置字体颜色
//        axisX.setName("七日年化收益率(%)");  //表格名称
        axisX.setTextSize(8);//设置字体大小
        axisX.setMaxLabelChars(1); //最多几个X轴坐标，意思就是你的缩放让X轴上数据的个数7<=x<=mAxisXValues.length
        axisX.setValues(mAxisXValues);  //填充X轴的坐标名称
        data.setAxisXBottom(axisX); //x 轴在底部
        //data.setAxisXTop(axisX);  //x 轴在顶部
        axisX.setHasLines(true); //x 轴分割线


        // Y轴是根据数据的大小自动设置Y轴上限(在下面我会给出固定Y轴数据个数的解决方案)
        Axis axisY = new Axis();  //Y轴
//        axisY.setName("七日年化收益率(%)");//y轴标注
        axisY.setTextSize(8);//设置字体大小
        axisY.setHasLines(true);
        data.setAxisYLeft(axisY);  //Y轴设置在左边
//        data.setAxisYRight(axisY);  //y轴设置在右边

//        Axis axisY = new Axis().setHasLines(true);
//        axisY.setMaxLabelChars(10);//max label length, for example 60
//        List<AxisValue> values = new ArrayList<>();
//        for(int i = 0; i < 100; i+= 10){
//            AxisValue value = new AxisValue(i);
//            String label = ""+i;
//            value.setLabel(label);
//            values.add(value);
//        }
//        axisY.setValues(values);
//        axisY.setTextSize(8);//设置字体大小
//        data.setAxisYLeft(axisY);


        //设置行为属性，支持缩放、滑动以及平移
        lineChart.setZoomEnabled(true);
        lineChart.setInteractive(true);
        lineChart.setZoomType(ZoomType.HORIZONTAL);
        lineChart.setMaxZoom((float) 1);//最大方法比例
        lineChart.setContainerScrollEnabled(true, ContainerScrollType.HORIZONTAL);
        lineChart.setLineChartData(data);
        lineChart.setVisibility(View.VISIBLE);

        Viewport v = new Viewport(lineChart.getMaximumViewport());
        v.top =4;
        v.bottom =3;
        lineChart.setMaximumViewport(v);
        lineChart.setCurrentViewport(v);
        lineChart.setViewportCalculationEnabled(false);


        /**注：下面的7，10只是代表一个数字去类比而已
         * 当时是为了解决X轴固定数据个数。见（http://forum.xda-developers.com/tools/programming/library-hellocharts-charting-library-t2904456/page2）;
         */
//        Viewport v = new Viewport(lineChart.getMaximumViewport());
//        v.left = 1;
//        v.right = 7;
//        lineChart.setCurrentViewport(v);
    }
}