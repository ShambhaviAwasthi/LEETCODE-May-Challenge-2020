# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# DAY 21: Count Square Submatrices with All Ones

class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        m=len(matrix);
        n=len(matrix[0]);
        for i in range(0,m-1):
            for j in range(0,n-1):
                matrix[i+1][j+1]*= min(matrix[i][j],matrix[i+1][j],matrix[i][j+1])+1
            
        return sum(map(sum,matrix))
        


