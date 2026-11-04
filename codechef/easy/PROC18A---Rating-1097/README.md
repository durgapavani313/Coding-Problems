# PROC18A - Rating 1097

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### The Great Run

Vishal loves running. He often visits his favourite Nehru Park and runs for very long distances. On one such visit he found that the number of girls in the park was unusually high. Now he wants to use this as an opportunity to impress a large number of girls with his awesome speed.

The track on which he runs is an $\text{N}$ kilometres long straight path. There are $\mathbf{a_i}$ girls standing within the $\text{ith}$ kilometre of this path. A girl will be impressed only if Vishal is running at his maximum speed when he passes by her. But he can run at his best speed only for a single continuous stretch of $\text{K}$ kilometres. Now Vishal wants to know what is the maximum number of girls that he can impress.

### Input

First line of the input contains the number of testcases $\text{T}$.

For each test case,

First line contains two space-separated integers $\text{N}$ and $\text{K}$, the length of the track and the maximum distance he can run at his best speed.

Second line contains N space-separated integers, the number of girls within each kilometre of the track.

### Output

For each test case print one line containing an integer, denoting the maximum number of girls Vishal can impress.

### Constraints

$1 \leq \text{T} \leq 10$

$1 \leq \text{K} \leq \text{N} \leq 100$

$1 \leq \mathbf{a_i} \leq 100$

### Sample 1:
Input
Output

```
1
7 2
2 4 8 1 2 1 8
```

```
12
```

### Explanation:

He can impress 4+8=12 girls if he runs at his best speed between the 2nd and the 3rd kilometre, inclusive.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T05:13:20.553Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test = 1; test <= T; test++) {
		    
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for (int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    
		    int total = totalImpress(n, k, arr);
		    System.out.println(total);
		}
	}
	
	public static int totalImpress(int n, int k, int[] arr) {
	    
	    int firstKsum = 0;
	    int min = (n < k) ? n : k;
	    
	    for (int i = 0; i < min; i++) {
	        firstKsum += arr[i];
	    }
	    
	    int max = firstKsum;
	    
	    for (int i = min; i < n; i++) {
	        
	        firstKsum -= arr[i - min];
	        firstKsum += arr[i];
	        
	        max = (firstKsum > max) ? firstKsum : max;
	    }
	    
	    return max;
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PROC18A)