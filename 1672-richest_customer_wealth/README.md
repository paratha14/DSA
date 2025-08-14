# 1672- Richest Customer Wealth

##  Problem Statement
You are given an **m x n** integer grid `accounts` where `accounts[i][j]` is the amount of money the **i-th customer** has in the **j-th bank**.  
Return the wealth that the **richest customer** has.

- A **customer's wealth** is the total amount of money they have across all their bank accounts.
- The **richest customer** is the one with the **maximum wealth**.

---

##  Example

### Example 1
**Input:**  
`accounts = [[1,2,3],[3,2,1]]`  
**Output:**  
`6`  
**Explanation:**
- 1st customer → `1 + 2 + 3 = 6`
- 2nd customer → `3 + 2 + 1 = 6`  
  Both customers are equally rich with wealth **6**, so return **6**.

---

### Example 2
**Input:**  
`accounts = [[1,5],[7,3],[3,5]]`  
**Output:**  
`10`  
**Explanation:**
- 1st customer → `1 + 5 = 6`
- 2nd customer → `7 + 3 = 10`
- 3rd customer → `3 + 5 = 8`  
  The 2nd customer is the richest with wealth **10**.

---

##  Constraints
- `m == accounts.length`
- `n == accounts[i].length`
- `1 <= m, n <= 50`
- `1 <= accounts[i][j] <= 100`


