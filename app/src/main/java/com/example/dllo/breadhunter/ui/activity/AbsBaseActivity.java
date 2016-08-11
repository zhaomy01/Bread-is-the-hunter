package com.example.dllo.breadhunter.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.dllo.breadhunter.tools.FragmentManagerTran;
/**
 * Activity基类
 */
public abstract class AbsBaseActivity extends AppCompatActivity {
    private FragmentManagerTran fragmentManagerTran;

    public FragmentManagerTran getFragmentManagerTran() {
        return fragmentManagerTran;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentManagerTran = new FragmentManagerTran(this);

        setContentView(setLayout());

        initViews();

        initDatas();
    }
    protected abstract int setLayout();

    protected abstract void initViews();

    protected abstract void initDatas();

    //跳转方法
    protected void goTo(Context from,Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from, to);
        startActivity(intent);
    }

}
