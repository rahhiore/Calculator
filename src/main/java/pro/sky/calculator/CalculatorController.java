package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;
    public CalculatorController(CalculatorServiceInterface calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1") int number1, @RequestParam(value = "num2") int number2) {
        int result = calculatorService.plus(number1, number2);
        return number1 + " + " + number2 + " = " + result;

    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1") int number1, @RequestParam(value = "num2") int number2) {
        int result = calculatorService.minus(number1, number2);
        return number1 + " - " + number2 + " = " + result;
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1") int number1, @RequestParam(value = "num2") int number2) {
        int result = calculatorService.multiply(number1, number2);
        return number1 + " * " + number2 + " = " + result;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") int number1, @RequestParam(value = "num2") int number2) {
        if (number2 == 0) {
            return "Error";
        }
        int result = calculatorService.divide(number1, number2);
        return number1 + " / " + number2 + " = " + result;
    }
}
