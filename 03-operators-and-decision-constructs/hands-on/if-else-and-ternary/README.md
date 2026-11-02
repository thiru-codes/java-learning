# If-Else and Ternary Constructs

## Question 1: Membership Discount Calculator

Write a method:

`public double getFinalPrice(double cartAmount, boolean isMember)`

Apply discounts based on the following conditions:

1. If `isMember` is `true`, apply a 20% discount (`cartAmount * 0.80`).
2. If the user is not a member but their `cartAmount` is $100 or more, apply a 10% discount.
3. Otherwise, return the full `cartAmount`.

---

## Question 2: Traffic Light Action

Write a method:

`public String getAction(String lightColor, boolean isEmergencyVehicle)`

The method should return the following values:

1. If the light is `"Red"` and it is an emergency vehicle, return `"Proceed with caution"`.
2. If the light is `"Red"` and it is not an emergency vehicle, return `"Stop"`.
3. If the light is `"Green"`, return `"Go"`.

---

## Question 3: Exam Result Using Ternary Operator

Write a method:

`public String checkExamResult(int score)`

The method should:

- Return `"Pass"` if the score is 60 or higher.
- Return `"Fail"` if the score is lower than 60.

**Constraint:** You must use a single ternary operator (`? :`) to determine the return value.