# Hands-on: Loop Comparison

## 1. The Conversion Challenge

Take a simple program you have already written, such as the Countdown program, and implement it three separate times using:

- A `for` loop.
- A `while` loop.
- A `do-while` loop.

**Goal:** Compare the three loop constructs and observe how initialization, condition checking, and updating are handled in each structure.

## 2. Loop Selection in Different Scenarios (`UseCases.java`)

Write a Java program that demonstrates when to use each of the three loop constructs.

Implement the following scenarios:

**A. Printing a Pattern (`for` loop)**

- Ask the user how many rows they want.
- Use nested `for` loops to print a right-angled triangle of asterisks (`*`).

**Example for 4 rows:**

```text
*
**
***
****
```

**B. Account Withdrawal (`while` loop)**

- Initialize a bank balance to `100000`.
- Continue asking the user to enter a withdrawal amount while the balance is greater than zero.
- Deduct each withdrawal amount from the balance.
- Print `"Amount withdrawn"` when the loop terminates.

**C. PIN Verification (`do-while` loop)**

- Set the correct PIN to `1234`.
- Prompt the user to enter their PIN.
- Continue prompting until the correct PIN is entered.
- Print `"Access Granted!"` once the correct PIN is entered.

**Goal:** Understand how different loop constructs suit different repetition requirements.

## 3. Zero Iteration: `while` vs `do-while` (`ZeroIterationTest.java`)

Write a Java program that:

- Declares and initializes `int x = 5`.
- Uses a `while` loop with the condition `x > 100` to print a message inside the loop.
- Uses a `do-while` loop with the same condition to print another message inside the loop.
- Observes how many times each loop executes.

**Goal:** Understand why a `while` loop may execute zero times, whereas a `do-while` loop always executes its body at least once.