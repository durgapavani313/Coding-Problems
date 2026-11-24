# DWLLX75

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Performing Addition in C

In this example, we demonstrate how the `+` operator is used to add three integer values. The program stores the numbers `5`, `10`, and `15` in variables and prints their total using the addition operator.

 **When executed, the code will show:** 

```
The sum of the three numbers is: 30

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T12:10:16.607Z  

```c_cpp
#include <stdio.h>  

int main() {
    // Declare and initialize three integer variables
    int num1 = 5;    // First number
    int num2 = 10;   // Second number
    int num3 = 15;   // Third number

    // Calculate and display the sum using the addition (+) operator
    // %d is the format specifier for integers
    printf("The sum of the three numbers is: %d", num1 + num2 + num3);

    return 0;  
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX75)