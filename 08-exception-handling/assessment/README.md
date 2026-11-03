# Assessment: Exception Handling

1. **Array Index Validation**

   Write a program that:
   - Creates an integer array of size 5.
   - Asks the user to enter an index.
   - Prints the value at that index.
   - Handles `ArrayIndexOutOfBoundsException` properly.

   (Array Index Validation)

2. **Number Format Check**

   Write a program that:
   - Takes a string input from the user.
   - Converts it to an integer using `Integer.parseInt()`.
   - Handles `NumberFormatException` if input is not a valid number.

   (Number Format Exception)

3. **Online Shopping Payment System**

   Create a program that:
   - Validates:
     - Card number length (16 digits).
     - CVV (3 digits).
     - Amount greater than 0.
   - Creates custom exceptions for:
     - `InvalidCardException`
     - `InvalidAmountException`
   - Uses proper exception hierarchy.

   (Custom Unchecked Exceptions)

4. **Student Result Processing System**

   Create a system that:
   - Reads marks of 5 subjects.
   - Throws a custom exception if:
     - Any mark is less than 0 or greater than 100.
   - Calculates the average.
   - If the average is less than 40, throws `FailException`.

   Use:
   - Try-with-resources (if using input).
   - Custom exception classes.
   - Proper exception chaining.

   (Custom Exceptions and Exception Chaining)