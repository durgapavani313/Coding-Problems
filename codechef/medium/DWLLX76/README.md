# DWLLX76

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Using the Addition Operator

What will be the output of the following C program?

```
#include <stdio.h>

int main() {
    int a = 7, b = 3, c = 5;
    int sum = a + b + c;

    printf("Sum is: %d\n", sum);
    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T12:11:20.087Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/DWLLX76)