class SmartThermostat{
    private double temperatureInCelsius;

    public double getTemperatureInCelsius(){
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temp){
        temperatureInCelsius = temp;
    }

    public double getTemperatureInFahrenheit(){
        return (temperatureInCelsius * 9/5) + 32;
    }

    public void setTemperatureInFahrenheit(double fahrenheit){
        temperatureInCelsius = (fahrenheit - 32) * 5/9;
    }
}


public class UseSmartThermostat {
    public static void main(String[] args) {
        SmartThermostat smartThermostat = new SmartThermostat();

        smartThermostat.setTemperatureInFahrenheit(72.8);
        System.out.println(smartThermostat.getTemperatureInCelsius());

    }
}

