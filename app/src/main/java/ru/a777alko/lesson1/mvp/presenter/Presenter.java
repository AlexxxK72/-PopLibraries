package ru.a777alko.lesson1.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import ru.a777alko.lesson1.mvp.model.Model;
import ru.a777alko.lesson1.mvp.view.MainView;

@InjectViewState
public class Presenter extends MvpPresenter<MainView> {
    private Model model;

    public Presenter(){
        model = new Model();
    }

    public void buttonClick(int btnIndex){
        setTextBtnCounter(btnIndex);
    }

    private int calcNewModelValue(int modelElementIndex){
        int currentValue = model.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void setTextBtnCounter(int btnIndex) {
        int newModelValue = calcNewModelValue(btnIndex);
        model.setElementValueAtIndex(btnIndex, newModelValue);
        switch (btnIndex){
            case 0:
                getViewState().setTextBtnCounter1(newModelValue);
                break;
            case 1:
                getViewState().setTextBtnCounter2(newModelValue);
                break;
            case 2:
                getViewState().setTextBtnCounter3(newModelValue);
                break;
        }

    }

}
