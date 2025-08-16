# Peak Index in a Mountain Array

**Problem Difficulty:** Medium

---

## Problem Statement

You are given an integer mountain array `arr` of length `n` where:

- The values **strictly increase** to a peak element.
- After the peak, the values **strictly decrease**.

Your task is to **return the index of the peak element**.

You must solve this in **O(log n)** time complexity.

---

## Examples

### Example 1:

- Input: arr = [0,1,0]
- Output: 1


### Example 2:

- Input: arr = [0,10,5,2]
- Output: 1

---

## Constraints

- `3 <= arr.length <= 10^5`
- `0 <= arr[i] <= 10^6`
- `arr` is guaranteed to be a **mountain array**  
