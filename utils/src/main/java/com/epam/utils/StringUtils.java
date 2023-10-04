package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;


public class StringUtils {
//    public static void main(String[] args) {
//        System.out.println(isPositiveNumber("088"));
//        System.out.println(NumberUtils.isDigits("088"));
//        System.out.println(NumberUtils.isCreatable("088"));
//    }

    public static boolean isPositiveNumber(String str) {

//        if (str == null) {
//            return false;
//        }
//
//        String[] chars = str.split("");
//        if (chars[0].equals("0")) {
//            return false;
//        }

        if (NumberUtils.isCreatable(str) && NumberUtils.toDouble(str) > 0) {
            return true;
        } else return false;

    }
}
