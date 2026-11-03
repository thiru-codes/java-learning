# Hands-on: Method Overriding and Polymorphism

## Question 1: Basic Method Overriding

**Focus:** Method overriding, inheritance, and the `@Override` annotation.

**Scenario:**

You are creating a simple animal behaviour system. Different animals make different sounds, but they share a common method for producing a sound.

**Your Task:**

1. Create an `Animal` superclass with a method `sound()` that prints `"Animal makes a sound"`.
2. Create a `Dog` subclass that extends `Animal`.
3. Override the `sound()` method in `Dog` to print `"Dog barks"`.
4. In the `main()` method, create an `Animal` reference pointing to a `Dog` object and call `sound()`.

Observe the output and understand why the overridden method is executed.

## Question 2: The "IS-A" Relationship and Reusability

**Focus:** `extends` keyword, reusability, adding unique subclass features, and method overriding.

**Scenario:**

You are building a system for a logistics company. All transport units have an identification number and a maximum weight capacity. However, trucks also have a specific number of axles, while cargo planes have a maximum flight altitude.

**Your Task:**

1. Create a `Vehicle` superclass with fields for `id` (`String`) and `maxWeight` (`double`). Include a method `displayDetails()` that prints these fields.
2. Create a `Truck` subclass that extends `Vehicle`. Add a unique field `axleCount` (`int`). Override `displayDetails()` to print the ID, weight, and axle count.
3. Create a `CargoPlane` subclass that extends `Vehicle`. Add a unique field `maxAltitude` (`int`). Override `displayDetails()` to print the ID, weight, and maximum altitude.
4. In the `main()` method, create objects of both subclasses, assign their fields, and call `displayDetails()`.

## Question 3: Combining Method Overriding and Overloading

**Focus:** Runtime polymorphism, method overriding, and compile-time polymorphism through method overloading.

**Scenario:**

You are developing a banking system where different account types can process deposits differently. A savings account should provide its own deposit behaviour while also supporting deposits with additional transaction information.

**Your Task:**

1. Create a `BankAccount` class with a method `deposit(double amount)` that prints the deposited amount.
2. Create a `SavingsAccount` subclass that overrides `deposit(double amount)` to display a savings-account-specific message.
3. In `SavingsAccount`, overload the `deposit()` method to accept both `double amount` and `String transactionDescription`. Display both values.
4. In the `main()` method:
   - Create a `BankAccount` reference pointing to a `SavingsAccount` object.
   - Create a separate `SavingsAccount` object.
   - Call the overridden method using the parent reference.
   - Call both overloaded methods using the child reference.

Observe the difference between method overriding and method overloading.

## Question 4: Overriding and Overloading with Different Parameters

**Focus:** Method signatures, overriding, overloading, and polymorphism.

**Scenario:**

You are developing a grading system where undergraduate and postgraduate students display their grades differently. Postgraduate students should also be able to display grades alongside their course names.

**Your Task:**

1. Create a `Student` class with a method `displayGrade(int[] grades)` that prints the student's grades.
2. Create a `PostGraduate` subclass that overrides `displayGrade(int[] grades)` with a different heading.
3. Overload `displayGrade()` in `PostGraduate` to accept `String[] courses` and `int[] grades`. Display each course alongside its corresponding grade.
4. In the `main()` method:
   - Create a `Student` reference pointing to a `PostGraduate` object.
   - Call `displayGrade()` using an integer array.
   - Create a separate `PostGraduate` object.
   - Call the overloaded method using course names and grades.

## Question 5: Notification System

**Focus:** Runtime polymorphism and method overloading.

**Scenario:**

You are building a notification system that supports different ways of sending messages. The default notification is a push notification, while email notifications provide a different message format and can also include a recipient's username.

**Your Task:**

1. Create a `Notification` class with a method `send(String message)` that displays a push notification message.
2. Create an `EmailNotification` subclass that overrides `send(String message)` to display an email notification.
3. Overload `send()` in `EmailNotification` to accept `String username` and `String message`. Display the recipient and message.
4. In the `main()` method:
   - Create a `Notification` reference pointing to an `EmailNotification` object.
   - Call `send()` using the parent reference.
   - Create an `EmailNotification` object and call the overloaded method.

Observe how the same method name can produce different behaviour depending on the method signature and object type.

## Question 6: Runtime Polymorphism and Reference Types

**Focus:** Parent references, child objects, method overriding, and reference-type restrictions.

**Scenario:**

You are developing an employee management system. All employees perform general work, but managers have additional responsibilities.

**Your Task:**

1. Create an `Employee` class with a method `work()` that prints `"Employee is working"`.
2. Create a `Manager` subclass that overrides `work()` to print `"Manager is managing the team."`.
3. Add a method `conductMeeting()` to `Manager` that prints `"Meeting in progress"`.
4. In the `main()` method:
   - Create an `Employee` reference pointing to a `Manager` object.
   - Call `work()` and observe which implementation executes.
   - Try calling `conductMeeting()` using the `Employee` reference.
   - Observe the compilation error and understand why the method cannot be accessed through that reference.