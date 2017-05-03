package cn.ifmvo.bottomtabview.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import cn.ifmvo.bottomtabview.BottomTabView;
import cn.ifmvo.bottomtabview.R;

public class MainActivity extends AppCompatActivity {

    BottomTabView bottomTabView;

    ViewPager viewPager;

    FragmentPagerAdapter adapter;

    ArrayList<Fragment> fragments = new ArrayList<>();

    ArrayList<BottomTabView.TabItemView> tabItemViews = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        bottomTabView = (BottomTabView) findViewById(R.id.bottomTabView);

        fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());

        adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };

        viewPager.setAdapter(adapter);

        tabItemViews.add(new BottomTabView.TabItemView(this, "123", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        tabItemViews.add(new BottomTabView.TabItemView(this, "123", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        tabItemViews.add(new BottomTabView.TabItemView(this, "123", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        tabItemViews.add(new BottomTabView.TabItemView(this, "123", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));

        bottomTabView.setTabItemViews(tabItemViews);

        bottomTabView.setOnTabItemSelectListener(new BottomTabView.OnTabItemSelectListener() {
            @Override
            public void onTabItemSelect(int position) {
                viewPager.setCurrentItem(position, true);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomTabView.updatePosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
