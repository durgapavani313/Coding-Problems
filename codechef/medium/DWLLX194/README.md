# DWLLX194

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Understanding std in C Basic Input Operations

In this example, we demonstrate how to take user input for a favorite number and display it directly in C. This method allows you to interact with users by reading and displaying input.

When run, the program will ask the user to enter their favorite number:

### Sample 1:
Input
Output

```
7
```

```
Your favorite number is: 7
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T15:10:03.585Z  

```c_cpp
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

[View on CodeChef](https://www.codechef.com/problems/DWLLX194)