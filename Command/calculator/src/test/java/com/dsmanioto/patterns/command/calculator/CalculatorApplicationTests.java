package com.dsmanioto.patterns.command.calculator;

import com.dsmanioto.patterns.command.calculator.impl.AddOperationCommandImpl;
import com.dsmanioto.patterns.command.calculator.impl.DivisionOperationCommandImpl;
import com.dsmanioto.patterns.command.calculator.impl.MultOperationCommandImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

    private  Operation operation = new Operation(5, 5);    ;
    
    @Test
    void testAdd() {
        OperationCommand add = new AddOperationCommandImpl(operation);
        assertEquals(10, add.execute());
    }

    @Test
    void testDivision() {
        OperationCommand div = new DivisionOperationCommandImpl(operation);
        assertEquals(1, div.execute());
    }

    @Test
    void testMult() {
        OperationCommand mult = new MultOperationCommandImpl(operation);
        assertEquals(25, mult.execute());
    }

}
