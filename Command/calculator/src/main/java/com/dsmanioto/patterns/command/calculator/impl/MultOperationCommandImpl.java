package com.dsmanioto.patterns.command.calculator.impl;

import com.dsmanioto.patterns.command.calculator.Operation;
import com.dsmanioto.patterns.command.calculator.OperationCommand;

public class MultOperationCommandImpl implements OperationCommand {

    private Operation operation;

    public MultOperationCommandImpl(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Integer execute() {
        return operation.getValue1() * operation.getValue2();
    }

}
