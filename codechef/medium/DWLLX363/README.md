# DWLLX363

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Counting Down from 10

In this example, we use a do-while loop to count down from 10 to 1. The loop runs at least once, even though the condition is checked after the first iteration.

 **When executed, the code will show:** 

```
10
9
8
7
6
5
4
3
2
1

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-09T15:39:57.114Z  

```c_cpp
#include <stdio.h>

int main() {
    int i = 10;  
    
    do {
        printf("%d\n", i); 
        i--;  
    } while (i > 0); 

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX363)