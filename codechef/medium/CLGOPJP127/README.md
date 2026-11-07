# CLGOPJP127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prime Number

You need to write a code which checks if a given number is prime.

- You are given a whole number N.
- Your task is to determine if N is a prime number or not and print "Yes" if it is prime, or "No" if it is not.
### Input Format

A single whole number N

### Output Format

The output should contain a single line in the following format:

- Print Yes if it is a Prime Number else print No
### Sample 1:
Input
Output

```
14635
```

```
No
```

### Sample 2:
Input
Output

```
13
```

```
Yes
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T13:33:31.646Z  

```c_cpp
#include <stdio.h>

int main() {
    int n, count = 0, i = 1;
    scanf("%d", &n);
    do
    {
        if(n % i == 0)
            count++;
        i++;
    }
    while(i <= n);
    if(count==2)
        printf("Yes");
    else
        printf("No");
    
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP127)