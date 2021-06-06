package com.example.assignmentiasf.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeUtil {
    static SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    public static String convertLongToString(long timeInMLS){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMLS);
        return formatDate.format(calendar.getTime());
    }
}
