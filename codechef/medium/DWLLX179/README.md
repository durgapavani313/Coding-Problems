# DWLLX179

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculating Book Title Lengths Using strlen() in C
- In this example, we simulate a library catalog system that needs to determine the number of characters in book titles for layout or storage purposes.
- The program stores the names of two books and uses the strlen() function to calculate and display the length of each title, excluding the null terminator.

 **When executed, the code will show:** 

```
Book 1: To Kill a Mockingbird  
Title Length: 21 characters  
Book 2: The Great Gatsby  
Title Length: 16 characters

```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T12:33:37.491Z  

```c_cpp
#include <stdio.h>
#include <string.h>

int main() {
    // Declare and initialize book titles as strings
    char book1[] = "To Kill a Mockingbird"; // Book 1 
    char book2[] = "The Great Gatsby"; // Book 2

    // Calculate the length of the first book title (excluding '\0')
    int length1 = strlen(book1);

    // Print the first book title and its length
    printf("Book 1: %s\n", book1);
    printf("Title Length: %d characters\n", length1);

    // Print the second book title and its length directly using strlen()
    printf("Book 2: %s\n", book2);
    printf("Title Length: %d characters\n", strlen(book2));

    return 0; 
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DWLLX179)