# DWLLX98

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Assignment Operators

In this example, we demonstrate how to use the Simple Assignment (`=`), Addition Assignment (`+=`), and Subtraction Assignment (`-=`) operators in C to assign and update values of an integer variable efficiently. We will declare an integer variable, apply each assignment operator step-by-step, and print the result after each operation.

 **When executed, the code will show:** 

```
After simple assignment: 20  
After addition assignment (+= 10): 30  
After subtraction assignment (-= 4): 26  

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T15:04:06.488Z  

```c_cpp
#include <stdio.h>  

int main() {
    // Simple Assignment
    int number = 20;  // Assign 20 to variable 'number'
    printf("After simple assignment: %d\n", number);

    // Addition Assignment
    number += 10;  // Adds 10 to current value (20 + 10 = 30)
    printf("After addition assignment (+= 10): %d\n", number);

    // Subtraction Assignment
    number -= 4;  // Subtracts 4 from current value (30 - 4 = 26)
    printf("After subtraction assignment (-= 4): %d\n", number);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX98)