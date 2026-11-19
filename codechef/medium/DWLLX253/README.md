# DWLLX253

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Switch

What will be the output of the following C code?

```
#include <stdio.h>

int main() {
    int x = 1;

    switch (x) {
        case 1:
            printf("One\n");
        case 2:
            printf("Two\n");
        case 3:
            printf("Three\n");
        default:
            printf("Default\n");
    }

    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T01:11:47.319Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/DWLLX253)