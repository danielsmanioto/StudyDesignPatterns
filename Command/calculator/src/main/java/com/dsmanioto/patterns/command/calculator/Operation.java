package com.dsmanioto.patterns.command.calculator;

public class Operation {

    private Integer value1;
    private Integer value2;

    public Operation(Integer value1, Integer value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Integer getValue1() {
        return value1;
    }

    public Integer getValue2() {
        return value2;
    }
}
