# Hands-on: StringBuilder and StringBuffer

1. **String vs StringBuilder**

   **Goal:** Understand the difference between immutable Strings and mutable StringBuilder objects.

   **Task:**
   - Create an empty String and concatenate `"Hello"`, a space, `"A"`, and `"!"` to it.
   - Create an empty `StringBuilder` and append the same values.
   - Observe how String concatenation and StringBuilder modification differ in terms of object creation and reassignment.

   File: `StringVsStringBuilder.java`

2. **StringBuilder Methods**

   **Goal:** Manipulate StringBuilder objects using their built-in methods.

   **Task:**
   - Create a `StringBuilder` initialized with `"Core"`.
   - Append `" Java"` and `" Training"` using `append()`.
   - Remove specified portions of the resulting string using `delete()`.
   - Create another StringBuilder initialized with `"Hello Java"`.
   - Replace `"Hello"` with `"Core"` using `replace()`.
   - Display the results after each operation.

   File: `StringBuilderMethods.java`

3. **StringBuffer Practice**

   **Goal:** Manipulate mutable character sequences using StringBuffer.

   **Task:**
   - Create a `StringBuffer` to store server log messages.
   - Append messages indicating that the server started, a user logged in, and a user logged out.
   - Display the log.
   - Locate the last occurrence of `"logged"` using `lastIndexOf()`.
   - Replace the text from that position to the end of the log with `"disconnected"` using `replace()`.
   - Display the modified log.

   File: `StringBufferPractice.java`

4. **Bank Statement Generator**

   **Goal:** Generate and modify a formatted bank statement using StringBuilder.

   **Task:**
   - Create a `StringBuilder` to generate a bank statement.
   - Include the account holder, account number, deposit, withdrawal, and current balance.
   - Display the original statement.
   - Locate the account holder's name and replace it with another name using `replace()`.
   - Locate the withdrawal entry and remove it using `delete()`.
   - Display the modified statement.

   File: `BankStatementGenerator.java`