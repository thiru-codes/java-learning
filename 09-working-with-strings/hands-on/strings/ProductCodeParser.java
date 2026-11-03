class Format{
    public void display(String productCode){
        String[] parts = productCode.split("-");
        System.out.println("Catgegory : " + parts[0]);
        System.out.println("Year      : " + parts[1]);
        System.out.println("Edition   : " + parts[2]);
    }
}

public class ProductCodeParser {
    public static void main(String[] args) {
        Format formatter = new Format();

        String productCode = "LAPTOP-2026-PRO";
        formatter.display(productCode);
    }
}