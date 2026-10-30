# Variable Scope — Practice Questions

## Problem 1 — The Product Tracker

### Task

Create a public class named `Product`.

### Requirements

- Create a private integer variable named `stock`.
- Create a constructor to set the initial stock.
- Create a public method `sellProduct(int amount)` to subtract the specified amount from `stock`.
- Create a public method `getStock()` to return the current stock.

### Goal

Demonstrate that modifying one `Product` object does not affect another `Product` object.

---

## Problem 2 — The Player Health Bar

### Task

Create a public class named `VideoGamePlayer`.

### Requirements

- Create a private `String` variable named `playerName`.
- Create a private integer variable named `health`, with a default value of `100`.
- Create a constructor to set the player's name.
- Create a public method `takeDamage(int damage)`.
- Create a public method `isAlive()` that returns a `boolean`.
  - Return `true` if `health > 0`.
  - Otherwise, return `false`.

### Goal

Demonstrate that when Player 1 takes damage, Player 2's health remains at `100`.

---

## Problem 3 — The Total User Counter

### Task

Create a public class named `User`.

### Requirements

- Create a public static integer variable named `totalUsers`, initialized to `0`.
- Create a constructor that increases `totalUsers` by `1` every time a new `User` object is instantiated.

### Goal

Create three `User` objects and verify that `User.totalUsers` outputs `3`.

---

## Problem 4 — The System Configuration

### Task

Create a public class named `SystemConfig`.

### Requirements

- Create a public static final `String` variable named `ENVIRONMENT`, initialized to `"PRODUCTION"`.
- Create a public static boolean variable named `isMaintenanceMode`, initialized to `false`.
- Create a `main` method or static method that changes `isMaintenanceMode` to `true`.

### Goal

Demonstrate that these variables can be accessed directly using `SystemConfig.isMaintenanceMode` without creating an object using the `new` keyword.