package application;

import ui.UserInput;
import ui.UserOutput;

import java.util.Random;

public class TicTacToe {
    public static final int MAX_BOARD_POSITIONS = 9;
    public static final char X_MARKER = 'X';
    public static final char O_MARKER = 'O';
    public boolean isGameOver = false;

    /*
     * Winning positions for reference
     */
    int[] winningPosition0 = {0, 1, 2};    // top horizontal
    int[] winningPosition1 = {3, 4, 5};    // middle horizontal
    int[] winningPosition2 = {6, 7, 8};    // bottom horizontal
    int[] winningPosition3 = {0, 3, 6};    // left vertical
    int[] winningPosition4 = {1, 4, 7};    // middle vertical
    int[] winningPosition5 = {2, 5, 8};    // right vertical
    int[] winningPosition6 = {0, 4, 8};    // top-left, bottom-right diagonal
    int[] winningPosition7 = {2, 4, 6};    // top-right, bottom-left diagonal

    UserOutput userOutput;
    UserInput userInput;

    char[] board;

    public TicTacToe(){
        userInput = new UserInput();
        userOutput = new UserOutput();
    }

    private char[] initializeBoard(){
        char[] board = new char[MAX_BOARD_POSITIONS];

        for(int i = 0; i < board.length; i++){
            board[i] = Character.forDigit(i, 10);
        }

        return board;
    }

    public void run(){
        this.board = initializeBoard();

        userOutput.gameIntroduction();

        // 1. Keep playing while there are still options for the user or opponent
        // to select, i.e. not all the elements in the board are X_MARKER or O_MARKER.
        while (!isGameOver){
            userOutput.displayBoard(board);
            String userSelection = userInput.getSelection();
            int userNum = Integer.parseInt(userSelection);
            int randNum = new Random().nextInt(9);

            if (board[userNum] == 'X' && board[userNum] == 'O'){
                System.out.println("That position is already taken. Please enter a valid selection");
            } else {
                board[userNum] = 'X';
            }
            if (board[randNum] != 'X' && board[randNum] != 'O'){
                board[randNum] = 'O';
            } else{
                boolean isEqual = true;
                while(isEqual){
                    int newRandNum = new Random().nextInt(9);
                    if (board[newRandNum] != 'X' && board[newRandNum] != 'O'){
                        board[newRandNum] = 'O';
                        isEqual = false;
                    }
                }
            }
            if (board[0] == 'X' && board[1] == 'X' && board[2] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[0] == 'O' && board[1] == 'O' && board[2] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[3] == 'X' && board[4] == 'X' && board[5] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[3] == 'O' && board[4] == 'O' && board[5] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[6] == 'X' && board[7] == 'X' && board[8] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[6] == 'O' && board[7] == 'O' && board[8] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[0] == 'X' && board[3] == 'X' && board[6] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[0] == 'O' && board[3] == 'O' && board[6] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[1] == 'X' && board[4] == 'X' && board[7] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[1] == 'O' && board[4] == 'O' && board[7] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[2] == 'X' && board[5] == 'X' && board[8] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[2] == 'O' && board[5] == 'O' && board[8] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[0] == 'X' && board[4] == 'X' && board[8] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[0] == 'O' && board[4] == 'O' && board[8] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }
            if (board[2] == 'X' && board[4] == 'X' && board[6] =='X'){
                System.out.println("You Win!");
                userOutput.displayBoard(board);
                isGameOver = true;
            } else if (board[2] == 'O' && board[4] == 'O' && board[6] =='O'){
                System.out.println("You Lose!");
                userOutput.displayBoard(board);
                isGameOver = true;
            }

        }
            // 2. Display the board
            // 3. Ask the user to select an available position on the board.
            // A valid position is one that's not already selected,
            // i.e. not X_MARKER or O_MARKER

            // 4. If the position is available, mark it on the board.

            // 5. Check if the player has won (see winningPosition arrays).

            // 6. If the player has won, print a congratulatory message and
            // exit or ask to play another game.

            // 7. Repeat steps 2 to 6 for the opponent's turn


        /*
         * Challenge: let user pick Xs or Os
         * Challenge: Add a 2-player mode
         * Challenge: Program a more sophisticated AI opponent 😎
         */
    }
}

