package com.echo.practice;

import java.util.ArrayList;
import java.util.Date;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date());
        Date date = dates.get(0);
        System.out.println(date);
    }
}
