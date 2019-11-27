package com.dsmanioto.patterns.command.calculator.impl;

import com.dsmanioto.patterns.command.calculator.Operation;
import com.dsmanioto.patterns.command.calculator.OperationCommand;

public class AddOperationCommandImpl implements OperationCommand {

    private Operation operation;

    public AddOperationCommandImpl(Operation operation) {
        this.operation = operation;
    }

    @Override
    public Integer execute() {
        return operation.getValue1() + operation.getValue2();
    }

}
