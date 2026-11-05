# Module 10: Assessment

1. **Library Management System**

   Write a Java program to manage books in a library.

   - Create class `Book` with private fields.
   - Create subclasses `PrintedBook` and `EBook`.
   - Each book should have an `Author` object (composition).
   - Override `equals()`, `hashCode()`, and `toString()`.
   - Create immutable class `ISBN`.
   - Create singleton class `Library`.
   - Use static variable for total books.
   - Use static block to initialize library name.

   File: `LibraryManagement.java`

2. **Banking System**

   Write a Java program to implement a banking application.

   - Create base class `Account`.
   - Create subclasses `SavingsAccount` and `CurrentAccount`.
   - `Account` should have `Customer` object (composition).
   - Use polymorphism for `withdraw()`.
   - Override `equals()`, `hashCode()`, and `toString()`.
   - Create immutable class `Transaction`.
   - Create singleton class `BankDatabase`.
   - Use static variable for bank name.
   - Use static block for interest rate.
   - Use static method to calculate interest.

   File: `BankingSystem.java`
