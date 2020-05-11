package com.sylar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TransferZ {
    // 6 Z型变换
    public String convert(String s, int numRows) {
        if (numRows < 2){
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            rows.add(new StringBuilder());
        }

        int rowPos = 0;
        int directFlag = -1;
        for (char c : s.toCharArray()) {
            rows.get(rowPos).append(c);
            if (rowPos == 0 || rowPos == numRows - 1){
                directFlag = -directFlag;
            }
            rowPos += directFlag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows){
            res.append(row);
        }
        return res.toString();
    }
}
