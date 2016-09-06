public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet clSet = new HashSet();
        HashSet roSet = new HashSet();
        HashSet cubeSet = new HashSet();


        for (int i=0;i<9;i++){
            //judge
            clSet.clear();//i means ro
            roSet.clear();//i means cl
            cubeSet.clear();// i means turns
            for (int j=0;j<9;j++){
                //cl
                if (!clSet.add(board[j][i]) && board[j][i]!='.')return false;
                if (!roSet.add(board[i][j]) && board[i][j]!='.')return false;
            }
            int clPosStart = (i%3)*3;;
            int rowPosStart = i/3 * 3;
            for (int c=clPosStart;c<clPosStart+3;c++){
                for (int r=rowPosStart;r<rowPosStart+3;r++)
                    if (!cubeSet.add(board[c][r]) && board[c][r]!='.')return false;
            }
        }

        return true;
    }
}

/*
  逻辑简单  分别遍历即可
*/
