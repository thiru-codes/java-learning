package practice.computerparts;

public class Keyboard{
    private String brand;
    protected String connectionType;

    public Keyboard(String brand, String connectionType){
        if(brand == null || brand.isEmpty()){
            throw new IllegalArgumentException("Brand name cannot be empty");
        }
        if(connectionType == null || connectionType.isEmpty()){
            throw new IllegalArgumentException("Connection Type cannot be empty");
        }
        this.brand = brand;
        this.connectionType = connectionType;
    }

    public String getBrand() {
        return brand;
    }

    public void type(){
        System.out.println("Keyboard typing");
        System.out.println("Brand      : " + brand);
        System.out.println("Connection : " + connectionType);
       
    }
}