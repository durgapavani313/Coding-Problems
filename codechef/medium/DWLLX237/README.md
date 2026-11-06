# DWLLX237

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Temperature Rating Using if-else-if Ladder

In this example, we demonstrate how to use the  **`if-else-if` ladder**  to categorize the temperature into different ranges, such as "Very Hot", "Hot", "Warm", "Cool", and "Cold". The program will print the appropriate temperature category based on the given temperature.

 **When executed, the code will show:** 

```
Warm

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:19:32.007Z  

```c_cpp
#include <stdio.h>

int main() {
    int temperature = 28;  // Temperature value in Celsius

    // Using if-else-if ladder to categorize the temperature
    
    if (temperature >= 40) 
    {
        printf("Very Hot\n");
    }
    else if (temperature >= 30) 
    {
        printf("Hot\n");
    } 
    else if (temperature >= 20)
    {
        printf("Warm\n");
    }
    else if (temperature >= 10)
    {
        printf("Cool\n");
    } 
    else {
        printf("Cold\n");
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX237)