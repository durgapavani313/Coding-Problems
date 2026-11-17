# DWLLX248

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if Year is a Leap Year and Divisible by 100

In this example, we demonstrate how to use a complex Boolean expression involving logical AND (&&) and OR (||) operators to determine if a specific year is a leap year and whether it is divisible by 100.

 **When executed, the code will show:** 

```
The year 2000 is a leap year and divisible by 100.

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:54:04.314Z  

```c_cpp
#include <stdio.h>

int main() {
    int year = 2000;  // Fixed input

    // Check leap year condition using complex Boolean expression
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        if (year % 100 == 0)
            printf("The year %d is a leap year and divisible by 100.\n", year);
        else
            printf("The year %d is a leap year.\n", year);
    } else {
        printf("The year %d is not a leap year.\n", year);
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX248)