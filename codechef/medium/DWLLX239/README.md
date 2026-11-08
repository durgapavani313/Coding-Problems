# DWLLX239

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Speed Limit Checker

Write a C program that takes the current hour (in 24-hour format) as input and recommends a suitable meal using an if–else if–else ladder.

 **Steps to complete:** 

- Declare an integer variable hour.
- Use scanf to take user input for the hour (0–23).
- Use if–else if–else to: If hour >= 6 and hour < 10, print "Suggested Meal: Breakfast" Else if hour >= 12 and hour < 15, print "Suggested Meal: Lunch" Else if hour >= 19 and hour < 21, print "Suggested Meal: Dinner" Else, print "Suggested Meal: Snack or Rest Time"
### Sample 1:
Input
Output

```
18
```

```
Suggested Meal: Snack or Rest Time
```

### Sample 2:
Input
Output

```
13

```

```
Suggested Meal: Lunch

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-08T07:04:42.561Z  

```c_cpp
#include <stdio.h>

int main() {
    
   
    int hour;
    scanf("%d", &hour);
   
    if(hour >= 6 && hour < 10)
        printf("Suggested Meal: Breakfast");
   
    else if(hour >= 12 && hour < 15)
        printf("Suggested Meal: Lunch");
   
    else if(hour >= 19 && hour < 21)
        printf("Suggested Meal: Dinner");
   
    else
        printf("Suggested Meal: Snack or Rest Time");
   
    return 0; 
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX239)