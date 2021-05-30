package com.chaos;

// https://leetcode-cn.com/problems/rectangle-area/

public class RectangleArea223 {
    int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        if (ax1 > bx2 || ax2 < bx1 || ay2 < by1 || ay1 > by2) {
            return area1 + area2;
        }

        int topX = Math.min(bx2, ax2);
        int topY = Math.min(by2, ay2);
        int bottomX = Math.max(bx1, ax1);
        int bottomY = Math.max(ay1, by1);
//        return area1 - (topX - bottomX) * (topY - bottomY) + area2;
        return area1 + area2 - (topX - bottomX) * (topY - bottomY);
    }
}
