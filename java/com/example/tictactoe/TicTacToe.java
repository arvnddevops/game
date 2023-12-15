package com.example.tictactoe;

public class TicTacToe {
    private char[][] board;
    private char currentPlayerMark;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayerMark = 'X';
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        // Check rows, columns, and diagonals for a win
        // Logic to check for a win, return true if found, false otherwise
    }

    public void changePlayer() {
        currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
    }

    // Other methods for handling player moves, displaying the board, etc.
}

