# DWLLX242

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Discount Eligibility Check

You are building a program to determine whether a person is eligible for a discount on a product. The discount eligibility depends on both the membership status and the total purchase amount.

Consider the following C code:

```
#include <stdio.h>

int main() {
    int isMember = 1;  // 1 indicates membership, 0 indicates no membership
    float purchaseAmount = 150.0;

    if (isMember) {
        if (purchaseAmount >= 100) {
            printf("Eligible for 10% discount.\n");
        } else {
            printf("Membership, but purchase amount too low for discount.\n");
        }
    } else {
        printf("Not eligible for discount due to no membership.\n");
    }

    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:35:53.708Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/DWLLX242)