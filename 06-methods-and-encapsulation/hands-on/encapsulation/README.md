# Hands-on: Encapsulation

## Question 1: The Secure Bank Account (Data Validation)

**Goal:** Protect sensitive variables and use setters to block invalid data inputs.

**Task:**
- Create a class named `BankAccount`.
- Add two private variables: `String accountNumber` and `double balance`.
- Provide a constructor to initialize both fields.
- Write public getters for both variables.
- Write a public setter for `balance`. Inside the setter, add an `if` statement to check if the new balance is negative. If it is negative, print an error message and do not update the field.
- Test this in a main method by attempting to set a negative balance.

## Question 2: The Immutable Student Profile (Read-Only Fields)

**Goal:** Learn how to make specific fields read-only to prevent unauthorized modification.

**Task:**
- Create a class named `Student`.
- Add two private variables: `int studentId` and `String email`.
- Create a constructor that requires both variables.
- Provide public getters for both fields.
- Provide a public setter only for `email`. Do not write a setter for `studentId`.
- In a main method, try to change the `studentId` after object creation to see how the missing setter makes it unchangeable through the class's public interface.

## Question 3: The Smart Thermostat (Hiding Implementation Details)

**Goal:** Hide how data is stored internally while allowing external users to interact with it differently.

**Task:**
- Create a class named `SmartThermostat`.
- Add a private variable: `double temperatureInCelsius`.
- Write a public getter and setter for `temperatureInCelsius`.
- Write a custom getter named `getTemperatureInFahrenheit()`. It should calculate and return the value in Fahrenheit using the formula: `(celsius * 9 / 5) + 32`.
- Write a custom setter named `setTemperatureInFahrenheit(double fahrenheit)`. It should convert the input value back to Celsius using the formula: `(fahrenheit - 32) * 5 / 9` and store it in your private variable.
- In main, set the temperature using Fahrenheit, but read it back using Celsius to verify the internal translation works.