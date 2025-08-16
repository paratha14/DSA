# Find in Mountain Array

**Problem Difficulty:** Hard

---

## Problem Statement

You are given a special kind of array called a **mountain array**.  
An array `arr` is a mountain array if and only if:

1. `arr.length >= 3`
2. There exists some index `i` with `0 < i < arr.length - 1` such that:
    - `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
    - `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`

Your task is:  
Given a **MountainArray interface** `mountainArr`, return the **minimum index** such that `mountainArr.get(index) == target`.  
If such an index does not exist, return `-1`.

You cannot access the array directly. Instead, you can only use the **interface methods**:

- `mountainArr.get(k)` → returns the element at index `k` (0-indexed).
- `mountainArr.length()` → returns the length of the array.

Constraints:
- Submissions making more than **100 calls** to `mountainArr.get` will be judged **Wrong Answer**.
- Any attempt to circumvent the judge will result in **disqualification**.

---

## Examples

### Example 1:

- Input: mountainArr = [1,2,3,4,5,3,1], target = 3
- Output: 2
- Explanation: 3 exists at index 2 and 5, but the minimum index is 2.


### Example 2:

- Input: mountainArr = [0,1,2,4,2,1], target = 3
- Output: -1
- Explanation: 3 does not exist in the array, so we return -1.

---

## Constraints

- `3 <= mountainArr.length() <= 10^4`
- `0 <= target <= 10^9`
- `0 <= mountainArr.get(index) <= 10^9`  