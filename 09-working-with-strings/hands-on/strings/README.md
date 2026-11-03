# Hands-on: Strings

1. **String Creation and Object Comparison**

   **Goal:** Understand how String objects are created and stored in Java.

   **Task:**
   - Create String objects using a string literal and the `new` keyword.
   - Create multiple references containing the same string value.
   - Use the `==` operator to compare the references.
   - Observe how String Pool and heap allocation affect object references.

   File: `StringCreation.java`

2. **Product Code Parser**

   **Goal:** Extract information from a formatted product code using String methods.

   **Task:**
   - Create a product code in the format `CATEGORY-YEAR-EDITION` (e.g., `LAPTOP-2026-PRO`).
   - Use the `split()` method to separate the product code into its individual parts.
   - Display the category, year, and edition separately.

   File: `ProductCodeParser.java`

3. **User Registration**

   **Goal:** Validate and normalize a username using String methods.

   **Task:**
   - Ask the user to enter a username.
   - Remove leading and trailing whitespace using `trim()`.
   - Convert the username to lowercase using `toLowerCase()`.
   - Check whether the username is empty using `isEmpty()`.
   - Throw an `IllegalArgumentException` if the username is empty.
   - Display a welcome message with the validated username.

   File: `UserRegistration.java`

4. **Email Validation**

   **Goal:** Validate an email address using String methods.

   **Task:**
   - Ask the user to enter an email address.
   - Check whether the email contains `@` using `contains()`.
   - Check whether the email ends with `.com` using `endsWith()`.
   - Throw an `IllegalArgumentException` if either condition is not satisfied.
   - Display whether the email address is valid.

   File: `EmailValidate.java`