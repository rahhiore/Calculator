package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
    public String calculator() {
        return "Добро пожаловать в  калькулятор";
    }
    @Override
    public String plus(int num1, int num2) {
        if(num1 == -99999999 || num2 == -99999999) {
            return "Error";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    @Override
    public String minus(int num1, int num2) {
        if(num1 == -99999999 || num2 == -99999999) {
            return "Error";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    @Override
    public String multiply(int num1, int num2) {
        if(num1 == -99999999 || num2 == -99999999) {
            return "Error";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    @Override
    public String divide(int num1, int num2) {
        if(num1 == -99999999 || num2 == -99999999) {
            return "Error";
        }
        if (num2 == 0) {
            return "Error";
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
