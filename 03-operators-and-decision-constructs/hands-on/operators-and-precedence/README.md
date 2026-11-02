# Operators and Precedence

## Question 1: Calculate Total with Discount and Tax

Write a method `public double calculateTotal(double price, int quantity, double discountCap)` that:

1. Multiplies `price` and `quantity`.
2. Subtracts `discountCap` from the total.
3. Applies a 5% tax (`* 1.05`) to the result of the subtraction.

**Constraint:** Use a single mathematical expression and parentheses to ensure the subtraction happens before the tax multiplication.

---

## Question 2: Validate Score and Bonus

Write a method `public boolean isValid(int score, int bonus)` that returns `true` if:

1. `score` is between 0 and 100, inclusive.
2. `bonus` is either exactly 5 or exactly 10.

**Constraint:** Combine all conditions into a single `return` statement using logical operators (`&&`, `||`) and parentheses to group the bonus conditions.

---

## Question 3: Prefix Increment and Compound Assignment

Write a short code snippet or method where you:

1. Start with `int energy = 4`.
2. Increment `energy` using a prefix operator.
3. Use a compound assignment operator (`*=`) to multiply `energy` by itself after the increment.

The intended final value is `25`.

---

## Question 4: Convert Seconds into Hours, Minutes, and Seconds

Given an initial variable `totalSeconds` representing a duration in seconds, calculate:

1. The number of full hours.
2. The number of full minutes remaining after accounting for hours.
3. The number of seconds remaining after accounting for hours and minutes.

Store the results in the provided variables:

- `hours`
- `minutes`
- `seconds`

A helper variable `remainingSecondsAfterHours` is also provided to help break down the calculation.