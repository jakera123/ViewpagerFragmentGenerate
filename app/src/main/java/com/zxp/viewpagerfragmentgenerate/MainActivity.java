package com.zxp.viewpagerfragmentgenerate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zxp.viewpagerfragmentgenerate.Adapter.MyadapterViewpager;
import com.zxp.viewpagerfragmentgenerate.Fragment.Fragmentconcret;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        //Fragment fragment1=new Fragment();
        //viewPager.addView(fragment1.onCreateView(getLayoutInflater(),null,null));

        List<Fragment> fragments=new ArrayList<Fragment>();
        //注意：Fragment有一个是在支持包的，有一个不是，不能混淆来用！！！

        Fragmentconcret fragment01=new Fragmentconcret();
        Bundle bundle1=new Bundle();
        bundle1.putStringArray("weathedata",new String[]{"23","南风","晴"});
        fragment01.setArguments(bundle1);

        fragment01.setData("23","南风","晴");

        fragments.add(fragment01);

        Fragmentconcret fragment02=new Fragmentconcret();

        fragment02.setData("24","西北风","晴");
        fragments.add(fragment02);

        Fragmentconcret fragment03=new Fragmentconcret();
        fragment03.setData("23","西北风","晴");
        fragments.add(fragment03);

        Fragmentconcret fragment04=new Fragmentconcret();
        fragment04.setData("28","西北风","阴");
        fragments.add(fragment04);

        MyadapterViewpager adapter=new MyadapterViewpager(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);


    }
}
