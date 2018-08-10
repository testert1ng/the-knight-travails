# The Knight's Travails

## 0x00 General Overview

This is [Integrated Research (IR)][1] Graduate Program Assignment I have done in November 2014. 

If you are also interested in this company, pleas keep your eye on [https://www.ir.com/careers][2].

There application processed very slow. About **two** month later, I got the phone interview to asking about the assignment design. I almost forgot everything for that. 

## 0x01 Assignment

Get the [pdf][3] version.

### The Knight’s Travails

We have a challenge for you!  
 
Given a standard 8x8 chessboard, design an object oriented application that accepts two squares identified by algebraic chess notation. The first square is the starting position, and the econd square is the ending position. Find the shortest sequence of valid moves to take a Knight piece from the starting position to the ending position. Each move must be a legal move by a Knight and you can assume there are no other pieces on the board. For any two squares there may be more than one valid solution.

### Vital information  

Algebraic chess notation identifies each square with a letter from A to H and a number from 1 to 8. The columns are labelled with letters, and the rows are numbered. The lower left is A1.  

A Knight moves two steps in a straight line from its starting position, and then one square to either the left or right. A Knight can jump over other pieces. In the diagram to the right the Knight at position B8 can move to either A6 or C6, while the Knight at position G8 can move to F6 or H6.

![](https://github.com/testerting/the-knight-travails/raw/master/img/cheeseboard.png?raw=true)

### Input

Must be two squares identified in algebraic chess notation representing the starting and ending positions of the Knight. The two squares are separated by a space.  
 
### Output  

Must be a list of squares through which the Knight passes, in algebraic chess notation. This must include the ending position, but exclude the starting position.  

### Example  
 
Test Input:      A8 B7  
Expected Output: C7 B5 D6 B7  
 
### Assignment brief 

Write an object oriented program to find the shortest sequence of moves for a Knight between the starting and ending positions. Your program can accept the input and produce the output in whatever form you think is most effective. Archive and provide all source files required to build and run your program, along with any necessary instructions. 

#### Notes

- Graduate and Intern candidates should choose from C++, Java, C# or other OO language they’re most familiar with. 
- Other candidates must provide a C++ solution unless otherwise requested 
- Do NOT send compiled executables, even in archive form – your email will likely be bounced by spam filters 

![](https://github.com/testerting/the-knight-travails/raw/master/img/cheese.png?raw=true)

[1]: https://www.ir.com/
[2]: https://www.ir.com/careers
[3]: https://github.com/testerting/the-knight-travails/blob/master/TheKnightTravails.pdf