# Wrapper Classes

## Question 1: Score Verification

Write a method called `verifyScore` that takes an `Integer` object parameter representing a game score.

- Check if the score is greater than or equal to `100`.
- Check if the score matches the absolute maximum value that a standard Java `Integer` can hold.
- Return `true` if it passes both checks, and `false` otherwise.

**Important:** Make sure your comparison logic does not break or misbehave when comparing two separate `Integer` objects that both contain a score of `200`. Compare their values rather than relying on object identity.

---

## Question 2: The Safe Calculator

Write a method called `calculateTotal` that takes:

- A `String` representing a price.
- An `Integer` representing a quantity.

Requirements:

- Convert the `String` price into a primitive `double`.
- Safely multiply the price by the quantity to find the total cost.
- If the `Integer` quantity passed into the method is `null`, safely return `0.0` instead of causing an exception.