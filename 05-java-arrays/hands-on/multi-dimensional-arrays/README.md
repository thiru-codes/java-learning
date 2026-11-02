# Hands-on: Multidimensional Arrays

## 1. Student Grade Tracker (2D Array)

Write a Java program that:

- Asks the user to enter the number of students and the number of tests.
- Creates a two-dimensional integer array to store the students' test scores.
- Accepts the test scores for each student.
- Displays all the scores in a tabular format.
- Finds and prints the highest score in the class.

**Goal:** Practice declaring, instantiating, initializing, and traversing two-dimensional arrays.

## 2. Global Temperature Monitor (3D Array)

You are building a weather monitoring application for a company that operates servers in two cities (City 0 and City 1).

Each city tracks temperature data over a two-day period (Day 0 and Day 1). Each day, three temperature readings are recorded: Morning, Afternoon, and Evening.

The data must be stored in a 3D array with the dimensions `[City][Day][Reading]`.

Write a Java program that:

- Declares and initializes the following 3D array using the provided dataset.
- Traverses the array to calculate the sum of all temperature readings.
- Counts the total number of readings.
- Calculates and prints the global average temperature across both cities and all days.

**Provided dataset:**

```java
int[][][] temperatures = {
    { // City 0
        {20, 25, 22}, // Day 0
        {24, 28, 23}  // Day 1
    },
    { // City 1
        {15, 18, 16}, // Day 0
        {17, 19, 15}  // Day 1
    }
};
```

**Goal:** Understand how to declare, initialize, and traverse three-dimensional arrays using nested loops.

## 3. Passenger Bus Seating – Hardcoded Jagged Array

Imagine you are developing a reservation system for a tour bus with three rows of seats:

- Row 0 (VIP): 2 seats.
- Row 1 (Standard): 4 seats.
- Row 2 (Economy): 5 seats.

Represent empty seats using `0` and occupied seats using `1`.

Write a Java program that:

- Declares and initializes the following jagged array.
- Uses nested loops to traverse the array.
- Counts and prints the total number of empty seats across all rows.

**Provided dataset:**

```java
int[][] busSeats = {
    {1, 0},          // Row 0: 2 seats
    {1, 1, 0, 1},    // Row 1: 4 seats
    {0, 0, 1, 1, 0}  // Row 2: 5 seats
};
```

**Goal:** Understand jagged arrays and how to access rows with different lengths.

## 4. Passenger Bus Seating – User Input (Jagged Array)

Extend the previous bus seating exercise to accept data from the user.

Write a Java program that:

- Asks the user to enter the number of rows in the bus.
- For each row, asks how many seats it contains.
- Creates a jagged array based on the number of rows and seats entered.
- Accepts the occupancy status of each seat (`1` for occupied and `0` for empty).
- Traverses the array and counts the total number of empty seats.
- Prints the final count.

**Goal:** Practice dynamically creating and populating jagged arrays using user input.