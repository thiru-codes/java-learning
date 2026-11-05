package composition;

// component classes
class Processor{
    void startProcessing(){
        System.out.println("Processor started");
    }
}
class Keyboard{
    void type(){
        System.out.println("Typing...");
    }
}

// container class
class Computer{
    // option 1: create objects when class is initialised
    // Processor processor = new Processor();
    // Keyboard keyboard = new Keyboard();

    // option 2: constructor initialization
    // computer is creating its own processor and keyboard
    Processor processor;
    Keyboard keyboard;

    public Computer(){
        this.processor = new Processor(); 
        this.keyboard = new Keyboard();
        // component objects lifecycle owned by container object
        // instantiated during container object initialisation
    }
    

    //option 3: constructor injection
    // computer isn't responsible for creating these objects
    // it recieves the objects 
    public Computer(Processor processor, Keyboard keyboard){
        this.processor = processor;
        this.keyboard = keyboard;
        // the components are created externally and passed into the computer
    }

    void start(){
        processor.startProcessing();
        keyboard.type();
        System.out.println("Computer started");
    }
}


public class CompositionDemo{
    public static void main(String[] args){
        Computer computer1 = new Computer();
        computer1.start();

        Processor processor = new Processor();
        Keyboard keyboard = new Keyboard();
        Computer computer2 = new Computer(processor, keyboard);
        computer2.start();
    }
}

// so, three ways of composition demonstarted...
// 1. field initialization
// 2. constructor initialization
// 3. constructor injection