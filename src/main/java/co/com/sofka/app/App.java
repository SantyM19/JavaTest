package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {
        Long result = null;
        Long result1;
        Long result2;
        Long result3;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number 1: ");
        String textNumber1 = bufferedReader.readLine();

        System.out.println("Enter number 2: ");
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf(textNumber1);
        Long number2 = Long.valueOf(textNumber2);

        BasicCalculator calculator = new BasicCalculator();
        try {
            result = calculator.sum(number1, number2);
            result1 = calculator.res(number1, number2);
            result2 = calculator.mul(number1, number2);
            result3 = calculator.div(number1, number2);
        } catch (Exception e) {
            System.out.println("Something went wrong, in this case with 0 in div.");
        }

        System.out.println(number1 + " + " + number2 + " = " + result);
    }
}
