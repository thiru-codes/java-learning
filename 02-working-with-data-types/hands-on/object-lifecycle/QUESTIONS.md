# Object Lifecycle

## Question 1: Triggering Eligibility via Reassignment

Write a class called `LifecycleTest`.

Inside its `main` method:

- Create a simple custom object (you can declare a dummy inner class `Target {}`).
- Instantiate two instances of `Target`: one called `t1` and one called `t2`.
- Perform a reference reassignment so that the object originally created for `t1` becomes immediately eligible for garbage collection.
- Write a brief comment above that specific line of code identifying it as the exact moment the object becomes eligible.

---

## Question 2: The Lost Object Trap

Write a main method execution where you instantiate an object of your choosing using the `new` keyword, but instantly make it eligible for garbage collection on the exact same line of code, without ever assigning it to a reference variable.

**Hint:** Think about calling a method directly on an anonymous object creation.

---

## Question 3: Scope Isolation

Create a class named `ScopeDemo`.

Write a method named `buildAndForget()`.

Inside this method:

- Create an instance of an object (e.g., `Object dummy = new Object()`).

In your `main` method:

- Call `buildAndForget()`.
- Provide a print statement immediately after the method call.
- Write a comment explaining whether the object created inside `buildAndForget()` is eligible for garbage collection by the time the print statement executes.