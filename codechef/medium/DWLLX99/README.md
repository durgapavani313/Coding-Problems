# DWLLX99

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Final Value of result Using Assignment Operators

Given the following code snippet, what will be the final value of `result`?

```
#include <stdio.h>

int main() {
    int result = 10;     
    result += 5;         
    result += 3;         
    result += 2;         
    result -= 4;         
    printf("Result: %d\n", result);
    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T15:05:02.852Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/DWLLX99)