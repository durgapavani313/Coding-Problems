# DWLLX42

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Displaying Bank Balance with long

In this problem, you are tasked with handling large numerical values representing a bank balance. The goal is to demonstrate how both `int` and `long` data types can be used to manage values of different magnitudes.

 **Expected Output:** 

```
Balance in millions: 500 million
Total Bank Balance: 10000000 millions

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T15:26:50.801Z  

```c_cpp
#include <stdio.h>

int main() {
    int balance = 500;// Declare an int variable for a portion of the balance (in millions)
    // Represent 500 million 
    
    int Bank_Balance = 10000000;// Declare a long variable for the total bank balance and assign it the value 10000000
    
    
    printf("Balance in millions: %d million", balance);// Print the value of millions portion
    
    
    printf("Total Bank Balance: %d millions", Bank_Balance);// Print the total bank balance
    
    
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX42)