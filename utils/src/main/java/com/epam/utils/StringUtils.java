package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        //here magic will happen
        int strInt = NumberUtils.toInt(str);

        if (strInt > 0) {
            return true;
        } else return false;
    }
}
