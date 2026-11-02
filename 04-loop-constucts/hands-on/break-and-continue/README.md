# Hands-on: Break and Continue

## 1. The Secret Word / Safe Code (`break`)

Write a program using a `while (true)` loop that continually prompts the user to enter a passcode (an integer).

- If the user enters `9999`, print `"Access Granted"` and immediately terminate the loop using `break`.
- Otherwise, print `"Incorrect passcode, try again."` and continue prompting the user.

## 2. The Multiples Filter (`continue`)

Write a program that uses a loop to print numbers from 1 to 15.

- Use `continue` to skip numbers that are perfectly divisible by 5.
- Print all remaining numbers, each on a new line.

**Expected output:**

```text
1
2
3
4
6
7
8
9
11
12
13
14
```

## 3. The Restricted Adder (`break` and `continue`)

Write a program that repeatedly asks the user to enter numbers and maintains a running total.

Use a loop along with both control statements:

- If the user enters a negative number, use `continue` to skip adding it to the total and print `"Negative numbers skipped!"`.
- If the user enters `0`, use `break` to stop accepting input.
- At the end, print the final calculated sum.