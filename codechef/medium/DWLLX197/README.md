# DWLLX197

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Using getchar() and putchar()

In this example, we demonstrate how to use  **`getchar()`**  to read a single character input from the user and  **`putchar()`**  to display that character. This shows how these functions can be used to handle simple character-based input and output.

 **When executed, the code will prompt the user to enter a character:** 

### Sample 1:
Input
Output

```
a
```

```
You entered: a
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T15:12:16.382Z  

```c_cpp
#include <stdio.h>

int main() {
    char ch;  // Variable to store the character input

    // Ask the user to enter a character
    
    // Use getchar() to read a single character
    ch = getchar();

    // Use putchar() to print the entered character
    printf("You entered: ");
    putchar(ch);  // Display the entered character
    printf("\n");  // Move to the next line after output

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX197)