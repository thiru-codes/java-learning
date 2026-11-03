# Hands-on: Passing Values and References

## Question 1: Product Price Updater (Passing Primitives and Object References)

**Goal:** Understand how changes made to primitive values and objects inside methods affect the original variables and objects.

**Task:**
- Create a `Product` class with a `double price` variable, a constructor to initialize it, and getter and setter methods.
- Create a `PriceTester` class with two methods:
  - `updatePrice(double price)`: Increase the received price by 10%.
  - `updateProduct(Product prod)`: Increase the product's price by 10% using its setter and getter methods.
- In the main method, create a primitive `double` variable and a `Product` object, both initialized with the same price.
- Pass the primitive variable and the product object to their respective methods.
- Display the values before and after each method call. Observe the difference in how primitive values and object references behave when passed to methods.