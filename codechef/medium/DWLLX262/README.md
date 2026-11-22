# DWLLX262

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T07:00:50.680Z  

```c_cpp
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