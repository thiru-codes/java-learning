# Hands-on: Super and This

## Question 1: Accessing the Current Object Using `this`

**Focus:** The `this` keyword, accessing current object fields, and calling superclass constructors using `super()`.

**Your Task:**

1. Create a `Person` class with a field `name` of type `String`.
2. Create a parameterized constructor that accepts `name` and initializes the field using `this.name`.
3. Create a `Student` subclass that extends `Person`. Add an integer field `rollNumber`.
4. Create a parameterized constructor in `Student` that accepts `name` and `rollNumber`.
   - Call the parent constructor using `super(name)`.
   - Initialize `rollNumber` using `this.rollNumber`.
5. Add a `display()` method that prints the student's name and roll number using `this`.
6. In the `main()` method, create a `Student` object and call `display()`.

## Question 2: Constructor Chaining Using `this()`

**Focus:** Calling another constructor in the same class using `this()` and avoiding repeated initialization code.

**Your Task:**

1. Create a `Product` class with fields `name` (`String`), `price` (`double`), and `quantity` (`int`).
2. Create a constructor that accepts all three values and initializes the fields.
3. Create another constructor that accepts only `name` and `price`.
   - Use `this()` to call the three-parameter constructor.
   - Set the default quantity to `1`.
4. Create a no-argument constructor that uses `this()` to call another constructor with suitable default values.
5. In the `main()` method, create objects using all three constructors and display their details.

## Question 3: Constructor Chaining Using `super()`

**Focus:** Superclass constructor execution, the `super()` keyword, and initializing inherited and subclass fields.

**Your Task:**

1. Create an `Employee` parent class with a parameterized constructor that accepts and assigns an `employeeId` (`String`). Do not create a default (no-argument) constructor.
2. Create a `Manager` subclass that extends `Employee`. Add a unique field `department` (`String`).
3. Write the constructor for `Manager` so that it safely passes `employeeId` to the parent constructor using `super()`, while also correctly initializing its own `department` field.
4. Add a method to display the employee ID and department.
5. In the `main()` method, create a `Manager` object and display its information.
6. **Self-Check:** Try removing the `super()` call from your `Manager` constructor. What compiler error do you get? Why does Java require the parent constructor to execute first?

## Question 4: Constructor Chaining and State Safety

**Focus:** Superclass constructor execution, the `super()` keyword, and preventing an incomplete or unstable state for subclass fields.

**Scenario:**

A company wants to maintain employee information. Every employee has an employee ID, while managers also have a department. The parent constructor must initialize the employee ID, and the child constructor must initialize its own department.

**Your Task:**

1. Create an `Employee` parent class. It must have a parameterized constructor that takes and assigns an `employeeId` (`String`). It should not have a default (no-argument) constructor.
2. Create a `Manager` subclass that extends `Employee`. A manager has a unique field `department` (`String`).
3. Write the constructor for `Manager` so that it safely passes the `employeeId` to the parent constructor using `super()`, while also correctly initializing its own `department` field.
4. **Self-Check:** Try removing the `super()` call from your `Manager` constructor. What compiler error do you get? Why does Java force you to put `super()` on the very first line?