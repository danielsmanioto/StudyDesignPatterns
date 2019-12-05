package com.dsmanioto.patterns.command.calculator;

@FunctionalInterface
public interface OperationCommand {

    Integer execute();

}
