package com.example.bitter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringUtil {

    public static final String getThisMonth(String yyyymm) {
        if (yyyymm == null) {
            return null;
        }
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMM");
        Date date = null;
        try {
            date = sdFormat.parse(yyyymm);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ret = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        return ret;

    }

    public static final String getAnyAfterMonth(String yyyymm, int target) {
        if (yyyymm == null) {
            return null;
        }
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMM");
        Date date = null;
        try {
            date = sdFormat.parse(yyyymm);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, target);
        Date nextMonthDate = calendar.getTime();
        String ret = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(nextMonthDate);

        return ret;
    }

}
