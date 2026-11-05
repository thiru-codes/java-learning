package practice;

import practice.computer.*;
import practice.computerparts.*;
import practice.keyboards.*;

public class ClassDesign {
    public static void main(String[] args){
        Processor processor = new Processor("Apple M1",8);
        GamingKeyboard keyboard = new GamingKeyboard("Logitech","wireless",true);

        Computer computer = new Computer(processor, keyboard);

        computer.start();
    }
}
