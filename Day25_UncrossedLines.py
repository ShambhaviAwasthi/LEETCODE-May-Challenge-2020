# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# DAY 25: Uncrossed Lines

class Solution:
    def maxUncrossedLines(self, A: List[int], B: List[int]) -> int:
        if len(A) ==0 or len(B)==0:
            return 0
        arr=[[0 for i in range(len(A)+1)]for j in range(len(B)+1)]
        for i in range(1,n+1):
            for j in range(1,m+1):
                if(B[i-1]==A[j-1]):
                    arr[i][j]=arr[i-1][j-1]+1
                else:
                    arr[i][j]=max(arr[i][j-1],arr[i-1][j])
        return arr[n][m];
        
        