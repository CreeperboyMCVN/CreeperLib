package com.creeperboymcvn.creeperlib.strings;

public class StringCalculator {
    public static int getLength(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        for (char st: chars) {
            len+=DefaultFontInfo.getDefaultFontInfo(st).getLength();
        }
        return len;
    }

    public static String alignCenter(String s, int width) {
        int a = width - getLength(s);
        int amountSpace = (a/2)/3;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= amountSpace) {
            sb.append(" ");
            i++;
        }
        return sb.append(s).toString();
    }
}
