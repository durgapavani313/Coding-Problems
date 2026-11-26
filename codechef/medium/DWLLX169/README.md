# DWLLX169

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Evaluate Operator Associativity

This example demonstrates how assignment operators and arithmetic expressions are evaluated in C, considering both left-to-right and right-to-left associativity.

 **When executed, the code will show:** 

```
Final Result (Left-to-right): 50
Final Result (Right-to-left): 300

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T11:05:33.553Z  

```c_cpp
#include <stdio.h>

int main() {
    int x = 100, y = 150, z = 200;
    
    // Left-to-right associativity for arithmetic operations
    int leftResult = x + y - z;  // Evaluated as (x + y) - z
    
    // Right-to-left associativity for assignment operators
    x = y = z + 50 * 2;  // Right-to-left assignment and operator precedence

    // Output the results
    printf("Final Result (Left-to-right): %d\n", leftResult);  
    printf("Final Result (Right-to-left): %d\n", x);  

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX169)