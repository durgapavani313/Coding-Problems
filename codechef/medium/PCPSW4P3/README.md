# PCPSW4P3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Palindrome Number Checker

Write a C program to read a number from the user and check whether the given number is a palindrome or not.

A palindrome number remains the same when its digits are reversed.

### Input Format

A single integer representing the number.

### Output Format

The output should contain a single line in the following format:

- Print Palindrome if it is a Palindrome else Not a Palindrome
### Sample 1:
Input
Output

```
121
```

```
Palindrome
```

### Sample 2:
Input
Output

```
123
```

```
Not a Palindrome
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T13:36:01.433Z  

```c_cpp
#include <stdio.h>

int main() {
    int n, rem, rev = 0;
    scanf("%d", &n);
    int temp = n;
    
    while(n != 0)
    {
        rem = n % 10;
        rev = (rev * 10) + rem;
        n = n / 10;
    }
    if(temp == rev)
    {
        printf("Palindrome");
    }
    else 
    {
        printf("Not a Palindrome");
    }
    return 0;
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PCPSW4P3)