# Hands-on: Reference and Object Types

## Question 1: Reference Type and Object Type – Field Access

**Focus:** Reference types, object types, inheritance, and field access.

**Your Task:**

1. Create a `Person` class with a field `name` initialized to `"John"`.
2. Create a `Student` subclass with an additional field `rollNo` initialized to `101`.
3. In the `main()` method:
   - Create a `Person` reference pointing to a `Student` object.
   - Access and print the `name` field.
   - Try accessing and printing `rollNo`.
4. Observe the compilation error and explain how the reference type affects field access.

## Question 2: Reference Type and Object Type – Method Access

**Focus:** Reference types, inherited methods, and subclass-specific method access.

**Your Task:**

1. Create an `Animal` class with a method `eat()` that prints `"Eating"`.
2. Create a `Dog` subclass with a method `bark()` that prints `"Barking"`.
3. In the `main()` method:
   - Create an `Animal` reference pointing to a `Dog` object.
   - Call the inherited `eat()` method.
   - Try calling the `bark()` method using the same reference.
4. Observe the compilation error and explain why the subclass-specific method cannot be accessed through the parent reference.

## Question 3: Accessing Inherited and Subclass Members

**Focus:** Reference-type restrictions when accessing inherited and subclass-specific fields and methods.

**Your Task:**

1. Create a `Vehicle` class with:
   - A field `brand` initialized to `"Toyota"`.
   - A method `start()` that prints `"Vehicle Started"`.
2. Create a `Car` subclass with:
   - An additional field `model` initialized to `"Corolla"`.
   - A method `displayModel()` that prints the model.
3. In the `main()` method:
   - Create a `Vehicle` reference pointing to a `Car` object.
   - Print the `brand` field.
   - Call the `start()` method.
   - Try accessing the `model` field and calling `displayModel()` using the same reference.
4. Observe the compilation errors and explain which members are accessible through the parent reference.

## Question 4: Field Hiding and Static Method Hiding

**Focus:** Field hiding, static method hiding, and compile-time binding.

**Your Task:**

1. Create an `Account` class with:
   - A public field `accountTier` initialized to `"Standard"`.
   - A static method `printTerms()` that prints `"Standard Terms"`.
2. Create a `PremiumAccount` subclass with:
   - A public field `accountTier` initialized to `"Premium"`.
   - A static method `printTerms()` that prints `"Premium Terms"`.
3. In the `main()` method:
   - Create an `Account` reference pointing to a `PremiumAccount` object.
   - Print `accountTier` and call `printTerms()` using that reference.
   - Create a `PremiumAccount` reference pointing to a `PremiumAccount` object.
   - Print `accountTier` and call `printTerms()` again.
4. Observe how field access and static method calls differ from overridden instance methods.

## Question 5: Understanding Inherited Fields and Static Methods

**Focus:** Inherited fields, constructor assignment, and static method hiding.

**Your Task:**

1. Create an `Account` class with:
   - A public field `accountTier` initialized to `"Standard"`.
   - A static method `printTerms()` that prints `"Standard Terms"`.
2. Create a `PremiumAccount` subclass with a constructor that assigns `"Premium"` to the inherited `accountTier` field using `this`.
3. Add a static method `printTerms()` that prints `"Premium Terms"`.
4. In the `main()` method:
   - Create an `Account` reference pointing to a `PremiumAccount` object.
   - Print `accountTier` using the reference.
   - Call `Account.printTerms()`.
   - Create a `PremiumAccount` reference pointing to a `PremiumAccount` object.
   - Print `accountTier` and call `PremiumAccount.printTerms()`.
5. Compare the results with the previous exercise and explain why the inherited field behaves differently from a hidden field.

## Question 6: The Root `Object` Class – Method Overrides

**Focus:** Overriding `toString()` and `equals(Object obj)` to replace default reference-based behaviour with meaningful content comparison.

**Scenario:**

By default, Java's `Object` class uses reference comparison for `equals()` and a hexadecimal hash code as part of the output of `toString()`. Override these methods to compare and display actual object data.

**Your Task:**

1. Create a `Product` class with fields `productCode` (`String`) and `price` (`double`).
2. Override the `toString()` method so that instead of printing something like `Product@1a2b3c4f`, it returns a clean string:

   `"Product [Code: XYZ, Price: $99.99]"`

3. Override the `equals(Object obj)` method. It must return `true` if the object being compared is also a `Product` and has the exact same `productCode`.
4. Write a `main()` method to test this:
   - Create two different instances of `Product` but give them the exact same `productCode`.
   - Test them using `System.out.println(p1.equals(p2))`.
   - It should print `true`.