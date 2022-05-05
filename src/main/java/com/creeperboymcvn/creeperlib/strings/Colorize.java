package com.creeperboymcvn.creeperlib.strings;

import org.bukkit.ChatColor;

public class Colorize {
    private static String[] colorCodes = {"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f"};
    /**
     * Make color strings
     * @param s input string
     * @return colored string
     */
    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    /**
     * Make string look fancy
     * @param s input string
     * @return output string
     */
    public static String randomColor(String s) {
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String st : strings) {
            String code = "&"+colorCodes[(int) Math.round(Math.random()*(colorCodes.length-1))];
            sb.append(color(code)).append(st);
        }
        return sb.toString();
    }

    /**
     * Make string have rainbow colors
     * @param s input string
     * @return rainbow color string
     */
    public static String rainbow(String s) {
        String[] rainbow = {"c","6","e","a","9","1","5"};
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String st:strings) {
            sb.append("&").append(rainbow[index]).append(st);
            index++;
            if (index>6) index=0;
        }
        return color(sb.toString());
    }
}
