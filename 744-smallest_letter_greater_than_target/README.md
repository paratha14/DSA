# Next Greatest Letter

## Problem Statement  
You are given an array of characters `letters` sorted in non-decreasing order and a character `target`.  
There are at least two different characters in `letters`.  

Return the **smallest character** in `letters` that is lexicographically greater than `target`.  
If no such character exists, return the **first character** in `letters`.

---

## Examples  

**Example 1**  
```
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character greater than 'a' is 'c'.
```

**Example 2**  
```
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character greater than 'c' is 'f'.
```

**Example 3**  
```
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: No character is greater than 'z', so return the first letter.
```

---

## Constraints  
- `2 <= letters.length <= 10^4`  
- `letters[i]` is a lowercase English letter.  
- `letters` is sorted in non-decreasing order.  
- `letters` contains at least two different characters.  
- `target` is a lowercase English letter.
