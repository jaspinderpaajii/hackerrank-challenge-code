# Valid Parentheses

In computer science, bracket validation is a fundamental problem with real-world applications in parsing code, validating mathematical expressions, and compiling programs. Ensuring that brackets are balanced and properly nested is critical to interpreting structured data formats such as XML, JSON, and source code in languages like C, Java, or Python.

For example, when writing an if condition or a function in code, every { must be closed by a }, and similarly for ( and ), or [ and ]. Even a single misplaced bracket can cause a syntax error. Therefore, creating an algorithm to validate parentheses is a vital problem in both theory and practice.

- A parentheses string is valid if:

- Each opening bracket has a matching closing bracket of the same type.
- Brackets are closed in the correct order, meaning the most recently  opened bracket must be closed first (i.e., LIFO order – like a stack).

- No closing bracket appears without a matching opener before it.

- The string may be empty, which is still considered valid.

## Input Format
 A single string `s` of length `n` (where 0 ≤ `n`≤ 10⁴) containing only the characters `(`, `)`, `{`, `}`, `[`, `]`.

## Output Format

- Return true if the string is a valid sequence of parentheses.
- Return false otherwise.

## Constraints

- 1 ≤ `s.length()` ≤ 10^4
- `s` consist of parentheses only `()[]{}`


## Sample Input

```
()[]{}
(]

```
## Sample Output

```
true
false

```

## Explanation

### Test Case 1 

All brackets in the string are in pair
Thus, it is a valid parentheses hence output is true

### Test Case 2: 
All the brackets in the string doesnt have pairs
Thus, it isnt a valid parentheses hence output is false

