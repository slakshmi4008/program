package Practice;

public class ValidSudoku {

        // Main Method to check the valid sudoku.
        public boolean isValidSudoku(char[][] board) {
            // Checking every number in the 'board'.
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    // If the position is a number (!= '.'), and it is a not a valid placement, then return false.
                    if (board[row][column] != '.' && !isValidPlacement(board, board[row][column], row, column))
                        return false;
                }
            }
            // If all checks succeed, then the 'board' is a valid sudoku.
            return true;
        }

        // Method to check if identical number found in the row.
        private boolean isNumberInRow(char[][] board, char number, int row, int column) {
            for (int i = 0; i < 9; i++) {
                // "column != i" to skip the current number.
                // Otherwise, check if any identical number in the row and return true if found.
                if (column != i && board[row][i] == number) return true;
            }
            // If we did not find any identical number in the row, then return false.
            return false;
        }

        private boolean isNumberInColumn(char[][] board, char number, int row, int column) {
            for (int i = 0; i < 9; i++) {
                // "row != i" to skip the current number.
                // Otherwise, check if any identical number in the column and return true if found.
                if (row != i && board[i][column] == number) return true;
            }
            // If we did not find any identical number in the column, then return false.
            return false;
        }

        private boolean isNumberInBox(char[][] board, char number, int row, int column) {
            // Here, we get the top left corner position of the box the 'number' is in,
            // because we are going to scan from top left to bottom right of the box.
            int boxRow = row - row % 3;
            int boxColumn = column - column % 3;

            // Checking just the 3 row and 3 column position in the box.
            for (int i = boxRow; i < boxRow + 3; i++) {
                for (int j = boxColumn; j < boxColumn + 3; j++) {
                    // "row != i && column != j" to skip the current number.
                    // Otherwise, check if any identical number in the box and return true if found.
                    if (row != i && column != j && board[i][j] == number) return true;
                }
            }
            // If we did not find any identical number in the box, then return false.
            return false;
        }

        // Additional wrapper method for all three checks to make the code more readable.
        private boolean isValidPlacement(char[][] board, char number, int row, int column) {
            // If the number is not found in the row, column and the box, then it is a valid placement and return true.
            return !isNumberInRow(board, number, row, column) &&
                    !isNumberInColumn(board, number, row, column) &&
                    !isNumberInBox(board, number, row, column);
        }
    }

