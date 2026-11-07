# PCPSW4P1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factorial of any number

Write a C program to read a number from the user and find its factorial using any loop.

The factorial of a non-negative integer n is the product of all positive integers from 1 to n.

### Input Format

A single non-negative integer representing the number.

### Output Format

The output should contain a single line in the following format:
Factorial = <factorial>

### Sample 1:
Input
Output

```
7
```

```
Factorial = 5040
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T13:32:57.786Z  

```c_cpp
#include <stdio.h>

int main() {
    int n, fact = 1;
    scanf("%d", &n);
    int i;
    for(i = 1; i <= n; i++)
        fact = fact * i;
    printf("Factorial = %d", fact);
    return 0;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PCPSW4P1)