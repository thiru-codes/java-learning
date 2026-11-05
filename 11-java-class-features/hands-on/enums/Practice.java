enum TrafficLight{
    //enum constants -> values passed in brackets()
    // it supplies these arguments to constructor 
    RED(30,"Red"),
    YELLOW(5,"Yellow"),
    GREEN(45,"Green");

    //field declaration
    private final int duration;
    private final String color;

    //private constructor -> only the enum class itself can
    // initialise its own fields
    // in same order written in the constants
    private TrafficLight(int duration,String color){
        this.duration = duration;
        this.color = color;
    }

    // getter
    public String getColor(){
        return color;
    }
    public int getDuration(){
        return duration;
    }
}

public class Practice {
    public static void main(String[] args){
        TrafficLight signal = TrafficLight.GREEN;

        System.out.println("Traffic Signal : " +  signal.getColor());
         System.out.println("Traffic Signal : "  + signal.getDuration());
    }
}
