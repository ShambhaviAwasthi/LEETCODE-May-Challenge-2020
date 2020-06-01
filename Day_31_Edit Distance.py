# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# DAY 31: Edit Distance

class Solution:
    def editDistDP(self,str1, str2, m, n): 
        # Create a table to store results of subproblems 
        dp = [[0 for x in range(n + 1)] for x in range(m + 1)] 
        for i in range(m + 1): 
            for j in range(n + 1): 
                if i == 0: 
                    dp[i][j] = j    # Min. operations = j 
                elif j == 0: 
                    dp[i][j] = i    # Min. operations = i 
                elif str1[i-1] == str2[j-1]: 
                    dp[i][j] = dp[i-1][j-1] 
                else: 
                    dp[i][j] = 1 + min(dp[i][j-1],        # Insert 
                                       dp[i-1][j],        # Remove 
                                       dp[i-1][j-1])    # Replace 

        return dp[m][n] 
    
    def minDistance(self, str1: str, str2: str,) -> int:
        m=len(str1)
        n=len(str2)
        return self.editDistDP(str1,str2,m,n)