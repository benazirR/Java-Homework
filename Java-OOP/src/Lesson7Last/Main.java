package Lesson7Last;

import Lesson7Last.calculator.*;
import Lesson7Last.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();
        CalculatorContext calculator = new CalculatorContext(logger);

        ComplexNumber a = new ComplexNumber(1,2);
        ComplexNumber b = new ComplexNumber(3,4);

        calculator.setOperation(new AddOperation());
        calculator.calculate(a, b);

        calculator.setOperation(new MultiplyOperation());
        calculator.calculate(a, b);

        calculator.setOperation(new DivideOperation());
        calculator.calculate(a, b);
    }
}
