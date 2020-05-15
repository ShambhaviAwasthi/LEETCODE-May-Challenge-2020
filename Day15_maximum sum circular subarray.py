# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# DAY 15: MAXIMUM SUM CIRCULAR SUBARRAY


class Solution:
    def maxSubarraySum(self, A: List[int]) -> int:
        # Kadane Algorithm
        n = len(A) 
        max_so_far =0
        max_ending_here =0
        for i in range(0, n): 
            max_ending_here = max_ending_here + A[i] 
            if (max_ending_here < 0): 
                max_ending_here = 0
            if (max_so_far < max_ending_here): 
                max_so_far = max_ending_here 
        return max_so_far
    
        
    def maxSubarraySumCircular(self, A: List[int]) -> int:
        n = len(A) 
        # if all the elements of given array are negative return the largest negative element
        flag=0
        for i in range(0,n):
            if A[i]>=0:
                flag=1
                break
        if flag==0:
            B=sorted(A)  # sorting the list and return last element
            return B[n-1]
        else:
            
            max_kadane = self.maxSubarraySum(A)  # sum of subarray from Kadane algorithm
            max_wrap = 0    # finding sum by wrapping
            for i in range(0,n): 
                max_wrap += A[i] # finding total sum of array elements
                A[i] = -A[i]      # inverting element signs

            max_wrap = max_wrap + self.maxSubarraySum(A)  # subtract the sum of non contributing elements

            if max_wrap > max_kadane: # return maximum sum
                return max_wrap 
            else: 
                return max_kadane 

                    
        