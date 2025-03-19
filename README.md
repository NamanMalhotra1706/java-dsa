# Stacks
***  

## Introduction
A stack is a linear data structure that follows the Last In, First Out (LIFO) principle.
***  

## Key Characteristics of Stack
- **LIFO Principle**: The last inserted element is removed first.
- **Dynamic Nature**: The size of the stack grows or shrinks dynamically with element insertion and removal.

### **Operations:**
- **Push** - Adds an element to the stack.
- **Pop** - Removes the top element.
- **Peek** - Views the top element without removing it.
- **isEmpty()** - Checks if the stack is empty.
***  

## Built-in & Custom Implementations
- **Built-in Implementation**:  
  Java provides a built-in `Stack` class in the `java.util` package, which is a subclass of `Vector`.
- **Custom Implementation**:  
  Custom implementations can be created using **arrays** or **linked lists** for better control and understanding.
***  

## Internal Working of Stack
### **Push Operation:**
- Adds an element to the top of the stack.
- Increases the size of the stack.
- **Complexity:** O(1).

### **Pop Operation:**
- Removes the top element of the stack.
- Decreases the size of the stack.
- **Complexity:** O(1).

### **Peek Operation:**
- Retrieves the element at the top without removing it.
- **Complexity:** O(1).

### **isEmpty Operation:**
- Checks whether the stack contains elements.
- **Complexity:** O(1).
***  

## Common Applications of Stack
- **Expression Evaluation**: Evaluate postfix, prefix, or infix expressions.
- **Undo/Redo Operations**: Used in text editors to store changes for reversing or reapplying.
- **Backtracking**: Used in maze-solving algorithms, recursion, or pathfinding problems.
- **Parenthesis Matching**: Validates whether parentheses in an expression are balanced.
- **Call Stack**: Maintains function calls in recursive programming.
***  

## Common Methods in Stack Class (Java)
```java
// Push operation: Adds an element to the top of the stack.
stack.push("Element");

// Pop operation: Removes and returns the top element.
String top = stack.pop();

// Peek operation: Returns the top element without removing it.
String top = stack.peek();

// isEmpty operation: Checks if the stack is empty.
boolean empty = stack.isEmpty();

// Search operation: Searches for an element and returns its position (1-based index).
int position = stack.search("Element");
