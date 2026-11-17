# DWLLX246

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Determine Sign of a Number Using Ternary Operator

Complete the given C program by filling in the missing line using the ternary operator. The program should check whether a number is positive or negative and print the appropriate message.

The number is already defined in the program. You must use the ternary operator to print:

- "Positive" if the number is greater than 0
- "Negative" otherwise

 **Expected Output:** 

```
Negative

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T13:53:31.997Z  

```c_cpp
#include <stdio.h>

int main() {
    int number = -5;

    // your code goes here 
    (number > 0) ? printf("Positive") : printf("Negative"); 
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX246)