# DWLLX238

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tax Calculation

You are writing a program to calculate the tax based on a person's income. Use `if-else` ladder to determine the tax bracket for an individual based on their income.

Consider the following C code:

```
#include <stdio.h>

int main() {
    int income = 60000;

    if (income <= 20000) {
        printf("Tax: 5%\n");
    } else if (income <= 50000) {
        printf("Tax: 10%\n");
    } else if (income <= 100000) {
        printf("Tax: 20%\n");
    } else {
        printf("Tax: 30%\n");
    }

    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:27:15.790Z  

```cpp
#include <stdio.h>

int main() {
    int temperature = 28;  // Temperature value in Celsius

    // Using if-else-if ladder to categorize the temperature
    
    if (temperature >= 40) 
    {
        printf("Very Hot\n");
    }
    else if (temperature >= 30) 
    {
        printf("Hot\n");
    } 
    else if (temperature >= 20)
    {
        printf("Warm\n");
    }
    else if (temperature >= 10)
    {
        printf("Cool\n");
    } 
    else {
        printf("Cold\n");
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX238)