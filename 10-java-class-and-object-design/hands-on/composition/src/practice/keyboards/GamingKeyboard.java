package practice.keyboards;

import practice.computerparts.Keyboard;

public class GamingKeyboard extends Keyboard{
    private boolean rgbEnabled;
    
    public GamingKeyboard(String brand, String connectionType,boolean rgbEnabled){
        super(brand,connectionType);
        this.rgbEnabled = rgbEnabled;
    }

    @Override
    public void type(){
        System.out.println("Gaming Keyboard typing");
        System.out.println("Brand      :" + getBrand());
        System.out.println("Connection : " + connectionType);
        System.out.println("rgbEnabled : " + rgbEnabled);
    }
}