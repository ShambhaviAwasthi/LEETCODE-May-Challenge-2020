# Shambhavi Awasthi
# LEETCODE MAY CHALLENGE
# Day 9 : Valid Square
# python solution: Binary Search Approach

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num<=0:
            return False
        if num==1:
            return True
        start=2
        end=num 
        while start<=end:
            mid=start+(end-start)//2
            if mid*mid == num:
                return True
            elif mid*mid>num:
                end=mid-1
            else:
                start=mid+1
        return False
        