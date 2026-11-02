# String and Object Equality

## Question 1: Reference vs Value Equality

Create a Java class named `ReferenceVsValueProof`.

Inside the `main` method:

- Declare a `String` variable `s1` and assign it the literal `"Java"`.
- Declare another `String` variable `s2` using `new String("Java")`.
- Compare both strings using the `==` operator.
- Compare both strings using the `equals()` method.
- Print the results of both comparisons.

**Goal:** Understand the difference between reference equality (`==`) and value equality (`equals()`).

---

## Question 2: Password Comparison

Create a Java class that contains a method:

`public boolean checkCredentials(String inputPassword, String correctPassword)`

The method should:

1. Return `false` if either parameter is `null`.
2. Compare the two passwords using the appropriate String comparison method.
3. Return `true` if the passwords match, and `false` otherwise.

In the `main` method:

- Define a correct password.
- Read a password from the user using `Scanner`.
- Create an instance of the comparison class.
- Call `checkCredentials()` and print the result.

**Goal:** Practice comparing String values correctly, even when the strings are created dynamically in memory.

---

## Question 3: Comparing User Objects

Create a class named `User` with:

- A `String username` field.
- An `int id` field.
- A constructor that initializes both fields.

Add a method:

`boolean isEquals(User u1, User u2)`

The method should:

1. Return `false` if either `u1` or `u2` is `null`.
2. Compare the `id` fields using `==`.
3. Compare the `username` fields using `equals()`.
4. Return `true` only if both fields match.

In the `main` method:

- Create two `User` objects.
- Assign values to their IDs and usernames.
- Call `isEquals()` and print the result.

**Goal:** Understand how to compare primitive fields and String fields inside objects.