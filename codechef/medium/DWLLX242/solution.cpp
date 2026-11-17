#include <stdio.h>

int main() {
    int age = 30;      // Person's age
    int income = 40000; // Person's annual income

    // Nested if statements to check loan eligibility
    if (age >= 18) {  // Check if the person is eligible based on age
        if (income >= 25000) {  // Check if the person also has sufficient income
            printf("You are eligible for the loan.\n");
        } else {
            printf("Income too low for the loan.\n");
        }
    } else {
        printf("You are not eligible for the loan due to age.\n");
    }

    return 0;
}
