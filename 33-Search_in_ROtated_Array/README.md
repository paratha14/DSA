# Search in Rotated Sorted Array

**Problem Difficulty:** Medium

---

## Problem Statement

You are given an **integer array** `nums` sorted in ascending order (with distinct values).  
The array may have been **rotated at an unknown index `k`** (1 ≤ k < nums.length).

- The resulting array looks like:  
  `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]`

For example:

- Original: `[0,1,2,4,5,6,7]`
- Rotated at index `k = 3`: `[4,5,6,7,0,1,2]`

Your task is:  
Given the **rotated array** `nums` and an integer `target`, return **the index of target** if it exists in `nums`.  
If it does not exist, return `-1`.

You must design an algorithm with **O(log n)** runtime complexity.

---

## Examples

### Example 1:
- Input: nums = [4,5,6,7,0,1,2], target = 0
- Output: 4


### Example 2:

- Input: nums = [4,5,6,7,0,1,2], target = 3
- Output: -1


### Example 3:

- Input: nums = [1], target = 0
- Output: -1

---

## Constraints

- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- All values in `nums` are **unique**
- `nums` is a **rotated ascending array**
- `-10^4 <= target <= 10^4`  
