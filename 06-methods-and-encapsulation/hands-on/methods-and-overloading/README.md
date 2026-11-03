# Hands-on: Method Overloading

## Question 1: Geometry Calculator (Basic Method Overloading)

**Goal:** Understand how methods can share the same name with different parameter lists.

**Task:**
- Create a `ShapeCalculator` class with overloaded `calculateArea()` methods to calculate the area of a square, rectangle, and circle.
- Call each method with appropriate arguments and display the results.

## Question 2: Order Processor (Method Overloading with Parameter Order)

**Goal:** Understand how changing the order of parameter types creates overloaded methods.

**Task:**
- Create an `OrderSystem` class with two overloaded `processOrder()` methods:
  - A public method that accepts an `int orderId` and a `double price`, returning a confirmation message.
  - A private method that accepts a `double price` and an `int orderId`, returning a boolean.
- Create a public method to call the private method and display its result.
- Test both methods in the main method.

## Question 3: Notification Dispatcher (Automatic Type Promotion)

**Goal:** Understand how Java selects overloaded methods through automatic type promotion.

**Task:**
- Create a `NotificationService` class with two overloaded `send()` methods: one accepting a `String` and `double`, and another accepting a `String` and `long`.
- Call `send()` with a `String` and an integer argument.
- Observe which overloaded method Java selects and understand why.