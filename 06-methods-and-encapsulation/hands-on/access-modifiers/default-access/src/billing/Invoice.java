package billing;

class Invoice {
    double billTotal;
    
    void printInvoice(){
        System.out.println(billTotal);
    }
}

//the "default" access modifier (no keyword written) 
// prevents classes in other packages from seeing this code