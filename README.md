# DSA

Mastering Data Structures and Algorithms with robust Java implementations.

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=flat)

---

## Overview

This repository serves as a comprehensive collection of Data Structures and Algorithms (DSA) solutions, meticulously implemented in Java. It is designed for developers, students, and enthusiasts aiming to solidify their understanding of fundamental computer science concepts and enhance their problem-solving skills. Each solution is crafted for clarity, efficiency, and correctness, providing a practical resource for learning and reference.

---

## Features

*   **Comprehensive Coverage:** Explore a wide array of DSA topics, from basic array manipulations and searching algorithms to complex data structures and advanced problem-solving techniques.
*   **Optimized Solutions:** Discover efficient implementations that prioritize optimal time and space complexity, crucial for competitive programming and production-grade software.
*   **Clear Implementations:** Each solution is accompanied by well-structured and readable Java code, facilitating quick comprehension and easy adaptation.
*   **Diverse Problem Set:** Tackle a variety of problems, including common interview questions and specialized algorithmic challenges, to build a strong foundation in problem-solving.
*   **Modular Organization:** Solutions are logically grouped by topic or problem source, ensuring a streamlined learning experience and easy navigation.

---

## Tech Stack

This project leverages the following technologies:

![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)
![OpenJDK](https://img.shields.io/badge/OpenJDK-007396?style=flat&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Version%20Control-Git-F05032?style=flat&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/Hosting-GitHub-181717?style=flat&logo=github&logoColor=white)

---

## Architecture

The repository is structured as a modular collection of self-contained problem solutions. Each problem or algorithmic concept resides within its own dedicated directory, ensuring isolation and clarity.

*   **Problem Directories:** Each directory (e.g., `1095-find_in_mountain_array`, `33-Search_in_ROtated_Array`) typically contains a `Solution.java` file that implements the answer to a specific problem.
*   **Algorithmic Groupings:** Core algorithms (e.g., `Arrays/binary.java`, `Arrays/insertion.java`) are grouped under relevant categories for easy access and study.
*   **Practice Problems:** A `practise` directory houses a wide range of solutions to common challenges, often seen in platforms like LeetCode.

This structure allows for independent compilation and execution of each solution, making it ideal for targeted learning and testing.

---

## Project Structure

```
.
├── 1095-find_in_mountain_array/
│   ├── Solution.java          # Solution for "Find in Mountain Array"
│   └── README.md              # Problem description and context
├── 1672-richest_customer_wealth/
│   ├── richest_customer.java  # Solution for "Richest Customer Wealth"
│   └── README.md
├── 33-Search_in_ROtated_Array/
│   └── Solution.java          # Solution for "Search in Rotated Array"
├── 34-find_first_and_last_position/
│   └── solution.java          # Solution for "Find First and Last Position"
├── 410-Split_Array_Largest_Sum/
│   └── Solution.java          # Solution for "Split Array Largest Sum"
├── 744-smallest_letter_greater_than_target/
│   └── smallest_letter.java   # Solution for "Smallest Letter Greater Than Target"
├── 852-Peak_index_in_mountain_array/
│   └── Solution.java          # Solution for "Peak Index in Mountain Array"
├── Arrays/
│   ├── binary.java            # Binary Search implementation
│   ├── ceil.java              # Ceiling of a number in a sorted array
│   ├── cycle.java             # Cycle Sort algorithm
│   ├── d_binary.java          # Descending Binary Search
│   ├── floor.java             # Floor of a number in a sorted array
│   ├── insertion.java         # Insertion Sort algorithm
│   ├── linear_search.java     # Linear Search implementation
│   ├── order_agnostic_binary_search.java # Order-agnostic Binary Search
│   ├── selection.java         # Selection Sort algorithm
│   └── string_search.java     # String search algorithms
├── practise/
│   ├── 11_container_with_most_water.java # LeetCode problem solution
│   ├── 2_add_two_number.java  # LeetCode problem solution
│   ├── twoSum.java            # LeetCode problem solution
│   └── ...                    # Many more practice problems
└── solution.java              # General solution file (e.g., for quick tests)
```

---

## Usage

This guide will walk you through setting up your environment and executing any of the provided Java solutions.

### Setup

1.  **Install Java Development Kit (JDK):**
    Ensure you have Java 8 or newer installed on your system. You can download it from the [Oracle JDK website](https://www.oracle.com/java/technologies/downloads/) or via OpenJDK distributions like [Adoptium](https://adoptium.net/).
    Verify your installation by running:
    ```bash
    java -version
    javac -version
    ```

2.  **Choose an IDE (Optional but Recommended):**
    While you can compile and run from the command line, an Integrated Development Environment (IDE) like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [VS Code](https://code.visualstudio.com/) with Java extensions will greatly enhance your development experience.

### Execute a Solution

Each problem's solution is a standalone Java file. Follow these steps to compile and run any solution:

1.  **Navigate to the Problem Directory:**
    Open your terminal or command prompt and change your current directory to the specific problem folder you wish to explore. For example:
    ```bash
    cd 1672-richest_customer_wealth
    ```
    Or for an algorithm:
    ```bash
    cd Arrays
    ```

2.  **Compile the Java Source File:**
    Use the Java compiler (`javac`) to compile the `.java` file into a `.class` bytecode file.
    For `1672-richest_customer_wealth/richest_customer.java`:
    ```bash
    javac richest_customer.java
    ```
    For `Arrays/binary.java`:
    ```bash
    javac binary.java
    ```
    Upon successful compilation, a `Solution.class` (or `richest_customer.class`, `binary.class`) file will be generated in the same directory.

3.  **Run the Compiled Class:**
    Execute the compiled Java class using the Java Virtual Machine (`java`).
    For `richest_customer.class`:
    ```bash
    java richest_customer
    ```
    For `binary.class`:
    ```bash
    java binary
    ```
    The output will be displayed directly in your terminal.

### Customization

Most solutions include `main` methods with predefined test cases. To experiment with different inputs:

*   **Modify Test Cases:** Open the `.java` file in your preferred text editor or IDE and locate the `main` method. You can directly change the input values (e.g., arrays, numbers, strings) to test various scenarios.
*   **Add New Test Cases:** Extend the `main` method with additional test cases to thoroughly validate the solution's behavior.

### Expected Outputs

Each solution is designed to print its result or a series of test results to the console. For example, a search algorithm might output the index of an element, while a sorting algorithm might print the sorted array. Review the `main` method of each `.java` file to understand its specific output format.

---

## Contributing

We welcome contributions to enhance this collection of Data Structures and Algorithms! Your efforts help make this resource more comprehensive and valuable.

1.  **Fork the Repository:** Start by forking this repository to your GitHub account.
2.  **Create a New Branch:** Create a new branch for your feature or bug fix. Use a descriptive name, e.g., `feat/add-merge-sort` or `fix/binary-search-edge-case`.
3.  **Implement Your Changes:** Add your new solution, improve an existing one, or fix a bug. Ensure your code adheres to good practices and includes clear comments where necessary.
4.  **Write Clear Commits:** Commit your changes with a clear and concise message. A good commit message explains *what* was changed and *why*.
    ```bash
    git commit -m "feat: Add solution for LeetCode problem 123 - Problem Name"
    ```
5.  **Push to Your Fork:** Push your new branch to your forked repository.
    ```bash
    git push origin feat/add-merge-sort
    ```
6.  **Open a Pull Request:** Submit a pull request from your branch to the `main` branch of this repository. Provide a detailed description of your changes and any relevant context.

If you encounter any issues or have suggestions, please open an issue on the GitHub repository.

---
