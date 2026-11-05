# Hands-on: Singleton and Immutable Classes

1. **Configuration Manager Singleton**

   **Goal:** Create a class that provides access to one shared instance.

   **Task:**
   - Make the `ConfigurationManager` constructor private.
   - Store the single instance in a private static field.
   - Provide a public static `getInstance()` method.
   - Access the same instance from more than one class.
   - Compare the returned references to verify that they refer to the same object.

   File: `SingletonPractice.java`

2. **Immutable Employee**

   **Goal:** Design a class whose state cannot be changed after construction.

   **Task:**
   - Make the `Employee` class final.
   - Declare its fields private and final.
   - Initialize all fields through the constructor.
   - Provide getters, but do not provide setters or methods that change the fields.

   File: `ABetterImmutableClassExample.java`

3. **Immutable Person**

   **Goal:** Practice using final fields and read-only accessors.

   **Task:**
   - Create a `Person` class with `name` and `age` fields.
   - Declare both fields private and final.
   - Initialize them in the constructor and provide getters only.
   - Observe that the class has no setters.

   File: `ImmutablePractice.java`

   `ImmutablePractice.java` currently contains the `Person` class but its `main()` method is empty, so it compiles but does not yet demonstrate creating or reading a `Person` object.
