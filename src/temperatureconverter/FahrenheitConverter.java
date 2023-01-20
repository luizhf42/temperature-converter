package temperatureconverter;

public class FahrenheitConverter extends TemperatureConverter {
    public static void convert(double temperature) {
        showConversions(convertToCelsius(temperature), temperature, convertToKelvin(temperature));
    }

    private static double convertToCelsius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    private static double convertToKelvin(double temperature) {
        return (temperature - 32) / 1.8 + 273.15;
    }
}