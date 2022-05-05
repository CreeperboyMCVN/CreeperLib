package com.creeperboymcvn.creeperlib.strings;

import org.bukkit.Color;

/**
 * This class help you make process bar string easier
 */
public class Bars {
    private char ch;
    private int amount;
    private double max;
    private double current;
    private Color fill;
    private Color empty;

    public Bars() {}

    public Bars(char ch, int amount, double max, double current, Color fill, Color empty) {
        this.ch = ch;
        this.amount = amount;
        this.max = max;
        this.current = current;
        this.fill = fill;
        this.empty = empty;
    }

    /**
     * Set amount of character
     * @param amount amount of character
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Set display char
     * @param ch char
     */
    public void setChar(char ch) {
        this.ch = ch;
    }

    /**
     * Set current value
     * @param current current value
     */
    public void setCurrent(double current) {
        this.current = current;
    }

    /**
     * Set max value
     * @param max max value
     */
    public void setMax(double max) {
        this.max = max;
    }

    /**
     * Set empty color
     * @param empty the empty color
     */
    public void setEmpty(Color empty) {
        this.empty = empty;
    }

    /**
     * Set fill color
     * @param fill fill color
     */
    public void setFill(Color fill) {
        this.fill = fill;
    }

    /**
     * Parse the bar
     * @return the process bar
     */
    @Override
    public String toString() {
        long achars = Math.round(this.max/this.current);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.amount; i++) {
            if (achars <= i) {
                sb.append(fill).append(ch);
            } else {
                sb.append(empty).append(ch);
            }
        }
        return sb.toString();
    }
}
