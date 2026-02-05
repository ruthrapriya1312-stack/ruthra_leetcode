// Last updated: 05/02/2026, 10:03:41
class Solution {
    public int numRookCaptures(char[][] board) {

        int rookRow = 0;
        int rookColumn = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookColumn = j;
                    break;
                }
            }
        }

        int ans = 0;

        for (int j = rookColumn + 1 ; j < 8 ; j++) {
            if (board[rookRow][j] == 'B') break;
            else if (board[rookRow][j] == 'p') {
                ans++;
                break;
            }
        }

        for (int j = rookColumn - 1 ; j >= 0 ; j--) {
            if (board[rookRow][j] == 'B') break;
            else if (board[rookRow][j] == 'p') {
                ans++;
                break;
            }
        }

        for (int i = rookRow + 1 ; i < 8 ; i++) {
            if (board[i][rookColumn] == 'B') break;
            else if (board[i][rookColumn] == 'p') {
                ans++;
                break;
            }
        }

        for (int i = rookRow - 1 ; i >= 0 ; i--) {
            if (board[i][rookColumn] == 'B') break;
            else if (board[i][rookColumn] == 'p') {
                ans++;
                break;
            }
        }
        return ans;
    }
}