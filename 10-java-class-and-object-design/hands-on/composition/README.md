# Hands-on: Composition

1. **Computer Composition**

   **Goal:** Understand how a class can be composed of objects of other classes.

   **Task:**
   - Create component classes named `Processor` and `Keyboard`.
   - Create a `Computer` class that contains references to a `Processor` and a `Keyboard`.
   - Compare the different initialization approaches shown in the code: field initialization, creating components in the constructor, and constructor injection.
   - Call the component methods from the `Computer` class.

   Files: `CompositionDemo.java`

2. **Computer Composition with a Gaming Keyboard**

   **Goal:** Apply composition using separate classes and packages, while seeing how inheritance and `protected` access work with a component.

   **Task:**
   - Create a `Computer` using a `Processor` and a `Keyboard` supplied through its constructor.
   - Create a `GamingKeyboard` that extends `Keyboard` and overrides `type()`.
   - Use a `GamingKeyboard` as the keyboard component when creating a `Computer`.
   - Observe how `GamingKeyboard` accesses the inherited `protected` field and the public getter from its superclass.

   Files: `ClassDesign.java`, `Computer.java`, `Processor.java`, `Keyboard.java`, `GamingKeyboard.java`

   The Java files are arranged under `src/` according to their existing package declarations.
