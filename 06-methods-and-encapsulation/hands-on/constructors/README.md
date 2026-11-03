# Hands-on: Constructors

1. Create a `UserAccount` class with a `username` variable. Define a no-argument constructor that initializes the username to `"Default"` and a parameterized constructor that accepts a username. Create objects using both constructors and display their usernames.

2. Create an `InventoryItem` class with `itemName`, `price`, and `stockQuantity` variables. Implement overloaded constructors that accept:
   - Item name only, with price and stock initialized to `0.0` and `0`.
   - Item name and price, with stock initialized to `10`.
   - Item name, price, and stock quantity.

   Create objects using all three constructors and display their inventory details.

3. Create a `SmartDevice` class with `brand`, `os`, and `batteryCapacity` variables. Implement a parameterized constructor that initializes all three variables and another constructor that accepts only the brand. Use `this()` to call the first constructor and assign default values of `"Android"` and `4000.0` for the remaining variables.

4. Create a `UserAccount` class with a `username` variable but do not define any constructor. Create an object without passing arguments and demonstrate how the compiler-provided default constructor is used.

5. Create a `Product` class with `name`, `price`, `stock`, and `category` variables. Implement four overloaded constructors that accept one, two, three, and four parameters respectively. Use `this()` to chain the constructors, passing default values for omitted parameters. Display the product details after creating an object using the constructor with only the product name.