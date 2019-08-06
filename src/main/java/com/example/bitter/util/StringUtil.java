package com.example.bitter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

    public static final String castDateTime(String ymd) {
        if (ymd == null) {
            return null;
        }
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date = null;
        try {
            date = sdFormat.parse(ymd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String ret = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);

        return ret;

    }
}
