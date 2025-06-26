# Title - Cosmic Conundrum

In computer science, bracket validation is a fundamental problem with real-world applications in parsing code, validating mathematical expressions, and compiling programs. Ensuring that brackets are balanced and properly nested is critical to interpreting structured data formats such as XML, JSON, and source code in languages like C, Java, or Python.

For example, when writing an if condition or a function in code, every { must be closed by a }, and similarly for ( and ), or [ and ]. Even a single misplaced bracket can cause a syntax error. Therefore, creating an algorithm to validate parentheses is a vital problem in both theory and practice.

- A parentheses string is valid if:

- Each opening bracket has a matching closing bracket of the same type.
- Brackets are closed in the correct order, meaning the most recently  opened bracket must be closed first (i.e., LIFO order – like a stack).

- No closing bracket appears without a matching opener before it.

- The string may be empty, which is still considered valid.

---

## Input Format

A single string `s` of length `n` (where 0 ≤ `n`≤ 10⁴) containing only the characters `(`, `)`, `{`, `}`, `[`, `]`.

---

## Output Format

- Return true if the string is a valid sequence of parentheses.
- Return false otherwise.

---

## Constraints

- 1 ≤ `s.length()` ≤ 10^4
- `s` consist of parentheses only `()[]{}`

---

## Sample Input

```
s = "()[]{}"
s = "(]"
```

---

## Sample Output

```
true
false
```

---

## Explanation

### Test Case 1

All brackets in the string are in pair
Thus, it is a valid parentheses hence output is true
### Test Case 2:

All the brackets in the string doesnt have pairs
Thus, it isnt a valid parentheses hence output is false

---

## Difficulty:

easy

## Prerequisites

Stack

## Problem Statement

In computer science, bracket validation is a fundamental problem with real-world applications in parsing code, validating mathematical expressions, and compiling programs. Ensuring that brackets are balanced and properly nested is critical to interpreting structured data formats such as XML, JSON, and source code in languages like C, Java, or Python.

For example, when writing an if condition or a function in code, every { must be closed by a }, and similarly for ( and ), or [ and ]. Even a single misplaced bracket can cause a syntax error. Therefore, creating an algorithm to validate parentheses is a vital problem in both theory and practice.

- A parentheses string is valid if:

- Each opening bracket has a matching closing bracket of the same type.
- Brackets are closed in the correct order, meaning the most recently  opened bracket must be closed first (i.e., LIFO order – like a stack).

- No closing bracket appears without a matching opener before it.

- The string may be empty, which is still considered valid.
## Explanation

The **Valid Parentheses** problem checks whether a string containing only the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'` is properly balanced. A string is considered valid if every opening bracket has a corresponding closing bracket of the same type, and the brackets are closed in the correct order. This is important in programming and mathematics, where brackets define the structure and nesting of expressions. An empty string is also considered valid.

To solve this problem, we use a **stack**, a data structure that follows the **Last-In-First-Out (LIFO)** principle. As we iterate through the string, we push opening brackets onto the stack. When we encounter a closing bracket, we check if it matches the most recent opening bracket on top of the stack. If it does, we pop the stack; if not, the string is invalid. After processing the entire string, if the stack is empty, it means all brackets were properly matched and nested, so the string is valid. Otherwise, it's invalid.

**Java solution**

```java
import java.util.*;
class solution{
    public boolean solution(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek()=='(' && s.charAt(i)==')' ||
                   stack.peek()=='{' && s.charAt(i)=='}' ||
                   stack.peek()=='[' && s.charAt(i)==']'){
                    stack.pop();
                }
                else
                return false;
            }
        }
       if(stack.isEmpty()){
        return true;
       }
       else 
       return false;
    }
    public static void main(String[] args) {
        
    }
}
```

## TIME COMPLEXITY

The Time Complexity is O(n) for each test case

## SPACE COMPLEXITY

The Space Complexity is O(n)for each test case