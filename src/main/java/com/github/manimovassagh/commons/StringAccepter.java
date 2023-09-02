package com.github.manimovassagh.commons;

import org.bouncycastle.util.StringList;

import java.util.Iterator;
import java.util.Objects;

class StringAccept implements ItemAdder{
private String string;
private Integer integer;

    public StringAccept(String string, Integer integer) {
        this.string = string;
        this.integer = integer;
    }

    public StringAccept(String string) {
        this.string = string;
    }

    public StringAccept(Integer integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringAccept that = (StringAccept) o;
        return Objects.equals(string, that.string) && Objects.equals(integer, that.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, integer);
    }


    @Override
    public String toString() {
        return "StringAccept{" +
                "string='" + string + '\'' +
                ", integer=" + integer +
                '}';
    }
}
