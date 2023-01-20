package temperatureconverter;


public class App {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.setUnit();
        converter.setTemperature();
        converter.convert();
    }
}

