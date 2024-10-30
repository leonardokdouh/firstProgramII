package model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class GenericService <T>{
    private List<T> myList = new ArrayList<>();

    public void add(T item) {
        myList.add(item);
    }

    public void remove(T item) {
        myList.remove(item);
    }

    public List<T> getList() {
        return myList;
    }

    public void showList() {
        for (T item : myList) {
            System.out.println(item);
        }

    }


}
