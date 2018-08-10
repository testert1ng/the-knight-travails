# The Knight's Travails Design

## Download

- [TheKnightTravailsDesign.pdf][1]
- [TheKnightTravailsClassDiagram.pdf][2]
- [TheKnightTravailsClassDiagram.vsd][3]

## Class Design

Based on the requirement of the assignment, the program can be implemented by the following five classes:

1. **KnightTravails** class is the entrance of the main method and it can offer clear console based user interface.

2. **ChessBoard** class is designed as a data type to store the chess board squares into two dimensional arrays. It can also display the chess board in console.

3. **Square** class stores the position information as well as the parents’ positions and steps which is used for record and calculate the Knight’s moves.

4. **Position** class is used to store the algebraic chess notation and the traditional x, y coordinates. It also performs as a translator for algebraic chess notation and x, y coordinates.

5. **Move** class is used to calculate the shortest path between the starting position and the ending position. It also offers the method to show the results.

## Algorithm

Define starting position as 0, ending position as 128 and all other position as -1. Check all the squares that the starting position can move to. Record the steps, into these squares as 1. Then check all the squares which the Step 1 squares can reach, marked as 2, until one of the squares located at the ending position. Stop the loop. Besides, each squares recorded the parent squares, which are the squares in last steps.

## Improvements and Instructions

First, the total number of the shortest path is calculated. Then, all the possible paths are listed out with a graph which may help users to check. In the chess board, ‘S’ means starting position, ‘E’ means ending position, ‘\_’ are blank positions and the numbers shows the moves. Besides, the program can check different kind of invalid user input and give the reasonable suggestion.

## Conclusion

The program implements all the requirements of the Knight’s Travails in Java. For more specific detail, please refer to the class diagram and the comments in code.

[1]: https://github.com/testerting/the-knight-travails/blob/master/design/TheKnightTravailsDesign.pdf
[2]: https://github.com/testerting/the-knight-travails/blob/master/design/TheKnightTravailsClassDiagram.pdf
[3]: https://github.com/testerting/the-knight-travails/blob/master/design/TheKnightTravailsClassDiagram.vsd