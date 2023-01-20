package temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {
    private char unit;
    private double temperature;
    private final Scanner scanner = new Scanner(System.in);

    public void setTemperature() {
        System.out.print("Insert the temperature (number only): ");
        this.temperature = scanner.nextDouble();
    }

    public void setUnit() {
        System.out.print("Insert the unit (C, F or K): ");
        this.unit = scanner.next("[CcFfKk]").charAt(0);
    }

    public void convert() {
        switch (Character.toUpperCase(this.unit)) {
            case 'C' -> CelsiusConverter.convert(this.temperature);
            case 'F' -> FahrenheitConverter.convert(this.temperature);
            case 'K' -> KelvinConverter.convert(this.temperature);
            default -> throw new IllegalStateException("Unexpected value: " + unit);
        }
    }

    protected static void showConversions(double celsiusTemperature, double fahrenheitTemperature,
                                          double kelvinTemperature) {
        System.out.println("\nThe converted values are: ");
        System.out.printf("Celsius: %.2f ºC \n", celsiusTemperature);
        System.out.printf("Fahrenheit: %.2f ºF \n", fahrenheitTemperature);
        System.out.printf("Kelvin: %.2f ºK \n", kelvinTemperature);
    }
}

