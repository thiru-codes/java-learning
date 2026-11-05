package practice.computer;

import practice.computerparts.Processor;
import practice.computerparts.Keyboard;

public class Computer {
    private final Processor processor;
    private final Keyboard keyboard;

    public Computer(Processor processor, Keyboard keyboard){
        this.processor = processor;
        this.keyboard = keyboard;
    }

    public void start(){
        processor.startProcessing();
        keyboard.type();
        System.out.println("Computer started");
    }
}