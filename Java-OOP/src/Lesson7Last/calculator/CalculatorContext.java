package Lesson7Last.calculator;

import Lesson7Last.logging.Logger;

public class CalculatorContext {
    private IOperation operation;
    private final Logger logger;

    public CalculatorContext(Logger logger) {
        this.logger = logger;
    }

    public void setOperation(IOperation operation){
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        if (operation == null){
            throw new IllegalStateException("Operation must be set before performing calculation");
        }

        logger.log("Performing calculation: " + a + " and " + b + " using " + operation.getClass().getSimpleName());
        ComplexNumber result = operation.execute(a, b);
        logger.log("Result: " + result);
        return result;
    }
}
