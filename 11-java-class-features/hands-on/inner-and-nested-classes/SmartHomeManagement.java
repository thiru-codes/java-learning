// anonymous inner class example
interface DeviceAction {
    void perform();
}
// without an anonymous class
/* class TurnOnLivingRoomLight implements DeviceAction {

    @Override
    public void perform() {
        System.out.println("Turning on the living room light.");
    }
} */
// and then, in main:
/* 
    DeviceAction action = new TurnOnLivingRoomLight();
    action.perform(); 
*/

class SmartHomeController{
    String controllerName;
    DeviceAction deviceAction;

    public void perform(){
        deviceAction.perform();
    }

    // static class -> system information
    // doesn't belong to one particular controller object
    static class SystemInfo{
        static double controllerVersion;
        static String manufacturer;
        static{
            controllerVersion = 2.1;
            manufacturer = "LiveSmart by Google";
        }
        static void display(){
            System.out.println("Controller Version  : " + controllerVersion);
            System.out.println("Manufacturer        : " + manufacturer);
        }
    }

   // member inner class
   // a room is controlled by one instance of the SmartHomeController
    class Room{
        String[] devicesInRoom;

        public Room(String[] devicesInRoom) {
            this.devicesInRoom = devicesInRoom;
        }

        public void displayDevices(){
            // can access field belonging to outer controller instance
            System.out.println("Display no. of devices managed by " + controllerName + " : " + devicesInRoom.length);
            for(int i=0;i<devicesInRoom.length;i++){
                System.out.println(devicesInRoom[i]);
            }
        }
    }

    public void validateConnection(String connectionType) {
        // local class
        // only needed inside this method
        class ConnectionValidator {
            public void validate() {
                if (connectionType.equals("WiFi") || connectionType.equals("Bluetooth")) {
                    System.out.println(connectionType + " connection is supported");
                } else {
                    System.out.println(connectionType + " connection is not supported");
                }
            }
        }
        ConnectionValidator validator = new ConnectionValidator();
        // local class object
        validator.validate();
    }
    // local class is no longer in scope outside the method
}

public class SmartHomeManagement {
    public static void main(String[] args){
        //static nested class
        //no outer object is needed
        SmartHomeController.SystemInfo.display();
        System.out.println();

        // create outer class object
        SmartHomeController controller = new SmartHomeController();
        controller.controllerName = "Home Controller LR";

        // member inner class
        // room is created through a specific controller instance
        String[] devices = {"Light", "Fan", "Air Conditioner"};
        SmartHomeController.Room livingRoom = controller.new Room(devices);
        // must be created through an object of the outer class
        // syntax: outerObject.new InnerClass()
        livingRoom.displayDevices();
        System.out.println();

        // local class
        // connection validator exists only inside this method call
        controller.validateConnection("WiFi");
        controller.validateConnection("Ethernet");
        System.out.println();

        //anonymous inner class
        //provide an immediate, inline implementation of 
        // the interface's abstract methods
        DeviceAction action = new DeviceAction() {
            @Override
            public void perform() {
                System.out.println("Turning on the living room light.");
            }
        };
        action.perform();
    }
}