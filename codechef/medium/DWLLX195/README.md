# DWLLX195

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Simple Calculator in C

What does the  **`scanf()`**  function do in the following C code?

```
#include <stdio.h>

int main() {
    int number;

    scanf("%d", &number);  

    printf("You entered: %d\n", number);
    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T15:11:11.167Z  

```cpp
#include <stdio.h>

int main() {
    int favoriteNumber;

    // Prompt the user to input their favorite number
    scanf("%d", &favoriteNumber);  // Read the user's input

    // Display the favorite number
    printf("Your favorite number is: %d\n", favoriteNumber);

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX195)