package com.example.ichin.mvpexample.presenter;

import android.view.View;

import com.example.ichin.mvpexample.contract.MainActivityContract;
import com.example.ichin.mvpexample.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model model;

    public MainActivityPresenter(MainActivityContract.View view) {
        mView = view;
        initModel();
    }

    private void initModel() {
        model = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        String data = model.getData();
        mView.setViewData(data);
    }
}
