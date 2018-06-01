package com.example.ichin.mvpexample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ichin.mvpexample.R;
import com.example.ichin.mvpexample.contract.MainActivityContract;
import com.example.ichin.mvpexample.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    TextView textView;
    Button button;
    MainActivityContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClick(v);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        textView.setText(data);

    }
}
