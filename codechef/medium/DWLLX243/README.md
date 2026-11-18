# DWLLX243

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Grade Checker with Input Validation

Write a program that takes a student’s marks as input, validates the marks, and then classifies the result:

 **Input Format:** 
An integer representing the student’s marks (expected between 0 and 100).

 **Steps to Complete:** 

- If the marks are invalid, print "Invalid marks entered!".
- If the marks are valid, use nested if statements to: Check if marks are 40 or above (pass). If passed and marks are 75 or above, print "Passed with Distinction". If passed and marks less than 75, print "Passed". If marks below 40, print "Failed".
### Sample 1:
Input
Output

```
85
```

```
Passed with Distinction

```

### Sample 2:
Input
Output

```
50

```

```
Passed

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T13:22:28.806Z  

```c_cpp
#include <stdio.h>

int main() {
    int marks;

   // Your code goes here
   scanf("%d",&marks);
   if(marks < 0 || marks > 100)
   {
       printf("Invalid marks entered!");
   }
   else
   {
     if(marks >= 40)
     {
       if(marks >= 75)
       {
           printf("Passed with Distinction");
       }
       else
       {
           printf("Passed");
       }
   }
   else
       {
           printf("Failed");
       }   
    } 

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX243)