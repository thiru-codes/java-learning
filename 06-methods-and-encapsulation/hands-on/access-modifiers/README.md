# Hands-on: Access Modifiers

## Question 1: The Account Vault (Private vs Public Access)

**Goal:** Understand how `private` restricts access to a class and how `public` provides an accessible interface.

**Task:**
- Create a class named `BankVault`.
- Add a private instance variable: `double cashBalance`.
- Add a constructor to initialize the balance.
- Create a public method named `deposit(double amount)` that increases the balance only if the amount is positive.
- In the main method, create a `BankVault` object and try to directly modify `cashBalance`.
- Observe the compilation error and use the public `deposit()` method instead.

## Question 2: The Package Boundary (Default / Package-Private Access)

**Goal:** Understand how default access restricts visibility to classes within the same package.

**Task:**
- Create a package named `billing` with a class named `Invoice`. Do not specify an access modifier for the class or its method `printInvoice()`.
- Create another package named `shipping` with a class named `DeliveryManager` containing a main method.
- Try to import and instantiate `Invoice` inside `DeliveryManager`.
- Observe the compilation error and identify why the class cannot be accessed from another package.

## Question 3: The Restricted Subclass (Protected Access)

**Goal:** Understand how `protected` members can be accessed across packages through inheritance.

**Task:**
- Create a package named `parent` with an `Employee` class containing a protected variable `salary`.
- Create a package named `child` with a `Manager` class that extends `parent.Employee`.
- Inside a method in `Manager`, try to access and display the inherited `salary` variable using `this.salary`.
- Create a third package named `stranger` with an `Auditor` class.
- Inside `Auditor`, create an `Employee` object and try to access `emp.salary`.
- Observe why access works in the subclass but fails in the unrelated class.