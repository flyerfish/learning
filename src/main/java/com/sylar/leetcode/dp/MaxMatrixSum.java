package com.sylar.leetcode.dp;

//https://leetcode-cn.com/problems/max-submatrix-lcci/solution/zhe-yao-cong-zui-da-zi-xu-he-shuo-qi-you-jian-dao-/
public class MaxMatrixSum {
	public int[] getMaxMatrix(int[][] matrix) {
		int[] ans = new int[4];// 保存最大子矩阵的左上角和右下角的行列坐标
		int rowCount = matrix.length;
		int colCount = matrix[0].length;
		int[] colSum = new int[colCount];// 记录当前i~j行组成大矩阵的每一列的和，将二维转化为一维
		int sum = 0;// 相当于dp[i],dp_i
		int maxSum = Integer.MIN_VALUE;// 记录最大值
		int beginRow = 0;
		int beginCol = 0;// 暂时记录左上角，相当于begin

		for (int i = 0; i < rowCount; i++) { // 以i为上边，从上而下扫描
			for (int k = 0; k < colCount; k++) {
				colSum[k] = 0; // 每次更换子矩形上边，就要清空b，重新计算每列的和
			}
			for (int j = i; j < rowCount; j++) { // 子矩阵的下边，从i到N-1，不断增加子矩阵的高
				// 一下就相当于求一次最大子序列和
				sum = 0;// 从头开始求dp
				for (int k = 0; k < colCount; k++) {
					colSum[k] += matrix[j][k];
					// 我们只是不断增加其高，也就是下移矩阵下边，所有这个矩阵每列的和只需要加上新加的哪一行的元素
					// 因为我们求dp[i]的时候只需要dp[i-1]和nums[i],所有在我们不断更新b数组时就可以求出当前位置的dp_i
					if (sum > 0) {
						sum += colSum[k];
					} else {
						sum = colSum[k];
						beginRow = i;// 自立门户，暂时保存其左上角
						beginCol = k;
					}
					if (sum > maxSum) {
						maxSum = sum;
						ans[0] = beginRow;// 更新答案
						ans[1] = beginCol;
						ans[2] = j;
						ans[3] = k;
					}
				}
			}
		}
		return ans;
	}
}
