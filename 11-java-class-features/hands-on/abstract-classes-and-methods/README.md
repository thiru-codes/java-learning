# Hands-on: Abstract Classes and Methods

1. **Food Delivery System**

   **Goal:** Understand abstract classes, abstract methods, concrete methods, and method overriding.

   **Task:**
   - Create an abstract class `Order` with common order details such as order ID, order date, item names, and quantities.
   - Declare an abstract method `printReceipt()`.
   - Create a concrete method `nextOrderPrompt()` to display a message after an order.
   - Create subclasses `OnlineOrder`, `RestaurantOrder`, and `GroceryOrder`.
   - Override `printReceipt()` in each subclass to display the respective order details.
   - Override `nextOrderPrompt()` in `RestaurantOrder`.
   - Create objects using `Order` references and invoke `printReceipt()` to demonstrate polymorphism.

   **File:** `FoodDeliverySystem.java`