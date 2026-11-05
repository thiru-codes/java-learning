# Hands-on: Overriding Object Class Methods

1. **Product Equality and Object Representation**

   **Goal:** Override `equals()`, `hashCode()`, and `toString()` in a custom class.

   **Task:**
   - Create a `Product` class with a product code, name, and price.
   - Override `equals()` so products are considered equal when their product codes match.
   - Override `hashCode()` using the same equality-related field.
   - Override `toString()` to display the product details.
   - Test comparisons with `null`, the same reference, another `Product`, and an unrelated object.
   - Observe the relationship between `equals()` and `hashCode()`.

   File: `ObjectClassMethodsOverrideDemo.java`

2. **Book Equality and Object Representation**

   **Goal:** Practice defining object equality using a unique identifier.

   **Task:**
   - Create a `Book` class with ISBN, title, author, and price fields.
   - Override `equals()` and `hashCode()` so the ISBN determines equality.
   - Override `toString()` to display the book details in a readable format.
   - Compare books with matching and different ISBN values, and compare a book with `null` and an unrelated object.

   File: `OverridePractice.java`

   In both examples, the field used by `equals()` is also used by `hashCode()`, so equal objects produce the same hash code.
