public class OrderSummaryBuilder {
    public static void main(String[] args) {
        StringBuilder summary = new StringBuilder("Order Summary\n");

        summary.append("Customer: Sanjay\n");
        summary.append("Item: Mouse - Rs. 750\n");
        summary.append("Item: Keyboard - Rs. 1200\n");
        summary.append("Note: Check stock\n");

        summary.insert(14, "Order ID: ORD1024\n");

        int itemStart = summary.indexOf("Mouse");
        summary.replace(itemStart, itemStart + 5, "Headphones");

        int noteStart = summary.indexOf("Note:");
        summary.delete(noteStart, summary.length());

        System.out.println(summary);
    }
}