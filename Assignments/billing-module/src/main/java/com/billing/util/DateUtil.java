package com.billing.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static Date convertStringToDate(String dateString) throws ParseException {
        return dateFormat.parse(dateString);
    }
}

