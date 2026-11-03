# Hands-on: Type Casting

## Question 1: Zoo Management System

### Problem Statement

A zoo wants to maintain information about different animals.

Design a Java program that demonstrates the use of **inheritance, method overriding, parent references, casting, and `instanceof`**.

### Requirements

- Create a base class representing a generic animal.
- Create a subclass representing a dog.
- The dog should provide its own implementation of making a sound.
- The dog should also have a method that is not present in the base class.
- In the `main()` method:
  - Store a dog object using a parent reference.
  - Demonstrate runtime polymorphism.
  - Safely access the dog-specific method using casting.
  - Ensure your program avoids `ClassCastException`.

## Question 2: Employee Management System

### Problem Statement

A company wants to manage different types of employees.

Design a Java program that demonstrates **compile-time polymorphism, runtime polymorphism, and casting**.

### Requirements

- Create a base class representing an employee.
- Create a subclass representing a manager.
- Override one method in the manager class.
- Overload another method in the manager class.
- In the `main()` method:
  - Store a manager object using a parent reference.
  - Demonstrate runtime polymorphism.
  - Safely cast the parent reference back to a manager.
  - Call the manager-specific overloaded method after casting.
