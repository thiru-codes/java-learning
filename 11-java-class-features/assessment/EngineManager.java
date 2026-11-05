interface BaseEngine{
    void startEngine();
    void stopEngine();
    void accelerate();
}

interface ElectricEngine extends BaseEngine{
    void plugIn();
    void unplug();
}

class TeslaModels implements ElectricEngine{
    int batteryLevel;
    boolean isCharging;

    public TeslaModels(int batteryLevel, boolean isCharging){
        this.batteryLevel = batteryLevel;
        this.isCharging = isCharging;
    }

    //gettters
    public int getBatteryLevel(){return batteryLevel;}
    public boolean isCharging(){return isCharging;}

    @Override
    public void startEngine(){System.out.println("Engine starting... ");}

    @Override
    public void stopEngine(){System.out.println("Engine stopped... ");}

    @Override
    public void accelerate(){System.out.println("Accelerating!");}

    @Override
    public void plugIn(){
        System.out.println("Battery charging... ");
        isCharging = true;
    }

    @Override
    public void unplug(){
        System.out.println("Charging stopped");
        isCharging = false;
    }

}


public class EngineManager {
    public static void main(String[] args){

        TeslaModels car = new TeslaModels(90,true);

        car.startEngine();
        car.stopEngine();
        car.accelerate();
        car.plugIn();
        car.unplug();

        System.out.println("Battery level     : " + car.getBatteryLevel());
        System.out.println("Battery charging? : " + car.isCharging());

    }
}
