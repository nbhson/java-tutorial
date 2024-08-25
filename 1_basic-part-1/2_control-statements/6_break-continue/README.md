# Loop Control

## Java Loops

Java programming language provides the following types of loops to handle the looping requirements:

`1	while loop`
Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body.

`2	for loop`
Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.

`3	do...while loop`
Like a while statement, except that it tests the condition at the end of the loop body.

`4	Enhanced for loop`
As of Java 5, the enhanced for loop was introduced. This is mainly used to traverse collection of elements including arrays.

## Loop Control Statements

`1	break statement`
Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch.

`2	continue statement`
Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.

## Java Break

> A while loop statement in Java programming language repeatedly executes a code block as long as a given condition is true.

### break Statement

- When the break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
- It can be used to terminate a case in the switch statement 

### Flow Diagram

![alt text](image.png)

## Java Continue
- The continue statement can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop.

```bash
In a for loop, the continue keyword causes control to immediately jump to the update statement.
In a while loop or do/while loop, control immediately jumps to the Boolean expression.
```

### Flow Diagram

![alt text](image-1.png)
