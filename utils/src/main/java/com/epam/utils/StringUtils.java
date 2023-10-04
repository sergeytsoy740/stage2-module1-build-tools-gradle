package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;


public class StringUtils {
//    public static void main(String[] args) {
//        System.out.println(isPositiveNumber("088"));
//        System.out.println(NumberUtils.toDouble("088"));
//    }

    public static boolean isPositiveNumber(String str) {

        String[] chars = str.split("");
        if (chars[0].equals("0")) return false;

        if (NumberUtils.toDouble(str) > 0) {
            return true;
        } else return false;

    }
}
