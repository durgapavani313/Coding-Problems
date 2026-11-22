# DWLLX261

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Monitoring System Status

In this example, we demonstrate how to use a `while` loop in C to display a system status message once while a condition is true.

 **When executed, the code will show:** 

```
System check in progress...

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T07:00:39.768Z  

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

[View on CodeChef](https://www.codechef.com/problems/DWLLX261)