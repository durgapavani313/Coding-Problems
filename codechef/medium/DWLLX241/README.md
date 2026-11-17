# DWLLX241

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Loan Eligibility with Nested if Statements

In this example, we demonstrate how to use  **nested `if` statements**  to determine if a person is eligible for a loan based on both their  **age**  and  **income**. The program will first check if the person is eligible based on their age and, if true, then check their income to finalize the decision.

 **When executed, the code will show:** 

```
You are eligible for the loan.

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:29:59.402Z  

```c_cpp
#include <stdio.h>

int main() {
    int age = 30;      // Person's age
    int income = 40000; // Person's annual income

    // Nested if statements to check loan eligibility
    if (age >= 18) {  // Check if the person is eligible based on age
        if (income >= 25000) {  // Check if the person also has sufficient income
            printf("You are eligible for the loan.\n");
        } else {
            printf("Income too low for the loan.\n");
        }
    } else {
        printf("You are not eligible for the loan due to age.\n");
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX241)