package com.zxp.viewpagerfragmentgenerate.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zxp.viewpagerfragmentgenerate.R;

/**
 * Created by xiaoxin on 2017/6/27.
 */

public class Fragmentconcret extends android.support.v4.app.Fragment {

    private  String temperature,winddirection,weather;

    public void setData(String temperature,String winddirection,String weather){
        this.temperature=temperature;
        this.winddirection=winddirection;
        this.weather=weather;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragmentconrete","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragmentconrete","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragmentconrete","onPause");
    }


    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragmentconrete","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragmentconrete","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragmentconrete","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragmentconrete","onDetach");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_show_weathter,container,false);

     //   Bundle args=getArguments();
     //   String[] data=args.getStringArray("weathedata");

     //   Log.i("testBundle",data.toString()+data.toString().isEmpty());


        Log.i("TestFragment","*********************************");
        Log.i("TEst",temperature+"####"+winddirection+"###"+weather);

        TextView tv_temp=(TextView)view.findViewById(R.id.tv_temperature);
        TextView tv_wind=(TextView)view.findViewById(R.id.tv_WindDirection);
        TextView tv_weat=(TextView)view.findViewById(R.id.tv_weather);

        tv_temp.setText(temperature);
        tv_wind.setText(winddirection);
        tv_weat.setText(weather);


        return view;
    }
}
