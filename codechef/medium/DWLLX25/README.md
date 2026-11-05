# DWLLX25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Displaying Countries and Capitals

In this example, we create a program that prints a neatly structured table using escape sequences like `\t` (tab) and `\n` (newline). The table lists countries alongside their respective capitals. Tabs are used to align the columns clearly, and newlines move to the next row after each entry.

 **When executed, the code will display:** 

```
Country:	Capital:
India		New Delhi
France		Paris
Japan		Tokyo

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-05T04:56:14.809Z  

```c_cpp
#include <stdio.h> // Include standard input/output library

int main() {
    // Print header row with tabs to separate "Country" and "Capital"
    printf("Country:\tCapital:\n");

    // Print each country with its capital, using \t for spacing and \n for new lines
    printf("India\t\tNew Delhi\n");     // Print India's capital
    printf("France\t\tParis\n");        // Print France's capital
    printf("Japan\t\tTokyo\n");         // Print Japan's capital

    return 0; // Return 0 to indicate successful program execution
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX25)