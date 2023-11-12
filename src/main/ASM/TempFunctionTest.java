package src.main.ASM;

public class TempFunctionTest {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "摄氏度等于" + fahrenheit + "华氏度");

        fahrenheit = 77.0;
        celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "华氏度等于" + celsius + "摄氏度");
    }

    public String sayHello(String callDirectly) {
        return "s";
    }
}

class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


}