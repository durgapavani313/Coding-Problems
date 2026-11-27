# DWLLX176

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example- Declaring and Initializing Strings

In this example, we demonstrate how to declare a string first and initialize it later, using character-by-character assignment. The program stores and displays a user's name, the selected programming language, and a welcome message.

 **When executed, the code will show:** 

```
User Name: Micky
Selected Language: C Lang
Message: Welcome to C!

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T12:32:55.008Z  

```c_cpp
#include <stdio.h>

int main() {
    // Step 1: Declare a string to store the user's name
    char userName[10];  // Allocate space for up to 9 characters + 1 null terminator

    // Step 2: Initialize the string manually by assigning each character
    userName[0] = 'M';
    userName[1] = 'i';
    userName[2] = 'c';
    userName[3] = 'k';
    userName[4] = 'y';
    userName[5] = '\0';  // Important: null terminator marks end of the string

    // Step 3: Create another string manually to store the selected language
    char language[] = {'C', ' ', 'L', 'a', 'n', 'g', '\0'}; // This will be printed as "C Lang"

    // Step 4: Declare and initialize a string using a string literal
    char welcomeMessage[] = "Welcome to C!";

    // Step 5: Print all the strings to display personalized output
    printf("User Name: %s\n", userName);           
    printf("Selected Language: %s\n", language);   
    printf("Message: %s\n", welcomeMessage);     

    return 0;  
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX176)