# DWLLX252

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Demonstrate Fall-Through Behavior in switch

In this example, we demonstrate how omitting `break` statements in a `switch` block causes  *fall-through*  behavior. When a case matches, all subsequent cases execute until a `break` or the end of the switch is reached.

This is useful for grouped logic but can also cause unintended behavior if not handled carefully.

 **Expected Output:** 

```
Grade level 2:
Intermediate
Advanced
Undefined Level

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T01:10:45.518Z  

```c_cpp
#include <stdio.h>

int main() {
    int grade = 2;

    printf("Grade level %d:\n", grade);

    switch (grade) {
        case 1:
            printf("Beginner\n");
        case 2:
            printf("Intermediate\n");
        case 3:
            printf("Advanced\n");
        default:
            printf("Undefined Level\n");
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX252)