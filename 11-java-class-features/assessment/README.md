# Assessment: Java Class Features

1. Create an enum `Tier` (`SILVER`, `GOLD`, `PLATINUM`).

   Each tier should have a `baseDiscount` (`double`).

   Define an abstract method `calculateSpecialBonus(double amount)` within the enum.

   Provide a unique implementation of this method for each enum constant using constant-specific class bodies.

   (Enums)

2. Create an interface `BaseEngine` and a sub-interface `ElectricEngine` that extends it. Implement a class `TeslaModelS` that implements `ElectricEngine`.

   Ensure you use the `@Override` annotation correctly and demonstrate how the class manages a default method defined in the `BaseEngine` interface.

   (Interfaces)

3. Create a class `OuterDepartment`. Inside it:

   - Create a Member Inner Class `JobPosition` that accesses a private field `departmentName` from the outer class.
   - Create a Static Nested Class `Location` that holds a static string `OFFICE_ADDRESS` and a method to print it.

   (Inner and Nested Classes)