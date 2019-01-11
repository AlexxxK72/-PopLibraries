package ru.a777alko.lesson1.mvp.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(value = AddToEndSingleStrategy.class)
public interface MainView extends MvpView {
    void setTextBtnCounter1(int value);
    void setTextBtnCounter2(int value);
    void setTextBtnCounter3(int value);
}
