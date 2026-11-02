# Variable Declaration and Type Casting

## Question 1: The Lossless Precision Checker

Write a method `isLosslessCast(double val)` that returns a `boolean`.

It should determine whether the given `double` value can be cast to an `int` without losing data integrity (no decimal truncation and no integer overflow).

**Examples:**
- `5.0` → `true`
- `5.7` → `false`
- `3000000000.0` → `false` (too large for an `int`)

---

## Question 2: Safe Average Calculator

Write a method `calculateAverage(int totalSum, int itemCount)` that returns a `double`.

Calculate the exact average while keeping decimal values intact, without changing the input parameters to `double`.

If `itemCount` is `0`, safely return `0.0`.

---

## Question 3: Bitwise Truncation Emulation

Write a method `convertToShort(long bigNumber)` that returns a `short`.

- Explicitly cast the `long` value to a `short`.
- Include a print statement inside the method that outputs the resulting value.
- Return the resulting value.