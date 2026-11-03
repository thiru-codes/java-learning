# Hands-on: Static Members

## Question 1: Employee Counter (Static Variables)

**Goal:** Understand how static variables are shared among all objects of a class.

**Task:**
- Create an `Employee` class with a static variable `employeeCount` and an instance variable `name`.
- Create a constructor that accepts an employee name, initializes the instance variable, and increments `employeeCount` whenever a new object is created.
- Display the employee count by accessing the static variable through the class name and through each object. Observe how all objects share the same static variable.

## Question 2: Currency Converter (Static Methods)

**Goal:** Understand how static methods can be called without creating an object.

**Task:**
- Create a `BankUtils` class with an instance variable `accountBalance`.
- Create a static method named `convertUsdToInr(double usdAmount)` that converts a given USD amount into INR.
- In the main method, call the static method using the class name and display the result without creating an object.

## Question 3: Server Connection Tracker (Static and Instance Methods)

**Goal:** Understand how instance methods can interact with static variables, while static methods cannot directly access instance variables or methods.

**Task:**
- Create a `ServerTracker` class with a static variable `activeConnections`.
- Create an instance method named `connectUser()` that increments the active connection count and displays the updated count.
- Create a static method named `resetTracker()` that resets the active connection count to zero.
- In the main method, create two `ServerTracker` objects and call `connectUser()` on both objects.
- Call `resetTracker()` using the class name and display the updated connection count.