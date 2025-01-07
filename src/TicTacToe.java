import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;

        System.out.println("Selamat datang di permainan Tic Tac Toe!");
        printBoard(board);

        for (int turn = 0; turn < 9; turn++) {
            System.out.println("Pemain " + currentPlayer + ", masukkan baris (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.println("Pemain " + currentPlayer + ", masukkan kolom (1-3): ");
            int col = scanner.nextInt() - 1;

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Posisi tidak valid atau sudah terisi. Coba lagi!");
                turn--;
                continue;
            }

            board[row][col] = currentPlayer;
            printBoard(board);

            if (checkWin(board, currentPlayer)) {
                System.out.println("Selamat! Pemain " + currentPlayer + " menang!");
                gameWon = true;
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        if (!gameWon) {
            System.out.println("Permainan berakhir seri!");
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("\n  1 2 3");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print("|");
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }
}
