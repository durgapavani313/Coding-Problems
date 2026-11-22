# DWLLX262

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the Blank - While Loop Basics

Complete the code so it prints `World!` once using a while loop:

```
#include <stdio.h>

int main() {
    int count = _____;  // Fill in the blank

    while (_____) {    // Fill in the blank
        printf("World!\n");
        count = _____;  // Fill in the blank
    }

    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T07:02:23.623Z  

```cpp
#include <stdio.h>

int main() {
    // Declare an integer variable to represent the system status
    int systemActive = 1;  // 1 means true (active)

    // While loop to display the status message
    while (systemActive == 1) {
        printf("System check in progress...");

        // Change the value to exit the loop
        systemActive = 0;
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX262)