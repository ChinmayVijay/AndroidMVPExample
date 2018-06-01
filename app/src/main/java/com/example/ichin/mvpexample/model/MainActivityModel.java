package com.example.ichin.mvpexample.model;

import com.example.ichin.mvpexample.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    @Override
    public String getData() {
        return "Hello World!!";
    }
}
