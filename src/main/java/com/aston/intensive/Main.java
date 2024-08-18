package com.aston.intensive;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("adc");
        list1.add("weq");
        list1.add("dvb");
        list1.add("lak");
        list.addAll(list1);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
