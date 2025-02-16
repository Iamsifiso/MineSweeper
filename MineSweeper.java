import java.sql.Time;

public class MineSweeper {
    public static final String H_BORDER = "═══";
    public static final String V_BORDER = "║";
    public static final String TOP_LEFT_CORNER =  "╔";
    public static final String TOP_RIGHT_CORNER = "╗";
    public static final String BOTTOM_LEFT_CORNER = "╚";
    public static final String BOTTOM_RIGHT_CORNER = "╝";
    public static final String INTERSECTION = "╬";
    public static final String LEFT_JUNCTION = "╠";
    public static final String RIGHT_JUNCTION = "╣";
    public static final String TOP_JUNCTION = "╦";
    public static final String BOTTOM_JUNCTION = "╩";
    public static final String CLOSED = "■";

    public static void main(String[] args) {
        int mode = 0, row = 12, col = 6, mines = 10;
        String [][] board;
        Time counter;
        try {
            mode = Integer.parseInt(args[0]);
        } catch (Exception e) {
            StdOut.println("Error: Incorrect mode entered.");
            StdOut.println("Notification: Entering default mode.");
        }

        // Mode
        // 0 = Easy, 1 = Medium, 2 = Hard
        if (mode == 0) {
            // Easy mode (Default mode)
            // row = 12, col = 6, mines = 10

            row = 25;
            col = 13;
            board = new String [row][col];

            StdOut.println("========Easy-Mode========");

            initBoard(board);
            drawBoard(board);

        } else if (mode == 1) {
            // Medium mode
            // row = 20, col = 10, mines = 35
            row = 41;
            col = 21;
            board = new String [row][col];

            StdOut.println("===============Medium-Mode===============");

            initBoard(board);
            drawBoard(board);

            

        } else if (mode == 2) {
            // Hard mode
            // row = 28, col = 13, mines = 75

            row = 57;
            col = 27;
            board = new String [row][col];

            StdOut.println("======================Hard-Mode======================");
            
            initBoard(board);
            drawBoard(board);

        } else {
            StdOut.println("Error: Unknown Mode.");
        }
    }

    public static String [][] initBoard(String [][] board) {

        // Insert corners

        board[0][0] = TOP_LEFT_CORNER;
        board[0][board[0].length - 1] = TOP_RIGHT_CORNER;
        board[board.length - 1][0] = BOTTOM_LEFT_CORNER;
        board[board.length - 1][board[0].length - 1] = BOTTOM_RIGHT_CORNER;

        // Insert horizontal boarders
        for (int i = 0; i < board.length; i += 2) {
            for (int j = 1; j < board[0].length; j += 2) {
                board[i][j] = H_BORDER;
            }
        }

        // Insert vertical boarders
        for (int i = 1; i < board.length; i += 2) {
            for (int j = 0; j < board[0].length; j += 2) {
                board[i][j] = V_BORDER;
            }
        }
        
        // Insert horizontal junctions
        for (int i = 0; i < board.length; i += 2) {
            for (int j = 2; j < board[0].length - 1; j += 2) {
                if (i == 0) {
                    board[i][j] = TOP_JUNCTION;
                } else if (i == board.length - 1) {
                    board[i][j] = BOTTOM_JUNCTION;
                }
            }
        }
        
        // Insert vertical junctions
        for (int i = 2; i < board.length - 1; i += 2) {
            for (int j = 0; j < board[0].length; j += 2) {
                if (j == 0) {
                    board[i][j] = LEFT_JUNCTION;
                } else if (j == board[0].length - 1) {
                    board[i][j] = RIGHT_JUNCTION;
                }
            }
        }
        

        // Insert intersections
        for (int i = 2; i < board.length - 1; i += 2) {
            for (int j = 2; j < board[0].length - 1; j += 2) {
                board[i][j] = INTERSECTION;
            }
        }

        // Insert closed spots
        for (int i = 1; i < board.length; i += 2) {
            for (int j = 1; j < board[0].length; j += 2) {
                board[i][j] = " " + CLOSED + " ";
            }
        }
        
        return board;
    }

    public static void drawBoard(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
