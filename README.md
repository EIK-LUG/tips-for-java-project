# tips-for-java-project

## Stage 1 - decide on what to do

### Think small, with the possibility of growing the program.

Just make notes on what you intend to make, don't start programming yet.

You should later use these separations as guides to what code to make work, before you continue on to the next part.
If you build scoreboard functionality in before you even have the base version, you will have a bad time.

Good: 

    Application: A Tic-Tac-Toe game
    
    Base version:
    
    ONLY THE BARE BONES, as minimal as can be. No error checking, no win state checking, nothing.
    
    1) print out a 3x3 grid
    2) ask player 1 for board coordinates - which square to take.
    3) mark position as taken
    3) ask player 2 for board coordinates - which square to take.
    4) mark position as taken
    
    Minimal viable version additions: 
    
    1) Checking if user input is valid (format wise), and re-ask if not  
    2) Checking if square is available, and re-ask if not 
    3) Checking if someone has won
    
    Nice to have:

    1) A scoreboard, that remembers how many times a player has won against which player and in general
    2) Multi games (ask to play again)

Bad:

    Application: A Tic-Tac-Toe game

    Wicked awesome tic-tac-toe game that works with 3x3 - 90x90 grids, up to 10 players, has an international online scoreboard etc..
     
    I'm too smart to plan ahead, I will start programming right away, huzzaaah!!

## Stage 2 - Top down design part 1

Write non working code for your Base version using classes that don't exist yet

see: TicTacToe1.java

You will now have your main logic ready!

## Stage 3 - Top down design part 2

Write your classes in the abstract - Just define the classes and methods in the previous point without writing any working code.

see: TicTacToe2.java

You will now just need to write the working parts as you game starts to work more and more.
 
You can test the parts in isolation in your main as well, just System.exit() before you reach the game logic.