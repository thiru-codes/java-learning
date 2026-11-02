# Primitive vs Reference Variables

## Question 1: The Independent Mutator (Primitives)

Write a class called `PrimitiveTest`.

Inside the `main` method:

- Declare an integer variable named `originalScore` and set it to `100`.
- Declare a second integer variable named `copiedScore` and assign `originalScore` to it.
- Modify `copiedScore` by adding `50` to it.
- Print both `originalScore` and `copiedScore`.

**Goal:** Write a small comment block in your code explaining why `originalScore` did or did not change based on the printed results.

---

## Question 2: The Co-dependent Mutator (Reference Variables)

Assume you have a simple class named `Box` that tracks a value:

```java
class Box {
    int contentValue;
}
```

Write a main execution method where you:

- Create a new instance of `Box` using `Box boxA = new Box()` and set its `contentValue` to `500`.
- Declare a second variable `Box boxB` and assign `boxA` to it.
- Change the value inside the box to `999` (e.g., `boxB.contentValue = 999`).
- Print `boxA.contentValue`.

---

## Question 3: Nullifying the Reference

Using the same `Box` class from Question 2:

- Instantiate a box: `Box sampleBox = new Box()` and assign its `contentValue` to `25`.
- Declare a second box variable `Box referenceBox` and point it to `sampleBox`.
- Sever the reference of the second variable by setting it to `null`: `referenceBox = null`.
- Print `sampleBox.contentValue`.

**Goal:** Determine whether this line will cause a `NullPointerException`. Include a comment explaining why or why not.