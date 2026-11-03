# Hands-on: Inheritance Basics

## Question 1

Create a class named `Person` with:

- A field `name` of type `String`.
- A method `displayName()` that prints:

```text
Name: <name>
```

Create another class named `Student` that inherits from `Person`.

In the `main()` method:

- Create a `Student` object.
- Assign the name `"Alice"` to it.
- Call `displayName()`.

## Question 2

Create the following classes:

**Vehicle**

Fields:
- `String brand`

Methods:
- `displayBrand()`

Output:

```text
Brand: <brand>
```

**Car**

- Inherits from `Vehicle`.
- Additional field: `String model`.
- Additional method: `displayModel()`.

Output:

```text
Model: <model>
```

In the `main()` method:

1. Create a `Car` object.
2. Assign `brand = "Toyota"`.
3. Assign `model = "Corolla"`.
4. Call `displayBrand()` and `displayModel()`.

## Question 3

Create the following classes:

**Employee**

Fields:
- `String name`
- `double salary`

Method:
- `displayEmployee()`

Output:

```text
Name: John
Salary: 50000.0
```

**Manager**

- Inherits from `Employee`.
- Additional field: `String department`.
- Additional method: `displayDepartment()`.

Output:

```text
Department: Sales
```

In the `main()` method:

1. Create a `Manager` object.
2. Assign `name = "John"`.
3. Assign `salary = 50000`.
4. Assign `department = "Sales"`.
5. Display all the information.