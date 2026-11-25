# DWLLX80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Complete the Code - Subtraction Operation

Complete the missing line in the following C program to store the result of subtracting two integers, so that the output is `-28`.

```
#include <stdio.h>

int main() {
    int number1 = 12;
    int number2 = 40;

    // Missing line: store the result in difference
    ________;

    printf("Difference: %d", difference);

    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:59:32.733Z  

```cpp
#include <stdio.h> 

int main() {
    // Declare and initialize two integer variables
    int number1 = 56;  // First number
    int number2 = 34;  // Second number

    // Subtract number2 from number1 and store the result in 'sum'
    int sum = number1 - number2;

    // Print the result using printf
    printf("Difference: %d", sum);  

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX80)