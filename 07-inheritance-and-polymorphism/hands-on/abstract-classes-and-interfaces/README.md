# Hands-on: Abstract Classes and Interfaces

## Question 1: Abstract Employee

**Objective:** Practice abstract classes, inheritance, constructor chaining, abstract methods, method overriding, and runtime polymorphism.

### Requirements

**Create an abstract class `Employee`.**

Fields:
- `name`
- `employeeId`

Constructor:
- Initialize both fields.

Methods:
- Implement `displayInfo()`.
- Declare an abstract method `calculateSalary()`.

**Subclasses**

`FullTimeEmployee`
- Additional field: `monthlySalary`.
- Implement `calculateSalary()`.

`PartTimeEmployee`
- Additional fields: `hourlyWage` and `hoursWorked`.
- Implement `calculateSalary()`.

**Main Method**

- Create one `FullTimeEmployee` object.
- Create one `PartTimeEmployee` object.
- Store both using `Employee` references.
- Display employee information.
- Display each employee's calculated salary.

## Question 2: Payment System Interface

**Objective:** Practice interfaces, the `implements` keyword, method overriding, interface references, and runtime polymorphism.

### Requirements

**Interface: `Payable`**

Method:
- `pay(double amount)`

**Classes**

Create three unrelated classes that implement `Payable`:
- `CreditCard`
- `UPIWallet`
- `GiftCard`

Each class should provide its own implementation of `pay()`.

**Main Method**

- Create one object of each class using `Payable` references.
- Invoke `pay()` on each object.
- Demonstrate runtime polymorphism.

## Question 3: Multiple Interfaces

**Objective:** Practice implementing multiple interfaces and understanding interface reference types.

### Requirements

**Create two interfaces:**
- `Printable`
- `Loggable`

Methods:
- `print()`
- `log()`

**Class**

Create a class `Invoice` that implements both `Printable` and `Loggable`. Implement both methods.

**Main Method**

- Store an `Invoice` object in a `Printable` reference and call `print()`.
- Store an `Invoice` object in a `Loggable` reference and call `log()`.
- Also create an `Invoice` reference and call both methods.
- Observe which methods are accessible through each reference type.