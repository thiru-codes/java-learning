# Hands-on: Final Keyword

1. **Food Delivery System**

   **Goal:** Understand how the `final` keyword restricts changes to variables, methods, and classes.

   **Task:**
   - Use `final` for the `order` and `quantity` array references in the `Order` class.
   - Observe that a final array reference cannot be reassigned, although its elements can still be modified.
   - Declare `nextOrderPrompt()` as `final` to prevent subclasses from overriding it.
   - Declare `GroceryOrder` as `final` to prevent other classes from extending it.
   - Observe how these restrictions affect the class hierarchy and its methods.

   **File:** `FoodDeliverySystem.java`