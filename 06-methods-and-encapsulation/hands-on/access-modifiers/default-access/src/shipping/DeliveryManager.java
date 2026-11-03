package shipping;

import billing.Invoice;

public class DeliveryManager {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        inv.printInvoice();
    }
}

// billing/Invoice.java -> compiles
// billing/Delivery.java -> compiles
// shipping/DeliveryManager.java -> Compilation error
// Because Invoice has default (package-private) access. It can only be accessed by classes within the billing package.