package ru.a777alko.lesson1.mvp.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Integer> list;

    public Model(){
        list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
    }

    public int getElementValueAtIndex(int index){
        return list.get(index);
    }

    public void setElementValueAtIndex(int index, int value){
        list.set(index, value);
    }
}
