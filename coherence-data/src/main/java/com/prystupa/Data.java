package com.prystupa;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 2/18/13
 * Time: 11:08 AM
 */

public class Data implements Serializable {
    private int intData;
    private String stringData;

    public Data(int intData, String stringData) {
        this.intData = intData;
        this.stringData = stringData;
    }

    public Data() {
    }

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }
}
