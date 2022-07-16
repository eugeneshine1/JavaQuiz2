package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer s;
    public WuTangConcatenator(Integer input) {
        this.s = input;
    }

    public Boolean isWu() {
        return this.s %3 ==0;
    }

    public Boolean isTang() {
        return this.s %5 ==0;
    }

    public Boolean isWuTang() {
        return this.s %15 ==0;
    }
}
