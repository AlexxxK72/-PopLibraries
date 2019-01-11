package ru.a777alko.lesson1.ui;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import ru.a777alko.lesson1.R;
import ru.a777alko.lesson1.mvp.presenter.Presenter;
import ru.a777alko.lesson1.mvp.view.MainView;

public class MainActivity extends MvpAppCompatActivity implements MainView, View.OnClickListener {

    @InjectPresenter Presenter presenter;
    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = findViewById(R.id.btn_counter1);
        btnCounter2 = findViewById(R.id.btn_counter2);
        btnCounter3 = findViewById(R.id.btn_counter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);

    }

    @ProvidePresenter
    public Presenter provideMainPresenter(){
        return new Presenter();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_counter1:
                presenter.buttonClick(0);
              break;
            case R.id.btn_counter2:
                presenter.buttonClick(1);
                break;
            case R.id.btn_counter3:
                presenter.buttonClick(2);
                break;
        }
    }

    @Override
    public void setTextBtnCounter1(int value) {
        btnCounter1.setText("Количество = " + value);
    }

    @Override
    public void setTextBtnCounter2(int value) {
        btnCounter2.setText("Количество = " + value);
    }

    @Override
    public void setTextBtnCounter3(int value) {
        btnCounter3.setText("Количество = " + value);
    }
}
