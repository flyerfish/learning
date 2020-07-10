package com.sylar.leetcode.backatack;

import java.util.ArrayList;
import java.util.List;

public class Queens {
    private List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        List<StringBuilder> board = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append('.');
        }
        for (int i = 0; i < n; ++i) {
            board.add(new StringBuilder(sb));
        }
        backtrack(board, 0);
        return res;
    }

    void backtrack(List<StringBuilder> board, int row) {
        if (row == board.size()) {
            List<String> ls = new ArrayList<>();
            for (StringBuilder sb : board) {
                ls.add(sb.toString());
            }
            res.add(ls);
            return;
        }

        int n = board.get(row).length();
        for (int col = 0; col < n; col++) {
            // 排除不合法选择
            if (false == isValid(board, row, col)) {
                continue;
            }
            // 做选择
            board.get(row).setCharAt(col, 'Q');
            // 进入下一行决策
            backtrack(board, row + 1);
            // 撤销选择
            board.get(row).setCharAt(col, '.');
        }
    }

    private boolean isValid(List<StringBuilder> board, int row, int col) {
        int n = board.size();
        // 检查列是否有皇后互相冲突
        for (int i = 0; i < n; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }
}
