# BottomTabView

可以直接复制代码

[BottomTabView.java](/app/src/main/java/cn/ifmvo/bottomtabview/BottomTabView.java)

[view_tab_item.xml](/app/src/main/res/layout/view_tab_item.xml)

### 使用方法
***初始化数据***
```
ArrayList<BottomTabView.TabItemView> tabItemViews = new ArrayList<>();
tabItemViews.add(new BottomTabView.TabItemView(this, "标题1", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
tabItemViews.add(new BottomTabView.TabItemView(this, "标题2", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
tabItemViews.add(new BottomTabView.TabItemView(this, "标题3", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
tabItemViews.add(new BottomTabView.TabItemView(this, "标题4", R.color.colorPrimary, R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
```

***设置数据***
```
bottomTabView.setTabItemViews(tabItemViews);
```

***连接 ViewPager***
```
bottomTabView.setUpWithViewPager(viewPager);
```

***设置 Item 选择监听***
```
bottomTabView.setOnTabItemSelectListener(new BottomTabView.OnTabItemSelectListener() {
    @Override
    public void onTabItemSelect(int position) {
        //
    }
});
```

***已经被选中，再次点击的监听***
```
bottomTabView.setOnSecondSelectListener(new BottomTabView.OnSecondSelectListener() {
    @Override
    public void onSecondSelect(int position) {
        //refresh();
    }
});
```

## 更多高级使用方法请看[MatthewBases](https://github.com/ifmvo/MatthewBases/)
