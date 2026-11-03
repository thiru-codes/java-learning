interface Printable{
    void print();
}

interface Loggable{
    void log();
}

class Invoice implements Printable, Loggable{
    @Override
    public void print(){
        System.out.println("Printing invoice");
    }

    @Override
    public void log(){
       System.out.println("Invoice logged");
    }

}


public class TwoInterfaces {
    public static void main(String[] args) {
        
        Printable p = new Invoice();
        Loggable l = new Invoice();
        Invoice i = new Invoice();

        p.print();
        l.log();

        i.print();
        i.log();

        //p.log();
        //The method log() is undefined for the type Printable
        //l.print();
        //The method print() is undefined for the type Loggable
    }
}
