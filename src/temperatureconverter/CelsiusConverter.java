package temperatureconverter;

public class CelsiusConverter extends TemperatureConverter {
    public static void convert(double temperature) {
        showConversions(temperature, convertToFahrenheit(temperature), convertToKelvin(temperature));
    }

    private static double convertToKelvin(double temperature) {
        return temperature + 273.15;
    }

    private static double convertToFahrenheit(double temperature) {
        return (temperature * 1.8) + 32;
    }
}

